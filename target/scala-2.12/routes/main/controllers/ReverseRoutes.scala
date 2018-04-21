// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/Desktop/fluxGaming/conf/routes
// @DATE:Sat Apr 21 17:17:36 IST 2018

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

  
    // @LINE:51
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProductSubmit")
    }
  
    // @LINE:21
    def updateReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:22
    def updateReviewSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateReviewSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:15
    def review(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "review/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:32
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
  
    // @LINE:18
    def stockReport(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "stockReport")
    }
  
    // @LINE:25
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def deleteReview(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteReview/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:53
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
  
    // @LINE:31
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
  
    // @LINE:50
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProduct")
    }
  
    // @LINE:19
    def salesReport(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "salesReport")
    }
  
    // @LINE:13
    def registerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "registerSubmit")
    }
  
    // @LINE:28
    def addReviewSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addReviewSubmit")
    }
  
    // @LINE:7
    def reviews(genre:Long = 0L, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reviews" + play.core.routing.queryString(List(if(genre == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("genre", genre)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:54
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:27
    def addReview(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addReview")
    }
  
    // @LINE:34
    def moderators(filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "moderators" + play.core.routing.queryString(List(if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }

  // @LINE:58
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
