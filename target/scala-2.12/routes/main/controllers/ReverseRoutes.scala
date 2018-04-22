// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/fluxGaming/conf/routes
// @DATE:Sun Apr 22 20:26:46 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:37
  class ReverseShoppingController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def addOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:44
    def cancelOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder")
    }
  
    // @LINE:43
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:42
    def addToCart(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToCart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:37
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:20
    def updateReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:49
    def addStock(id:Long, Stock:Int = 1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addStock/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.queryString(List(if(Stock == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("Stock", Stock)))))
    }
  
    // @LINE:21
    def updateReviewSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateReviewSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def review(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "review/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def viewOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:9
    def loginSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:17
    def store(): Call = {
    
      () match {
      
        // @LINE:17
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "store")
      
      }
    
    }
  
    // @LINE:24
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:23
    def deleteReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:54
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:46
    def makeModerator(username:String, filter:String): Call = {
    
      (username: @unchecked, filter: @unchecked) match {
      
        // @LINE:46
        case (username, filter)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "moderators/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("username", username)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("filter", filter)))
      
      }
    
    }
  
    // @LINE:30
    def basket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "basket")
    }
  
    // @LINE:10
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:12
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:51
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProduct")
    }
  
    // @LINE:13
    def registerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "registerSubmit")
    }
  
    // @LINE:27
    def addReviewSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addReviewSubmit")
    }
  
    // @LINE:18
    def salesReport(year:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "salesReport/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("year", year)))
    }
  
    // @LINE:7
    def reviews(genre:Long = 0L, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews" + play.core.routing.queryString(List(if(genre == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("genre", genre)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:55
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:26
    def addReview(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addReview")
    }
  
    // @LINE:33
    def moderators(filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "moderators" + play.core.routing.queryString(List(if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:34
    def contacts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contacts")
    }
  
  }

  // @LINE:59
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
