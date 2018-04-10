
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
          """),format.raw/*29.11*/("""p
          <p class="numberFuller">"""),_display_(/*30.36*/user/*30.40*/.getBasket.getCount),format.raw/*30.59*/("""</p>
        """)))}),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""</div>
        </a>
      """)))}),format.raw/*34.8*/("""
    """)))}),format.raw/*35.6*/("""

    """),_display_(/*37.6*/for(p <- products) yield /*37.24*/{_display_(Seq[Any](format.raw/*37.25*/("""
      """),format.raw/*38.7*/("""<div class="col-md-3 col-sm-6">
        <div class="gradientBoxesWithOuterShadows">
            <!-- admin buttons -->
            """),_display_(/*41.14*/if(user != null)/*41.30*/{_display_(Seq[Any](format.raw/*41.31*/("""
              """),_display_(/*42.16*/if(user.getRole=="admin")/*42.41*/{_display_(Seq[Any](format.raw/*42.42*/("""
                """),format.raw/*43.17*/("""<a class="link" href=""""),_display_(/*43.40*/routes/*43.46*/.HomeController.deleteProduct(p.getId)),format.raw/*43.84*/(""""> 
                  <img class="icons" src="/assets/images/misc/bin.png">
                </a>
                  <img class="icons" src="/assets/images/misc/edit.png">
                <br>
                <br>
              """)))}),format.raw/*49.16*/("""
            """)))}),format.raw/*50.14*/("""

          """),format.raw/*52.11*/("""<div class="img-container">
              """),_display_(/*53.16*/if(p.getStock() <= 0)/*53.37*/{_display_(Seq[Any](format.raw/*53.38*/("""
                """),format.raw/*54.17*/("""<img class="top" src="/assets/images/misc/outOfStock.png"/>
              """)))}),format.raw/*55.16*/("""

              """),_display_(/*57.16*/if(env.resource("public/images/products/" + p.getId + ".jpg").isDefined)/*57.88*/ {_display_(Seq[Any](format.raw/*57.90*/("""
                """),format.raw/*58.17*/("""<img class="tile" src="/assets/images/products/"""),_display_(/*58.65*/(p.getId + ".jpg")),format.raw/*58.83*/(""""/>
              """)))}/*59.17*/else/*59.22*/{_display_(Seq[Any](format.raw/*59.23*/("""
                """),format.raw/*60.17*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
              """)))}),format.raw/*61.16*/("""
          """),format.raw/*62.11*/("""</div>
      
          <h3><u>"""),_display_(/*64.19*/p/*64.20*/.getName),format.raw/*64.28*/("""</u></h3>
          <h5>Price: €"""),_display_(/*65.24*/p/*65.25*/.getPrice),format.raw/*65.34*/("""</h5>

          """),_display_(/*67.12*/if(user != null)/*67.28*/{_display_(Seq[Any](format.raw/*67.29*/("""
            """),_display_(/*68.14*/if(user.getRole=="admin")/*68.39*/{_display_(Seq[Any](format.raw/*68.40*/("""
                """),format.raw/*69.17*/("""<p style="color:red;">Stock: """),_display_(/*69.47*/p/*69.48*/.getStock),format.raw/*69.57*/("""</p>
            """)))}),format.raw/*70.14*/("""
          """)))}),format.raw/*71.12*/("""

          """),format.raw/*73.11*/("""<a href=""""),_display_(/*73.21*/routes/*73.27*/.ShoppingController.addToCart(p.getId)),format.raw/*73.65*/("""">
            <div style="text-align:center;">
                    <button class="addToCartBtn" type="button">Add To Cart</button>       
            </div>
          </a>  

        </div> 
      </div>
    """)))}),format.raw/*81.6*/("""

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
                  DATE: Tue Apr 10 18:40:01 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/store.scala.html
                  HASH: 9c690a7e8665809ffe1cb54f8280b8154aa50c1a
                  MATRIX: 1029->1|1247->126|1274->128|1312->158|1350->159|1382->165|1453->210|1467->216|1531->260|1614->317|1628->323|1690->365|1805->454|1844->484|1883->485|1919->494|1991->539|2005->544|2039->557|2071->562|2113->574|2147->582|2172->598|2211->599|2245->607|2300->653|2339->654|2375->663|2558->819|2601->853|2640->854|2679->865|2725->884|2738->888|2778->907|2811->922|2824->927|2863->928|2902->939|2966->976|2979->980|3019->999|3064->1013|3100->1022|3157->1049|3193->1055|3226->1062|3260->1080|3299->1081|3333->1088|3492->1220|3517->1236|3556->1237|3599->1253|3633->1278|3672->1279|3717->1296|3767->1319|3782->1325|3841->1363|4099->1590|4144->1604|4184->1616|4254->1659|4284->1680|4323->1681|4368->1698|4474->1773|4518->1790|4599->1862|4639->1864|4684->1881|4759->1929|4798->1947|4836->1967|4849->1972|4888->1973|4933->1990|5037->2063|5076->2074|5135->2106|5145->2107|5174->2115|5234->2148|5244->2149|5274->2158|5319->2176|5344->2192|5383->2193|5424->2207|5458->2232|5497->2233|5542->2250|5599->2280|5609->2281|5639->2290|5688->2308|5731->2320|5771->2332|5808->2342|5823->2348|5882->2386|6122->2596
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|38->7|38->7|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|50->19|50->19|50->19|51->20|51->20|51->20|52->21|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|65->34|66->35|68->37|68->37|68->37|69->38|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|74->43|80->49|81->50|83->52|84->53|84->53|84->53|85->54|86->55|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|92->61|93->62|95->64|95->64|95->64|96->65|96->65|96->65|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|101->70|102->71|104->73|104->73|104->73|104->73|112->81
                  -- GENERATED --
              */
          