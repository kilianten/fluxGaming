
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
          
        """),_display_(/*26.10*/if(user.getBasket().getCount < 10)/*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""
          """),format.raw/*27.11*/("""<p class="number">"""),_display_(/*27.30*/user/*27.34*/.getBasket.getCount),format.raw/*27.53*/("""</p>
        """)))}/*28.11*/else/*28.16*/{_display_(Seq[Any](format.raw/*28.17*/("""
          """),format.raw/*29.11*/("""<p class="numberFuller">"""),_display_(/*29.36*/user/*29.40*/.getBasket.getCount),format.raw/*29.59*/("""</p>
        """)))}),format.raw/*30.10*/("""
        """),format.raw/*31.9*/("""</div>
        </a>
      """)))}),format.raw/*33.8*/("""
    """)))}),format.raw/*34.6*/("""

    """),_display_(/*36.6*/for(p <- products) yield /*36.24*/{_display_(Seq[Any](format.raw/*36.25*/("""
      """),format.raw/*37.7*/("""<div class="col-md-3 col-sm-6">
        <div class="gradientBoxesWithOuterShadows">
            <!-- admin buttons -->
            """),_display_(/*40.14*/if(user != null)/*40.30*/{_display_(Seq[Any](format.raw/*40.31*/("""
              """),_display_(/*41.16*/if(user.getRole.equals("admin"))/*41.48*/{_display_(Seq[Any](format.raw/*41.49*/("""
                """),format.raw/*42.17*/("""<a class="link" href=""""),_display_(/*42.40*/routes/*42.46*/.HomeController.deleteProduct(p.getId)),format.raw/*42.84*/(""""> 
                  <img class="icons" src="/assets/images/misc/bin.png">
                </a>
                <a class="link" href=""""),_display_(/*45.40*/routes/*45.46*/.HomeController.updateProduct(p.getId)),format.raw/*45.84*/("""">
                  <img class="icons" src="/assets/images/misc/edit.png">
                </a>  
                <br>
                <br>
              """)))}),format.raw/*50.16*/("""
            """)))}),format.raw/*51.14*/("""

          """),format.raw/*53.11*/("""<div class="img-container">
              """),_display_(/*54.16*/if(p.getStock() <= 0)/*54.37*/{_display_(Seq[Any](format.raw/*54.38*/("""
                """),format.raw/*55.17*/("""<img class="top" src="/assets/images/misc/outOfStock.png"/>
              """)))}),format.raw/*56.16*/("""

              """),_display_(/*58.16*/if(env.resource("public/images/products/" + p.getId + "product.jpg").isDefined)/*58.95*/ {_display_(Seq[Any](format.raw/*58.97*/("""
                """),format.raw/*59.17*/("""<img class="tile" src="/assets/images/products/"""),_display_(/*59.65*/(p.getId + "product"+ ".jpg")),format.raw/*59.94*/(""""/>
              """)))}/*60.17*/else/*60.22*/{_display_(Seq[Any](format.raw/*60.23*/("""
                """),format.raw/*61.17*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
              """)))}),format.raw/*62.16*/("""
          """),format.raw/*63.11*/("""</div>
      
          <h3><u>"""),_display_(/*65.19*/p/*65.20*/.getName),format.raw/*65.28*/("""</u></h3>
          <h5>Price: &euro; """),_display_(/*66.30*/("%.2f".format(p.getPrice))),format.raw/*66.57*/("""</h5>

          """),_display_(/*68.12*/if(user != null)/*68.28*/{_display_(Seq[Any](format.raw/*68.29*/("""
            """),_display_(/*69.14*/if(user.getRole.equals("admin"))/*69.46*/{_display_(Seq[Any](format.raw/*69.47*/("""
               """),format.raw/*70.16*/("""<p style="color:red;">Stock: """),_display_(/*70.46*/p/*70.47*/.getStock),format.raw/*70.56*/("""</p>
            """)))}),format.raw/*71.14*/("""
          """)))}),format.raw/*72.12*/("""

          """),format.raw/*74.11*/("""<a href=""""),_display_(/*74.21*/routes/*74.27*/.ShoppingController.addToCart(p.getId)),format.raw/*74.65*/("""">
            <div style="text-align:center;">
                    <button class="addToCartBtn" type="button">Add To Cart</button>       
            </div>
          </a>  

        </div> 
      </div>
    """)))}),format.raw/*82.6*/("""

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
                  DATE: Fri Apr 20 16:51:58 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/store.scala.html
                  HASH: 0fa8e2e8a23558a1a7cf9487534dfaaf31446e96
                  MATRIX: 1029->1|1247->126|1274->128|1312->158|1350->159|1382->165|1453->210|1467->216|1531->260|1614->317|1628->323|1690->365|1805->454|1844->484|1883->485|1919->494|1991->539|2005->544|2039->557|2071->562|2113->574|2147->582|2172->598|2211->599|2245->607|2300->653|2339->654|2375->663|2558->819|2601->853|2640->854|2679->865|2725->884|2738->888|2778->907|2811->922|2824->927|2863->928|2902->939|2954->964|2967->968|3007->987|3052->1001|3088->1010|3145->1037|3181->1043|3214->1050|3248->1068|3287->1069|3321->1076|3480->1208|3505->1224|3544->1225|3587->1241|3628->1273|3667->1274|3712->1291|3762->1314|3777->1320|3836->1358|3999->1494|4014->1500|4073->1538|4260->1694|4305->1708|4345->1720|4415->1763|4445->1784|4484->1785|4529->1802|4635->1877|4679->1894|4767->1973|4807->1975|4852->1992|4927->2040|4977->2069|5015->2089|5028->2094|5067->2095|5112->2112|5216->2185|5255->2196|5314->2228|5324->2229|5353->2237|5419->2276|5467->2303|5512->2321|5537->2337|5576->2338|5617->2352|5658->2384|5697->2385|5741->2401|5798->2431|5808->2432|5838->2441|5887->2459|5930->2471|5970->2483|6007->2493|6022->2499|6081->2537|6321->2747
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31|64->33|65->34|67->36|67->36|67->36|68->37|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|76->45|76->45|76->45|81->50|82->51|84->53|85->54|85->54|85->54|86->55|87->56|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|93->62|94->63|96->65|96->65|96->65|97->66|97->66|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|103->72|105->74|105->74|105->74|105->74|113->82
                  -- GENERATED --
              */
          