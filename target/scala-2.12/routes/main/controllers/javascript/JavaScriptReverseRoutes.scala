// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/fluxGaming/conf/routes
// @DATE:Sun Apr 22 20:26:46 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:37
  class ReverseShoppingController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:44
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.cancelOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelOrder"})
        }
      """
    )
  
    // @LINE:43
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:42
    def addToCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.addToCart",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToCart/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0))})
        }
      """
    )
  
    // @LINE:37
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingController.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addProductSubmit"})
        }
      """
    )
  
    // @LINE:20
    def updateReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def addStock: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addStock",
      """
        function(id0,Stock1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addStock/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + _qS([(Stock1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("Stock", Stock1))])})
        }
      """
    )
  
    // @LINE:21
    def updateReviewSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateReviewSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateReviewSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:15
    def review: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.review",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "review/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:31
    def viewOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.viewOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrders"})
        }
      """
    )
  
    // @LINE:9
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit"})
        }
      """
    )
  
    // @LINE:17
    def store: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.store",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "store"})
          }
        
        }
      """
    )
  
    // @LINE:24
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:23
    def deleteReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.deleteReview",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteReview/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:54
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProduct/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:46
    def makeModerator: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.makeModerator",
      """
        function(username0,filter1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "moderators/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("username", username0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("filter", filter1))})
          }
        
        }
      """
    )
  
    // @LINE:30
    def basket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.basket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "basket"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:12
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:51
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addProduct"})
        }
      """
    )
  
    // @LINE:13
    def registerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.registerSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "registerSubmit"})
        }
      """
    )
  
    // @LINE:27
    def addReviewSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addReviewSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addReviewSubmit"})
        }
      """
    )
  
    // @LINE:18
    def salesReport: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.salesReport",
      """
        function(year0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salesReport/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("year", year0))})
        }
      """
    )
  
    // @LINE:7
    def reviews: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.reviews",
      """
        function(genre0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reviews" + _qS([(genre0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("genre", genre0)), (filter1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:55
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateProductSubmit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:26
    def addReview: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addReview",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addReview"})
        }
      """
    )
  
    // @LINE:33
    def moderators: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.moderators",
      """
        function(filter0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "moderators" + _qS([(filter0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("filter", filter0))])})
        }
      """
    )
  
    // @LINE:34
    def contacts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contacts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
