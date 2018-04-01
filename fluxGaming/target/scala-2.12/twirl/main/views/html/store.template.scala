
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object store extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],List[models.products.Product],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], products: List[models.products.Product], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Store", loginForm, user)/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""

    """),format.raw/*5.5*/("""<head>
        <link rel="stylesheet" href=""""),_display_(/*6.39*/routes/*6.45*/.Assets.versioned("stylesheets/reviews.css")),format.raw/*6.89*/("""">                
        <link rel="stylesheet" href=""""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("stylesheets/store.css")),format.raw/*7.87*/("""">                
    </head>
    
    <h1 style="text-align: center;">Store</h1>

    """),_display_(/*12.6*/if(flash.containsKey("error"))/*12.36*/{_display_(Seq[Any](format.raw/*12.37*/("""
        """),format.raw/*13.9*/("""<div class="alert alert-warning">
          """),_display_(/*14.12*/flash/*14.17*/.get("error")),format.raw/*14.30*/("""
    """),format.raw/*15.5*/("""</div>
    """)))}),format.raw/*16.6*/("""

    """),_display_(/*18.6*/for(p <- products) yield /*18.24*/{_display_(Seq[Any](format.raw/*18.25*/("""
      """),format.raw/*19.7*/("""<div class="col-md-3 col-sm-6">
        <div class="gradientBoxesWithOuterShadows">
            <!-- admin buttons -->
            """),_display_(/*22.14*/if(user != null)/*22.30*/{_display_(Seq[Any](format.raw/*22.31*/("""
              """),_display_(/*23.16*/if(user.getRole=="admin")/*23.41*/{_display_(Seq[Any](format.raw/*23.42*/("""
                  
                  """),format.raw/*25.19*/("""<img class="icon" src="/assets/images/misc/bin.png"/>
                  
                  <img class="icon" src="/assets/images/misc/edit.png"/>
                  
              """)))}),format.raw/*29.16*/("""
            """)))}),format.raw/*30.14*/("""

          """),format.raw/*32.11*/("""<div class="img-container">
              """),_display_(/*33.16*/if(p.getStock() <= 0)/*33.37*/{_display_(Seq[Any](format.raw/*33.38*/("""
                """),format.raw/*34.17*/("""<img class="top" src="/assets/images/misc/outOfStock.png"/>
              """)))}),format.raw/*35.16*/("""

              """),_display_(/*37.16*/if(env.resource("public/images/gamePictures/" + p.getId + "Item.jpg").isDefined)/*37.96*/ {_display_(Seq[Any](format.raw/*37.98*/("""
                """),format.raw/*38.17*/("""<img class="tile" src="/assets/images/gamePictures/"""),_display_(/*38.69*/(p.getId + "Item.jpg")),format.raw/*38.91*/(""""/>
              """)))}/*39.17*/else/*39.22*/{_display_(Seq[Any](format.raw/*39.23*/("""
                """),format.raw/*40.17*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
              """)))}),format.raw/*41.16*/("""
          """),format.raw/*42.11*/("""</div>
      
          <h3><u>"""),_display_(/*44.19*/p/*44.20*/.getName),format.raw/*44.28*/("""</u></h3>
          <h5>Price: €"""),_display_(/*45.24*/p/*45.25*/.getPrice),format.raw/*45.34*/("""</h5>

          """),_display_(/*47.12*/if(user != null)/*47.28*/{_display_(Seq[Any](format.raw/*47.29*/("""
            """),_display_(/*48.14*/if(user.getRole=="admin")/*48.39*/{_display_(Seq[Any](format.raw/*48.40*/("""
                """),format.raw/*49.17*/("""<p style="color:red;">Stock: """),_display_(/*49.47*/p/*49.48*/.getStock),format.raw/*49.57*/("""</p>
            """)))}),format.raw/*50.14*/("""
          """)))}),format.raw/*51.12*/("""

          """),format.raw/*53.11*/("""<a href=""""),_display_(/*53.21*/routes/*53.27*/.ShoppingController.addToCart(p.getId)),format.raw/*53.65*/("""">
            <div style="text-align:center;">
                    <button class="addToCartBtn" type="button">Add To Cart</button>       
            </div>
        </a>  

        </div> 
      </div>
    """)))}),format.raw/*61.6*/("""

""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],products:List[models.products.Product],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,products,env)

  def f:((models.User,Form[models.users.Login],List[models.products.Product],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,products,env) => apply(user,loginForm,products,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 01 12:09:02 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/store.scala.html
                  HASH: 61525b41a0bfd0de8a4d4756be1239a476cfdd4b
                  MATRIX: 1029->1|1247->126|1274->128|1312->158|1350->159|1382->165|1453->210|1467->216|1531->260|1614->317|1628->323|1690->365|1805->454|1844->484|1883->485|1919->494|1991->539|2005->544|2039->557|2071->562|2113->574|2146->581|2180->599|2219->600|2253->607|2412->739|2437->755|2476->756|2519->772|2553->797|2592->798|2658->836|2869->1016|2914->1030|2954->1042|3024->1085|3054->1106|3093->1107|3138->1124|3244->1199|3288->1216|3377->1296|3417->1298|3462->1315|3541->1367|3584->1389|3622->1409|3635->1414|3674->1415|3719->1432|3823->1505|3862->1516|3921->1548|3931->1549|3960->1557|4020->1590|4030->1591|4060->1600|4105->1618|4130->1634|4169->1635|4210->1649|4244->1674|4283->1675|4328->1692|4385->1722|4395->1723|4425->1732|4474->1750|4517->1762|4557->1774|4594->1784|4609->1790|4668->1828|4906->2036
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|49->18|49->18|49->18|50->19|53->22|53->22|53->22|54->23|54->23|54->23|56->25|60->29|61->30|63->32|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|72->41|73->42|75->44|75->44|75->44|76->45|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|81->50|82->51|84->53|84->53|84->53|84->53|92->61
                  -- GENERATED --
              */
          