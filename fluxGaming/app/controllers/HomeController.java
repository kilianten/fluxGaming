package controllers;

import play.mvc.*;
import views.html.*;

public class HomeController extends Controller {


    public Result index() {
        return ok(views.html.index.render());
    }

    public Result reviews(){
        return ok(views.html.reviews.render());
    }

}
