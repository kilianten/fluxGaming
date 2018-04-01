
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
        """),format.raw/*21.9*/("""<div class="basket-container">
        <img class="basket" src="/assets/images/misc/basket.png"/>
        
        <p class="number">"""),_display_(/*24.28*/user/*24.32*/.getBasket.getCount),format.raw/*24.51*/("""</p>
        </div>
      """)))}),format.raw/*26.8*/("""
    """)))}),format.raw/*27.6*/("""

    """),_display_(/*29.6*/for(p <- products) yield /*29.24*/{_display_(Seq[Any](format.raw/*29.25*/("""
      """),format.raw/*30.7*/("""<div class="col-md-3 col-sm-6">
        <div class="gradientBoxesWithOuterShadows">
            <!-- admin buttons -->
            """),_display_(/*33.14*/if(user != null)/*33.30*/{_display_(Seq[Any](format.raw/*33.31*/("""
              """),_display_(/*34.16*/if(user.getRole=="admin")/*34.41*/{_display_(Seq[Any](format.raw/*34.42*/("""
                  
                  """),format.raw/*36.19*/("""<img class="icon" src="/assets/images/misc/bin.png"/>
                  
                  <img class="icon" src="/assets/images/misc/edit.png"/>
                  
              """)))}),format.raw/*40.16*/("""
            """)))}),format.raw/*41.14*/("""

          """),format.raw/*43.11*/("""<div class="img-container">
              """),_display_(/*44.16*/if(p.getStock() <= 0)/*44.37*/{_display_(Seq[Any](format.raw/*44.38*/("""
                """),format.raw/*45.17*/("""<img class="top" src="/assets/images/misc/outOfStock.png"/>
              """)))}),format.raw/*46.16*/("""

              """),_display_(/*48.16*/if(env.resource("public/images/products/" + p.getId + ".jpg").isDefined)/*48.88*/ {_display_(Seq[Any](format.raw/*48.90*/("""
                """),format.raw/*49.17*/("""<img class="tile" src="/assets/images/products/"""),_display_(/*49.65*/(p.getId + ".jpg")),format.raw/*49.83*/(""""/>
              """)))}/*50.17*/else/*50.22*/{_display_(Seq[Any](format.raw/*50.23*/("""
                """),format.raw/*51.17*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
              """)))}),format.raw/*52.16*/("""
          """),format.raw/*53.11*/("""</div>
      
          <h3><u>"""),_display_(/*55.19*/p/*55.20*/.getName),format.raw/*55.28*/("""</u></h3>
          <h5>Price: €"""),_display_(/*56.24*/p/*56.25*/.getPrice),format.raw/*56.34*/("""</h5>

          """),_display_(/*58.12*/if(user != null)/*58.28*/{_display_(Seq[Any](format.raw/*58.29*/("""
            """),_display_(/*59.14*/if(user.getRole=="admin")/*59.39*/{_display_(Seq[Any](format.raw/*59.40*/("""
                """),format.raw/*60.17*/("""<p style="color:red;">Stock: """),_display_(/*60.47*/p/*60.48*/.getStock),format.raw/*60.57*/("""</p>
            """)))}),format.raw/*61.14*/("""
          """)))}),format.raw/*62.12*/("""

          """),format.raw/*64.11*/("""<a href=""""),_display_(/*64.21*/routes/*64.27*/.ShoppingController.addToCart(p.getId)),format.raw/*64.65*/("""">
            <div style="text-align:center;">
                    <button class="addToCartBtn" type="button">Add To Cart</button>       
            </div>
        </a>  

        </div> 
      </div>
    """)))}),format.raw/*72.6*/("""

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
                  DATE: Sun Apr 01 16:33:19 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/store.scala.html
                  HASH: 3ba2df0657f1e202510580024dab85d8d566588f
                  MATRIX: 1029->1|1247->126|1274->128|1312->158|1350->159|1382->165|1453->210|1467->216|1531->260|1614->317|1628->323|1690->365|1805->454|1844->484|1883->485|1919->494|1991->539|2005->544|2039->557|2071->562|2113->574|2147->582|2172->598|2211->599|2245->607|2300->653|2339->654|2375->663|2536->797|2549->801|2589->820|2646->847|2682->853|2715->860|2749->878|2788->879|2822->886|2981->1018|3006->1034|3045->1035|3088->1051|3122->1076|3161->1077|3227->1115|3438->1295|3483->1309|3523->1321|3593->1364|3623->1385|3662->1386|3707->1403|3813->1478|3857->1495|3938->1567|3978->1569|4023->1586|4098->1634|4137->1652|4175->1672|4188->1677|4227->1678|4272->1695|4376->1768|4415->1779|4474->1811|4484->1812|4513->1820|4573->1853|4583->1854|4613->1863|4658->1881|4683->1897|4722->1898|4763->1912|4797->1937|4836->1938|4881->1955|4938->1985|4948->1986|4978->1995|5027->2013|5070->2025|5110->2037|5147->2047|5162->2053|5221->2091|5459->2299
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|55->24|55->24|55->24|57->26|58->27|60->29|60->29|60->29|61->30|64->33|64->33|64->33|65->34|65->34|65->34|67->36|71->40|72->41|74->43|75->44|75->44|75->44|76->45|77->46|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|83->52|84->53|86->55|86->55|86->55|87->56|87->56|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|93->62|95->64|95->64|95->64|95->64|103->72
                  -- GENERATED --
              */
          