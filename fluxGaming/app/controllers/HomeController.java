package controllers;

import play.mvc.*;
import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import models.*;
import models.users.*;

import java.util.List;
import java.util.ArrayList;
import javax.inject.Inject;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

public class HomeController extends Controller {
    
    private FormFactory formFactory;

    private Environment env;

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

    public Result reviews(Long genre){

        List<Review> reviewList = null;

        List<Genre> genreList = Genre.findAll();


        if(genre == 0){
            reviewList = Review.findAllOrdered();
        }
        else{
            reviewList = Genre.find.ref(genre).getReviews();
        }

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(reviews.render(User.getUserById(session().get("username")), loginForm, reviewList, env, genreList));
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

                for(Long genre : newReview.getGenreSelect()){
                    newReview.genres.add(Genre.find.byId(genre));
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

        return redirect(controllers.routes.HomeController.reviews(0));
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
        
        return redirect(routes.HomeController.index());
    }

}
