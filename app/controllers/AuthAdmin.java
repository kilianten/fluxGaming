package controllers;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;
import models.*;

public class AuthAdmin extends Action.Simple{

    public CompletionStage<Result> call(Http.Context ctx){

      String username = ctx.session().get("username");
      if(username != null){
        User u = User.getUserById(username);
        if("admin".equals(u.getRole())){
            return delegate.call(ctx);
        }
      }
      ctx.flash().put("error", "Admin Login Required.");
      return CompletableFuture.completedFuture(redirect(routes.HomeController.index()));  
    }
}