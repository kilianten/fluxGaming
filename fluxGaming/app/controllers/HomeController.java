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

public class HomeController extends Controller {
    
    private FormFactory formFactory;

    private Environment env;

    @Inject
    public HomeController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result index() {

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(index.render(User.getUserById(session().get("username")), loginForm));
    }

    public Result reviews(){

        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(reviews.render(User.getUserById(session().get("username")), loginForm));
    }

    public Result loginSubmit(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if(loginForm.hasErrors()){
            return badRequest(index.render(User.getUserById(session().get("username")), loginForm));
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
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        Form<Review> newReviewForm = formFactory.form(Review.class).bindFromRequest();

        if(newReviewForm.hasErrors()){
            return badRequest(addReview.render(User.getUserById(session().get("username")), loginForm, newReviewForm));
        }
        else{
            Review newReview = newReviewForm.get();
            newReview.save();
            flash("success", "Review " + newReview.getName() + " was added");
            return redirect(controllers.routes.HomeController.index());
        }
    }

}
