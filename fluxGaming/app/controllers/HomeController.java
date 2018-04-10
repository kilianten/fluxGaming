package controllers;

import play.mvc.*;
import views.html.*;
import views.html.admin.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import models.*;
import models.users.*;
import models.products.*;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

public class HomeController extends Controller {
    
    private FormFactory formFactory;

    private Environment env;

    public Form<Login> getLogin(){
        return formFactory.form(Login.class);
    }

    public User getUser(){
        return User.getUserById(session().get("username"));
    }

    @Inject
    public HomeController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result index() {
        List<Review> reviews = Review.findRecent();

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(index.render(User.getUserById(session().get("username")), loginForm, reviews, env));
    }

    public Result reviews(Long genre, String filter){

        List<Review> reviewList = null;

        List<Genre> genreList = Genre.findAll();


        if(genre == 0){
            reviewList = Review.findAllOrdered(filter);
        }
        else{
            reviewList = Review.findFilter(genre, filter);
        }

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(reviews.render(User.getUserById(session().get("username")), loginForm, reviewList, env, genreList, genre, filter));
    }

    public Result loginSubmit(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()){
            List<Review> reviews = Review.findRecent();
            return badRequest(index.render(User.getUserById(session().get("username")), loginForm, reviews, env));
        } else {
            session().clear();
            session("username", loginForm.get().getUsername());
        }

        return redirect(controllers.routes.HomeController.index());
    }

    public Result logout(){
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addReview(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        Form<Review> reviewForm = formFactory.form(Review.class);

        return ok(addReview.render(User.getUserById(session().get("username")), loginForm, reviewForm));
    }

    public Result addReviewSubmit(){

        String saveImageMsg;

        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        FilePart tileImage = data.getFile("uploadTile");
        
        if(newReviewForm.hasErrors()){
            return badRequest(addReview.render(User.getUserById(session().get("username")), loginForm, newReviewForm));
        }
        else{
            Review newReview = newReviewForm.get();
            newReview.save();

            if(newReview.getGenreSelect() != null){
                for(Long genre : newReview.getGenreSelect()){
                    newReview.getGenres().add(Genre.find.byId(genre));
                }
            }
            
            newReview.update();

            saveFile(Long.toString(newReview.getId()), image);
            saveFile(Long.toString(newReview.getId()) + "Tile", tileImage);

            flash("success", "Review " + newReview.getName() + " was added");
            return redirect(controllers.routes.HomeController.index());
        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateReview(Long id){

        Review r;
        Form<Review> reviewForm;
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        try{
            r = Review.find.byId(id);
            reviewForm = formFactory.form(Review.class).fill(r);
        } catch (Exception ex){
            return badRequest("Error");
        }
        return ok(updateReview.render(User.getUserById(session().get("username")), loginForm, reviewForm, id));
    }

    public Result updateReviewSubmit(Long id){

        Form<Review> updateReviewForm = formFactory.form(Review.class).bindFromRequest();
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        FilePart tileImage = data.getFile("uploadTile");

        if(updateReviewForm.hasErrors()){
            return badRequest(updateReview.render(User.getUserById(session().get("username")), loginForm, updateReviewForm, id));
        } else {
            Review r = updateReviewForm.get();
            r.setId(id);

            List<Genre> newGenres = new ArrayList<Genre>();
                for(Long genre : r.getGenreSelect()){
                newGenres.add(Genre.find.byId(genre));
            }
            
            r.genres = newGenres;
            
            r.update();
            saveFile(Long.toString(r.getId()), image);
            saveFile(Long.toString(r.getId()) + "Tile", tileImage);

            flash("success", "Review " + r.getName() + " has been updated" );
        }

        return redirect(routes.HomeController.review(id));
    }

    public String saveFile(String id, FilePart<File> uploaded){
        String mimeType = uploaded.getContentType();
        if(uploaded !=null){
            if(mimeType.startsWith("image/")){
              String fileName = uploaded.getFilename();
              String extension = "";
              int i = fileName.lastIndexOf('.');
              if(i >= 0){
                  extension = fileName.substring(i + 1);
              }

              File file = uploaded.getFile();
              File dir = new File("public/images/gamePictures");
              if(!dir.exists()){
                  dir.mkdirs();
              }
              if(file.renameTo(new File("public/images/gamePictures", id + "." + extension))){
                  return "/ file uploaded";
              }
              else
              {
                  return "/ file upload failed";
              }
            }
        }
        return "/ no file";
    }

    public Result review(Long id){

        Review r = Review.find.byId(id);

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(review.render(User.getUserById(session().get("username")), loginForm, r, env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteReview(Long id) {
        Review.find.ref(id).delete();

        flash("success", "Review has been deleted");
        
        return redirect(routes.HomeController.reviews(0, null));
    }

    public Result store() {

        Form<Login> loginForm = formFactory.form(Login.class);

        List<Product> productList = Product.findAll();
        
        return ok(store.render(User.getUserById(session().get("username")), loginForm, productList, env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result stockReport(){
        Form<Login> loginForm = formFactory.form(Login.class);

        List<Product> productList = Product.findAll();

        return ok(stockReport.render(User.getUserById(session().get("username")), loginForm, productList, env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result salesReport(){
        Form<Login> loginForm = formFactory.form(Login.class);

        List<Product> productList = Product.findAll();

        return ok(salesReport.render(User.getUserById(session().get("username")), loginForm, productList, env));
    }

    @Security.Authenticated(Secured.class)
    public Result basket(){
        return ok(basket.render(getUser(), getLogin()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");
        
        return redirect(routes.HomeController.store());
    }

}
