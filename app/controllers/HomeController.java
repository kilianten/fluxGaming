package controllers;

import play.mvc.*;
import views.html.*;
import views.html.admin.*;
import views.html.mod.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import models.*;
import models.users.*;
import models.products.*;
import models.shopping.*;


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

        return ok(index.render(getUser(), getLogin(), reviews, env));
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

        return ok(reviews.render(getUser(), getLogin(), reviewList, env, genreList, genre, filter));
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
    @With(AuthModerator.class)
    public Result addReview(){

        Form<Review> reviewForm = formFactory.form(Review.class);

        return ok(addReview.render(getUser(), getLogin(), reviewForm));
    }

    public Result addReviewSubmit(){

        String saveImageMsg;

        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();
        // DynamicForm  requestData = formFactory.form().bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();
        // String lastname = requestData.get("lastname");

        FilePart image = data.getFile("upload");
        FilePart tileImage = data.getFile("uploadTile");
        
        if(newReviewForm.hasErrors()){
            return badRequest(addReview.render(getUser(), getLogin(), newReviewForm));
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
            // return ok(lastname);
            return redirect(controllers.routes.HomeController.index());
        }
    }

    @Security.Authenticated(Secured.class)
    @With(AuthModerator.class)
    @Transactional
    public Result updateReview(Long id){

        Review r;
        Form<Review> reviewForm;

        try{
            r = Review.find.byId(id);
            reviewForm = formFactory.form(Review.class).fill(r);
        } catch (Exception ex){
            return badRequest("Error");
        }
        return ok(updateReview.render(getUser(), getLogin(), reviewForm, id));
    }

    public Result updateReviewSubmit(Long id){

        Form<Review> updateReviewForm = formFactory.form(Review.class).bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        FilePart tileImage = data.getFile("uploadTile");

        if(updateReviewForm.hasErrors()){
            return badRequest(updateReview.render(getUser(), getLogin(), updateReviewForm, id));
        } else {
            Review r = updateReviewForm.get();
            r.setId(id);

            List<Genre> newGenres = new ArrayList<Genre>();
                for(Long genre : r.getGenreSelect()){
                newGenres.add(Genre.find.byId(genre));
            }
            
            r.setGenres(newGenres);
            
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
              if(id.indexOf("product") != -1){
                File dir = new File("public/images/products");
                if(!dir.exists()){
                    dir.mkdirs();
                }
                if(file.renameTo(new File("public/images/products", id + "." + extension))){
                    return "/ file uploaded";
                }
                else
                {
                    return "/ file upload failed";
                }
              } else {
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
        }
        return "/ no file";
    }

    public Result review(Long id){

        Review r = Review.find.byId(id);

        return ok(review.render(getUser(), getLogin(), r, env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthModerator.class)
    @Transactional
    public Result deleteReview(Long id) {
        Review.find.ref(id).delete();

        flash("success", "Review has been deleted");
        
        return redirect(routes.HomeController.reviews(0, null));
    }

    public Result store() {

        List<Product> productList = Product.findAll();
        
        return ok(store.render(getUser(), getLogin(), productList, env));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result stockReport(){

        List<Product> productList = Product.findAllStockOrder();

        return ok(stockReport.render(getUser(), getLogin(), productList, env));
    }
    

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result salesReport(){

        List<Product> productList = Product.findAll();

        return ok(salesReport.render(getUser(), getLogin(), productList, env));
    }

    @Security.Authenticated(Secured.class)
    public Result basket(){
        return ok(basket.render(getUser(), getLogin()));
    }

    @Security.Authenticated(Secured.class)
    public Result viewOrders(){
        return ok(viewOrders.render(getUser(), getLogin(), ShopOrder.findAll()));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProduct(Long id) {
        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");
        
        return redirect(routes.HomeController.store());
    }

    public Result register(){
        session().clear();

        Form<Register> registerForm = formFactory.form(Register.class);

        return ok(register.render(getUser(), getLogin(), registerForm));
    }

    public Result registerSubmit(){
        session().clear();
        Form<Register> registerForm = formFactory.form(Register.class).bindFromRequest();

        if(registerForm.hasErrors()){
            
            return badRequest(register.render(getUser(), getLogin(), registerForm));
        } else {
            Register r = registerForm.get();
            User newUser = new User(r.getUsername(), "", r.getEmail(), r.getPassword(), new Basket());
            newUser.save();
        }

        return redirect(controllers.routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result moderators(String filter){

        List<User> users = User.findUser(filter);
        List<User> mods = Moderator.findAll();

        return ok(moderators.render(getUser(), getLogin(), users, filter, mods));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result makeModerator(String username, String filter) {

        User u = User.getUserById(username);

        if(u.getRole().equals("mod")){
            u.setRole("user");
            u.update();
        }
        else if(u.getRole().equals("user")){
            u.setRole("mod");
            u.update();
        }
        
        return redirect(controllers.routes.HomeController.moderators(filter));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProduct(){

        Form<Product> productForm = formFactory.form(Product.class);

        return ok(addProduct.render(getUser(), getLogin(), productForm));
    }

    public Result addProductSubmit(){

        String saveImageMsg;

        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();

        FilePart image = data.getFile("upload");
        
        if(newProductForm.hasErrors()){
            return badRequest(addProduct.render(getUser(), getLogin(), newProductForm));
        }
        else{
            Product newProduct = newProductForm.get();
            newProduct.save();

            saveFile(Long.toString(newProduct.getId()) + "product", image);

            flash("success", "product " + newProduct.getName() + " was added");
            // return ok(lastname);
            return redirect(controllers.routes.HomeController.index());
        }
    }
   
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProduct(Long id){

        Product p;
        Form<Product> productForm;

        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch (Exception ex){
            return badRequest("Error");
        }
        return ok(updateProduct.render(getUser(), getLogin(), productForm, id));
    }

    public Result updateProductSubmit(Long id){

        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        if(updateProductForm.hasErrors()){
            return badRequest(updateProduct.render(getUser(), getLogin(), updateProductForm, id));
        } else {
            Product p = updateProductForm.get();
            p.setId(id);
           
            p.update();

            saveFile(Long.toString(p.getId()) + "product", image);

            flash("success", "Product " + p.getName() + " has been updated" );
        }

        return redirect(routes.HomeController.store());
    }

}
