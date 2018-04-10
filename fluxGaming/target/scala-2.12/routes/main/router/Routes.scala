// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/fluxGaming/fluxGaming/conf/routes
// @DATE:Tue Apr 10 17:35:04 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:31
  ShoppingController_2: controllers.ShoppingController,
  // @LINE:40
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:31
    ShoppingController_2: controllers.ShoppingController,
    // @LINE:40
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, ShoppingController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ShoppingController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reviews""", """controllers.HomeController.reviews(genre:Long ?= 0L, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.HomeController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.HomeController.review(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """stockReport""", """controllers.HomeController.stockReport"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salesReport""", """controllers.HomeController.salesReport"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReview/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReview(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReviewSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReviewSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteReview/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReview""", """controllers.HomeController.addReview"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReviewSubmit""", """controllers.HomeController.addReviewSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.HomeController.basket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingController.emptyBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingController.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingController.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToCart/""" + "$" + """id<[^/]+>""", """controllers.ShoppingController.addToCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_reviews1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reviews")))
  )
  private[this] lazy val controllers_HomeController_reviews1_invoker = createInvoker(
    HomeController_0.reviews(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "reviews",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """reviews""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_loginSubmit2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_HomeController_loginSubmit2_invoker = createInvoker(
    HomeController_0.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout3_invoker = createInvoker(
    HomeController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_review4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_review4_invoker = createInvoker(
    HomeController_0.review(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "review",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """review/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_store5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store5_invoker = createInvoker(
    HomeController_0.store,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "store",
      Nil,
      "GET",
      this.prefix + """store""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_stockReport6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("stockReport")))
  )
  private[this] lazy val controllers_HomeController_stockReport6_invoker = createInvoker(
    HomeController_0.stockReport,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "stockReport",
      Nil,
      "GET",
      this.prefix + """stockReport""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_salesReport7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salesReport")))
  )
  private[this] lazy val controllers_HomeController_salesReport7_invoker = createInvoker(
    HomeController_0.salesReport,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "salesReport",
      Nil,
      "GET",
      this.prefix + """salesReport""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_updateReview8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReview8_invoker = createInvoker(
    HomeController_0.updateReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_updateReviewSubmit9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReviewSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReviewSubmit9_invoker = createInvoker(
    HomeController_0.updateReviewSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateReviewSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateReviewSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_deleteReview10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteReview10_invoker = createInvoker(
    HomeController_0.deleteReview(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteReview",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteReview/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_deleteProduct11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct11_invoker = createInvoker(
    HomeController_0.deleteProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_addReview12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReview")))
  )
  private[this] lazy val controllers_HomeController_addReview12_invoker = createInvoker(
    HomeController_0.addReview,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReview",
      Nil,
      "GET",
      this.prefix + """addReview""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_addReviewSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReviewSubmit")))
  )
  private[this] lazy val controllers_HomeController_addReviewSubmit13_invoker = createInvoker(
    HomeController_0.addReviewSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addReviewSubmit",
      Nil,
      "POST",
      this.prefix + """addReviewSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_store14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store14_invoker = createInvoker(
    HomeController_0.store,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "store",
      Nil,
      "GET",
      this.prefix + """store""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_basket15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_HomeController_basket15_invoker = createInvoker(
    HomeController_0.basket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "basket",
      Nil,
      "GET",
      this.prefix + """basket""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingController_emptyBasket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingController_emptyBasket16_invoker = createInvoker(
    ShoppingController_2.emptyBasket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """basketFunctions""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingController_addOne17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_addOne17_invoker = createInvoker(
    ShoppingController_2.addOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ShoppingController_removeOne18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_removeOne18_invoker = createInvoker(
    ShoppingController_2.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingController_addToCart19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToCart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_addToCart19_invoker = createInvoker(
    ShoppingController_2.addToCart(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "addToCart",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToCart/""" + "$" + """id<[^/]+>""",
      """ShoppingController""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Assets_versioned20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned20_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_reviews1_route(params@_) =>
      call(params.fromQuery[Long]("genre", Some(0L)), params.fromQuery[String]("filter", Some(""))) { (genre, filter) =>
        controllers_HomeController_reviews1_invoker.call(HomeController_0.reviews(genre, filter))
      }
  
    // @LINE:9
    case controllers_HomeController_loginSubmit2_route(params@_) =>
      call { 
        controllers_HomeController_loginSubmit2_invoker.call(HomeController_0.loginSubmit)
      }
  
    // @LINE:10
    case controllers_HomeController_logout3_route(params@_) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_0.logout)
      }
  
    // @LINE:12
    case controllers_HomeController_review4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_review4_invoker.call(HomeController_0.review(id))
      }
  
    // @LINE:14
    case controllers_HomeController_store5_route(params@_) =>
      call { 
        controllers_HomeController_store5_invoker.call(HomeController_0.store)
      }
  
    // @LINE:15
    case controllers_HomeController_stockReport6_route(params@_) =>
      call { 
        controllers_HomeController_stockReport6_invoker.call(HomeController_0.stockReport)
      }
  
    // @LINE:16
    case controllers_HomeController_salesReport7_route(params@_) =>
      call { 
        controllers_HomeController_salesReport7_invoker.call(HomeController_0.salesReport)
      }
  
    // @LINE:18
    case controllers_HomeController_updateReview8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReview8_invoker.call(HomeController_0.updateReview(id))
      }
  
    // @LINE:19
    case controllers_HomeController_updateReviewSubmit9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReviewSubmit9_invoker.call(HomeController_0.updateReviewSubmit(id))
      }
  
    // @LINE:21
    case controllers_HomeController_deleteReview10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteReview10_invoker.call(HomeController_0.deleteReview(id))
      }
  
    // @LINE:22
    case controllers_HomeController_deleteProduct11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct11_invoker.call(HomeController_0.deleteProduct(id))
      }
  
    // @LINE:24
    case controllers_HomeController_addReview12_route(params@_) =>
      call { 
        controllers_HomeController_addReview12_invoker.call(HomeController_0.addReview)
      }
  
    // @LINE:25
    case controllers_HomeController_addReviewSubmit13_route(params@_) =>
      call { 
        controllers_HomeController_addReviewSubmit13_invoker.call(HomeController_0.addReviewSubmit)
      }
  
    // @LINE:27
    case controllers_HomeController_store14_route(params@_) =>
      call { 
        controllers_HomeController_store14_invoker.call(HomeController_0.store)
      }
  
    // @LINE:28
    case controllers_HomeController_basket15_route(params@_) =>
      call { 
        controllers_HomeController_basket15_invoker.call(HomeController_0.basket)
      }
  
    // @LINE:31
    case controllers_ShoppingController_emptyBasket16_route(params@_) =>
      call { 
        controllers_ShoppingController_emptyBasket16_invoker.call(ShoppingController_2.emptyBasket)
      }
  
    // @LINE:32
    case controllers_ShoppingController_addOne17_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_addOne17_invoker.call(ShoppingController_2.addOne(itemId))
      }
  
    // @LINE:33
    case controllers_ShoppingController_removeOne18_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_removeOne18_invoker.call(ShoppingController_2.removeOne(itemId))
      }
  
    // @LINE:36
    case controllers_ShoppingController_addToCart19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingController_addToCart19_invoker.call(ShoppingController_2.addToCart(id))
      }
  
    // @LINE:40
    case controllers_Assets_versioned20_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned20_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
