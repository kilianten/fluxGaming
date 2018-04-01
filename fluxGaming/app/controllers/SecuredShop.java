package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;
import models.users.*;

public class SecuredShop extends Security.Authenticator{

    @Override
    public String getUsername(Context ctx){
      return ctx.session().get("username");
    }

    @Override
    public Result onUnauthorized(Context ctx){
        ctx.flash().put("error", "Please log-in to use store features");
        return redirect(controllers.routes.HomeController.store());
    }

}