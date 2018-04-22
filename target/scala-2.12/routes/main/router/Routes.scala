// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/wdd/webapps/fluxGaming/conf/routes
// @DATE:Sun Apr 22 12:21:27 IST 2018
=======
// @SOURCE:/home/paul/Desktop/fluxGaming/conf/routes
// @DATE:Sat Apr 21 17:17:36 IST 2018
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0

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
  // @LINE:36
  ShoppingController_2: controllers.ShoppingController,
  // @LINE:58
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:36
    ShoppingController_2: controllers.ShoppingController,
    // @LINE:58
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerSubmit""", """controllers.HomeController.registerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """review/""" + "$" + """id<[^/]+>""", """controllers.HomeController.review(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """salesReport/""" + "$" + """year<[^/]+>""", """controllers.HomeController.salesReport(year:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReview/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReview(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateReviewSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateReviewSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteReview/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteReview(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReview""", """controllers.HomeController.addReview"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addReviewSubmit""", """controllers.HomeController.addReviewSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """store""", """controllers.HomeController.store"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """basket""", """controllers.HomeController.basket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrders""", """controllers.HomeController.viewOrders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """moderators""", """controllers.HomeController.moderators(filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingController.emptyBasket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingController.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingController.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToCart/""" + "$" + """id<[^/]+>""", """controllers.ShoppingController.addToCart(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingController.placeOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder""", """controllers.ShoppingController.cancelOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """moderators/""" + "$" + """username<[^/]+>/""" + "$" + """filter<[^/]+>""", """controllers.HomeController.makeModerator(username:String, filter:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """moderators/""" + "$" + """username<[^/]+>/""", """controllers.HomeController.makeModerator(username:String, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addStock/""" + "$" + """id<[^/]+>/""", """controllers.HomeController.addStock(id:Long, Stock:Int ?= 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProduct""", """controllers.HomeController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProductSubmit""", """controllers.HomeController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProduct/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProductSubmit(id:Long)"""),
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
  private[this] lazy val controllers_HomeController_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_HomeController_register4_invoker = createInvoker(
    HomeController_0.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_registerSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerSubmit")))
  )
  private[this] lazy val controllers_HomeController_registerSubmit5_invoker = createInvoker(
    HomeController_0.registerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "registerSubmit",
      Nil,
      "POST",
      this.prefix + """registerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_review6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("review/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_review6_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_HomeController_store7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store7_invoker = createInvoker(
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

  // @LINE:18
  private[this] lazy val controllers_HomeController_salesReport8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("salesReport/"), DynamicPart("year", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_salesReport8_invoker = createInvoker(
    HomeController_0.salesReport(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "salesReport",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """salesReport/""" + "$" + """year<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_updateReview9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReview9_invoker = createInvoker(
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

  // @LINE:21
  private[this] lazy val controllers_HomeController_updateReviewSubmit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateReviewSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateReviewSubmit10_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_HomeController_deleteReview11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteReview/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteReview11_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_HomeController_deleteProduct12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProduct12_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_HomeController_addReview13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReview")))
  )
  private[this] lazy val controllers_HomeController_addReview13_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_HomeController_addReviewSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addReviewSubmit")))
  )
  private[this] lazy val controllers_HomeController_addReviewSubmit14_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_HomeController_store15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("store")))
  )
  private[this] lazy val controllers_HomeController_store15_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_HomeController_basket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("basket")))
  )
  private[this] lazy val controllers_HomeController_basket16_invoker = createInvoker(
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
  private[this] lazy val controllers_HomeController_viewOrders17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrders")))
  )
  private[this] lazy val controllers_HomeController_viewOrders17_invoker = createInvoker(
    HomeController_0.viewOrders,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "viewOrders",
      Nil,
      "GET",
      this.prefix + """viewOrders""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_moderators18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moderators")))
  )
  private[this] lazy val controllers_HomeController_moderators18_invoker = createInvoker(
    HomeController_0.moderators(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "moderators",
      Seq(classOf[String]),
      "GET",
      this.prefix + """moderators""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingController_emptyBasket19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingController_emptyBasket19_invoker = createInvoker(
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

  // @LINE:37
  private[this] lazy val controllers_ShoppingController_addOne20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_addOne20_invoker = createInvoker(
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

  // @LINE:38
  private[this] lazy val controllers_ShoppingController_removeOne21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_removeOne21_invoker = createInvoker(
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

  // @LINE:41
  private[this] lazy val controllers_ShoppingController_addToCart22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToCart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingController_addToCart22_invoker = createInvoker(
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

  // @LINE:42
  private[this] lazy val controllers_ShoppingController_placeOrder23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingController_placeOrder23_invoker = createInvoker(
    ShoppingController_2.placeOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:44
<<<<<<< HEAD
  private[this] lazy val controllers_HomeController_makeModerator24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moderators/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("filter", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_makeModerator24_invoker = createInvoker(
=======
  private[this] lazy val controllers_ShoppingController_cancelOrder25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder")))
  )
  private[this] lazy val controllers_ShoppingController_cancelOrder25_invoker = createInvoker(
    ShoppingController_2.cancelOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingController",
      "cancelOrder",
      Nil,
      "GET",
      this.prefix + """cancelOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_HomeController_makeModerator26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moderators/"), DynamicPart("username", """[^/]+""",true), StaticPart("/"), DynamicPart("filter", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_makeModerator26_invoker = createInvoker(
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
    HomeController_0.makeModerator(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "makeModerator",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """moderators/""" + "$" + """username<[^/]+>/""" + "$" + """filter<[^/]+>""",
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:45
  private[this] lazy val controllers_HomeController_makeModerator25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moderators/"), DynamicPart("username", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_HomeController_makeModerator25_invoker = createInvoker(
=======
  // @LINE:47
  private[this] lazy val controllers_HomeController_makeModerator27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("moderators/"), DynamicPart("username", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_HomeController_makeModerator27_invoker = createInvoker(
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
    HomeController_0.makeModerator(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "makeModerator",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """moderators/""" + "$" + """username<[^/]+>/""",
      """""",
      Seq()
    )
  )

<<<<<<< HEAD
  // @LINE:47
  private[this] lazy val controllers_HomeController_addStock26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addStock/"), DynamicPart("id", """[^/]+""",true), StaticPart("/")))
  )
  private[this] lazy val controllers_HomeController_addStock26_invoker = createInvoker(
    HomeController_0.addStock(fakeValue[Long], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addStock",
      Seq(classOf[Long], classOf[Int]),
      "GET",
      this.prefix + """addStock/""" + "$" + """id<[^/]+>/""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HomeController_addProduct27_route = Route("GET",
=======
  // @LINE:50
  private[this] lazy val controllers_HomeController_addProduct28_route = Route("GET",
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProduct")))
  )
  private[this] lazy val controllers_HomeController_addProduct28_invoker = createInvoker(
    HomeController_0.addProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProduct",
      Nil,
      "GET",
      this.prefix + """addProduct""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_HomeController_addProductSubmit29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProductSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProductSubmit29_invoker = createInvoker(
    HomeController_0.addProductSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProductSubmit",
      Nil,
      "POST",
      this.prefix + """addProductSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_HomeController_updateProduct30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProduct30_invoker = createInvoker(
    HomeController_0.updateProduct(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProduct/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_HomeController_updateProductSubmit31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProductSubmit31_invoker = createInvoker(
    HomeController_0.updateProductSubmit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """updateProductSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Assets_versioned32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned32_invoker = createInvoker(
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
    case controllers_HomeController_register4_route(params@_) =>
      call { 
        controllers_HomeController_register4_invoker.call(HomeController_0.register)
      }
  
    // @LINE:13
    case controllers_HomeController_registerSubmit5_route(params@_) =>
      call { 
        controllers_HomeController_registerSubmit5_invoker.call(HomeController_0.registerSubmit)
      }
  
    // @LINE:15
    case controllers_HomeController_review6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_review6_invoker.call(HomeController_0.review(id))
      }
  
    // @LINE:17
    case controllers_HomeController_store7_route(params@_) =>
      call { 
        controllers_HomeController_store7_invoker.call(HomeController_0.store)
      }
  
    // @LINE:18
    case controllers_HomeController_salesReport8_route(params@_) =>
      call(params.fromPath[Integer]("year", None)) { (year) =>
        controllers_HomeController_salesReport8_invoker.call(HomeController_0.salesReport(year))
      }
  
    // @LINE:20
    case controllers_HomeController_updateReview9_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReview9_invoker.call(HomeController_0.updateReview(id))
      }
  
    // @LINE:21
    case controllers_HomeController_updateReviewSubmit10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateReviewSubmit10_invoker.call(HomeController_0.updateReviewSubmit(id))
      }
  
    // @LINE:23
    case controllers_HomeController_deleteReview11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteReview11_invoker.call(HomeController_0.deleteReview(id))
      }
  
    // @LINE:24
    case controllers_HomeController_deleteProduct12_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProduct12_invoker.call(HomeController_0.deleteProduct(id))
      }
  
    // @LINE:26
    case controllers_HomeController_addReview13_route(params@_) =>
      call { 
        controllers_HomeController_addReview13_invoker.call(HomeController_0.addReview)
      }
  
    // @LINE:27
    case controllers_HomeController_addReviewSubmit14_route(params@_) =>
      call { 
        controllers_HomeController_addReviewSubmit14_invoker.call(HomeController_0.addReviewSubmit)
      }
  
    // @LINE:29
    case controllers_HomeController_store15_route(params@_) =>
      call { 
        controllers_HomeController_store15_invoker.call(HomeController_0.store)
      }
  
    // @LINE:30
    case controllers_HomeController_basket16_route(params@_) =>
      call { 
        controllers_HomeController_basket16_invoker.call(HomeController_0.basket)
      }
  
    // @LINE:31
    case controllers_HomeController_viewOrders17_route(params@_) =>
      call { 
        controllers_HomeController_viewOrders17_invoker.call(HomeController_0.viewOrders)
      }
  
    // @LINE:33
    case controllers_HomeController_moderators18_route(params@_) =>
      call(params.fromQuery[String]("filter", Some(""))) { (filter) =>
        controllers_HomeController_moderators18_invoker.call(HomeController_0.moderators(filter))
      }
  
    // @LINE:36
    case controllers_ShoppingController_emptyBasket19_route(params@_) =>
      call { 
        controllers_ShoppingController_emptyBasket19_invoker.call(ShoppingController_2.emptyBasket)
      }
  
    // @LINE:37
    case controllers_ShoppingController_addOne20_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_addOne20_invoker.call(ShoppingController_2.addOne(itemId))
      }
  
    // @LINE:38
    case controllers_ShoppingController_removeOne21_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingController_removeOne21_invoker.call(ShoppingController_2.removeOne(itemId))
      }
  
    // @LINE:41
    case controllers_ShoppingController_addToCart22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingController_addToCart22_invoker.call(ShoppingController_2.addToCart(id))
      }
  
    // @LINE:42
    case controllers_ShoppingController_placeOrder23_route(params@_) =>
      call { 
        controllers_ShoppingController_placeOrder23_invoker.call(ShoppingController_2.placeOrder)
      }
  
    // @LINE:44
    case controllers_HomeController_makeModerator24_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("filter", None)) { (username, filter) =>
        controllers_HomeController_makeModerator24_invoker.call(HomeController_0.makeModerator(username, filter))
      }
  
<<<<<<< HEAD
    // @LINE:45
    case controllers_HomeController_makeModerator25_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromQuery[String]("filter", Some(""))) { (username, filter) =>
        controllers_HomeController_makeModerator25_invoker.call(HomeController_0.makeModerator(username, filter))
      }
  
    // @LINE:47
    case controllers_HomeController_addStock26_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Int]("Stock", Some(1))) { (id, Stock) =>
        controllers_HomeController_addStock26_invoker.call(HomeController_0.addStock(id, Stock))
=======
    // @LINE:44
    case controllers_ShoppingController_cancelOrder25_route(params@_) =>
      call { 
        controllers_ShoppingController_cancelOrder25_invoker.call(ShoppingController_2.cancelOrder)
      }
  
    // @LINE:46
    case controllers_HomeController_makeModerator26_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromPath[String]("filter", None)) { (username, filter) =>
        controllers_HomeController_makeModerator26_invoker.call(HomeController_0.makeModerator(username, filter))
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
      }
  
    // @LINE:47
    case controllers_HomeController_makeModerator27_route(params@_) =>
      call(params.fromPath[String]("username", None), params.fromQuery[String]("filter", Some(""))) { (username, filter) =>
        controllers_HomeController_makeModerator27_invoker.call(HomeController_0.makeModerator(username, filter))
      }
  
    // @LINE:50
    case controllers_HomeController_addProduct28_route(params@_) =>
      call { 
        controllers_HomeController_addProduct28_invoker.call(HomeController_0.addProduct)
      }
  
    // @LINE:51
    case controllers_HomeController_addProductSubmit29_route(params@_) =>
      call { 
        controllers_HomeController_addProductSubmit29_invoker.call(HomeController_0.addProductSubmit)
      }
  
    // @LINE:53
    case controllers_HomeController_updateProduct30_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProduct30_invoker.call(HomeController_0.updateProduct(id))
      }
  
    // @LINE:54
    case controllers_HomeController_updateProductSubmit31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProductSubmit31_invoker.call(HomeController_0.updateProductSubmit(id))
      }
  
    // @LINE:58
    case controllers_Assets_versioned32_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned32_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
