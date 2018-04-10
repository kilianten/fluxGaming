
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


    """),_display_(/*19.6*/if(user != null)/*19.22*/{_display_(Seq[Any](format.raw/*19.23*/("""
      """),_display_(/*20.8*/if(!user.getBasket().getBasketItems().isEmpty)/*20.54*/{_display_(Seq[Any](format.raw/*20.55*/("""
        """),format.raw/*21.9*/("""<a href="/basket">
        <div class="basket-container">
        <img class="basket" src="/assets/images/misc/basket.png"/>
        
        <p class="number">"""),_display_(/*25.28*/user/*25.32*/.getBasket.getCount),format.raw/*25.51*/("""</p>
        </div>
        </a>
      """)))}),format.raw/*28.8*/("""
    """)))}),format.raw/*29.6*/("""

    """),_display_(/*31.6*/for(p <- products) yield /*31.24*/{_display_(Seq[Any](format.raw/*31.25*/("""
      """),format.raw/*32.7*/("""<div class="col-md-3 col-sm-6">
        <div class="gradientBoxesWithOuterShadows">
            <!-- admin buttons -->
            """),_display_(/*35.14*/if(user != null)/*35.30*/{_display_(Seq[Any](format.raw/*35.31*/("""
              """),_display_(/*36.16*/if(user.getRole=="admin")/*36.41*/{_display_(Seq[Any](format.raw/*36.42*/("""
                """),format.raw/*37.17*/("""<a href=""""),_display_(/*37.27*/routes/*37.33*/.HomeController.deleteProduct(p.getId)),format.raw/*37.71*/(""""> 
                  <img class="icons" src="/assets/images/misc/bin.png">
                </a>
                  <img class="icons" src="/assets/images/misc/edit.png">
                

              """)))}),format.raw/*43.16*/("""
            """)))}),format.raw/*44.14*/("""

          """),format.raw/*46.11*/("""<div class="img-container">
              """),_display_(/*47.16*/if(p.getStock() <= 0)/*47.37*/{_display_(Seq[Any](format.raw/*47.38*/("""
                """),format.raw/*48.17*/("""<img class="top" src="/assets/images/misc/outOfStock.png"/>
              """)))}),format.raw/*49.16*/("""

              """),_display_(/*51.16*/if(env.resource("public/images/products/" + p.getId + ".jpg").isDefined)/*51.88*/ {_display_(Seq[Any](format.raw/*51.90*/("""
                """),format.raw/*52.17*/("""<img class="tile" src="/assets/images/products/"""),_display_(/*52.65*/(p.getId + ".jpg")),format.raw/*52.83*/(""""/>
              """)))}/*53.17*/else/*53.22*/{_display_(Seq[Any](format.raw/*53.23*/("""
                """),format.raw/*54.17*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
              """)))}),format.raw/*55.16*/("""
          """),format.raw/*56.11*/("""</div>
      
          <h3><u>"""),_display_(/*58.19*/p/*58.20*/.getName),format.raw/*58.28*/("""</u></h3>
          <h5>Price: €"""),_display_(/*59.24*/p/*59.25*/.getPrice),format.raw/*59.34*/("""</h5>

          """),_display_(/*61.12*/if(user != null)/*61.28*/{_display_(Seq[Any](format.raw/*61.29*/("""
            """),_display_(/*62.14*/if(user.getRole=="admin")/*62.39*/{_display_(Seq[Any](format.raw/*62.40*/("""
                """),format.raw/*63.17*/("""<p style="color:red;">Stock: """),_display_(/*63.47*/p/*63.48*/.getStock),format.raw/*63.57*/("""</p>
            """)))}),format.raw/*64.14*/("""
          """)))}),format.raw/*65.12*/("""

          """),format.raw/*67.11*/("""<a href=""""),_display_(/*67.21*/routes/*67.27*/.ShoppingController.addToCart(p.getId)),format.raw/*67.65*/("""">
            <div style="text-align:center;">
                    <button class="addToCartBtn" type="button">Add To Cart</button>       
            </div>
          </a>  

        </div> 
      </div>
    """)))}),format.raw/*75.6*/("""

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
                  DATE: Tue Apr 10 17:58:48 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/store.scala.html
                  HASH: 0c9d344477c1b14cf03c1911a4a31edeaa03d3d4
                  MATRIX: 1029->1|1247->126|1274->128|1312->158|1350->159|1382->165|1453->210|1467->216|1531->260|1614->317|1628->323|1690->365|1805->454|1844->484|1883->485|1919->494|1991->539|2005->544|2039->557|2071->562|2113->574|2147->582|2172->598|2211->599|2245->607|2300->653|2339->654|2375->663|2563->824|2576->828|2616->847|2686->887|2722->893|2755->900|2789->918|2828->919|2862->926|3021->1058|3046->1074|3085->1075|3128->1091|3162->1116|3201->1117|3246->1134|3283->1144|3298->1150|3357->1188|3591->1391|3636->1405|3676->1417|3746->1460|3776->1481|3815->1482|3860->1499|3966->1574|4010->1591|4091->1663|4131->1665|4176->1682|4251->1730|4290->1748|4328->1768|4341->1773|4380->1774|4425->1791|4529->1864|4568->1875|4627->1907|4637->1908|4666->1916|4726->1949|4736->1950|4766->1959|4811->1977|4836->1993|4875->1994|4916->2008|4950->2033|4989->2034|5034->2051|5091->2081|5101->2082|5131->2091|5180->2109|5223->2121|5263->2133|5300->2143|5315->2149|5374->2187|5614->2397
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|56->25|56->25|56->25|59->28|60->29|62->31|62->31|62->31|63->32|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|74->43|75->44|77->46|78->47|78->47|78->47|79->48|80->49|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|85->54|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|94->63|95->64|96->65|98->67|98->67|98->67|98->67|106->75
                  -- GENERATED --
              */
          