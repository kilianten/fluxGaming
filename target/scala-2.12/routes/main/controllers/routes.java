// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/wdd/webapps/fluxGaming/conf/routes
// @DATE:Sun Apr 22 12:21:27 IST 2018
=======
// @SOURCE:/home/paul/Desktop/fluxGaming/conf/routes
// @DATE:Sat Apr 21 17:17:36 IST 2018
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseShoppingController ShoppingController = new controllers.ReverseShoppingController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseShoppingController ShoppingController = new controllers.javascript.ReverseShoppingController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
