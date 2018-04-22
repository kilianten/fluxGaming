
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.User,Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Cart", loginForm, user)/*3.31*/{_display_(Seq[Any](format.raw/*3.32*/("""
    """),format.raw/*4.5*/("""<head>
        <link rel="stylesheet" href=""""),_display_(/*5.39*/routes/*5.45*/.Assets.versioned("stylesheets/basket.css")),format.raw/*5.88*/("""">                
    </head>

    <h1>Your Cart</h1>
    
    <br>
    <div class="container">
    """),_display_(/*12.6*/if(flash.containsKey("error"))/*12.36*/{_display_(Seq[Any](format.raw/*12.37*/("""
        """),format.raw/*13.9*/("""<div class="alert alert-warning">
          """),_display_(/*14.12*/flash/*14.17*/.get("error")),format.raw/*14.30*/("""
        """),format.raw/*15.9*/("""</div>
    """)))}),format.raw/*16.6*/("""
    """),format.raw/*17.5*/("""</div>

    <div id="tableContainer" class="container">

        <br>

        <table class="table table-striped">
            <thead>
            <!-- The header row-->
            <tr>
                <th>Name</th>
                <th>Description</th>
                <th>Item Price</th>
                <th>Total</th>
                <th>Quantity</th>
                <th>inc.</th>
                <th>dec.</th>
            </tr>
            </thead>
            <tbody>
                """),_display_(/*37.18*/if(user.getBasket() != null)/*37.46*/ {_display_(Seq[Any](format.raw/*37.48*/("""
                    """),format.raw/*38.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*39.22*/for(i <- user.getBasket().getBasketItems()) yield /*39.65*/ {_display_(Seq[Any](format.raw/*39.67*/("""
                    """),format.raw/*40.21*/("""<tr>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getName),format.raw/*41.50*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getProduct.getDescription()),format.raw/*42.59*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getPrice))),format.raw/*43.64*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getItemTotal))),format.raw/*44.68*/("""</td>
                        <td>"""),_display_(/*45.30*/i/*45.31*/.getQuantity()),format.raw/*45.45*/("""</td>
                        <td><a href=""""),_display_(/*46.39*/routes/*46.45*/.ShoppingController.addOne(i.getId)),format.raw/*46.80*/(""""><img class="basketButton" src="/assets/images/misc/add.png"/></a></td>
                        <td><a href=""""),_display_(/*47.39*/routes/*47.45*/.ShoppingController.removeOne(i.getId)),format.raw/*47.83*/(""""><img class="basketButton" src="/assets/images/misc/minus.png"/></a></td>
                    </tr>
                    """)))}),format.raw/*49.22*/("""<!-- End of For loop -->
            """)))}),format.raw/*50.14*/("""
            """),format.raw/*51.13*/("""</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*55.69*/("%.2f".format(user.getBasket.getBasketTotal))),format.raw/*55.115*/("""</strong></p>
            </div>  
        </div>


        <div class="row">
            <div class="col-md-4">
                <p class="text-left">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingController.emptyBasket()),format.raw/*63.70*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
             
            
                <p class="text-left">
                    <a href=""""),_display_(/*69.31*/routes/*69.37*/.ShoppingController.placeOrder()),format.raw/*69.69*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>
        </div>

    </div>


    <br>



""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm)

  def f:((models.User,Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm) => apply(user,loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/basket.scala.html
                  HASH: bf5d91819abf744e923303389a907c190ec81218
                  MATRIX: 979->1|1129->58|1156->60|1193->89|1231->90|1262->95|1333->140|1347->146|1410->189|1538->291|1577->321|1616->322|1652->331|1724->376|1738->381|1772->394|1808->403|1850->415|1882->420|2400->911|2437->939|2477->941|2526->962|2636->1045|2695->1088|2735->1090|2784->1111|2845->1145|2855->1146|2895->1165|2957->1200|2967->1201|3016->1229|3085->1271|3133->1298|3202->1340|3254->1371|3316->1406|3326->1407|3361->1421|3432->1465|3447->1471|3503->1506|3641->1617|3656->1623|3715->1661|3868->1783|3937->1821|3978->1834|4161->1990|4229->2036|4437->2217|4452->2223|4506->2256|4798->2521|4813->2527|4866->2559
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|48->17|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|82->51|86->55|86->55|94->63|94->63|94->63|100->69|100->69|100->69
=======
                  DATE: Sat Apr 21 17:17:37 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/basket.scala.html
                  HASH: 54518182a88dc4bfd5cc3873507b3895300181c6
                  MATRIX: 979->1|1129->58|1156->60|1193->89|1231->90|1262->95|1333->140|1347->146|1410->189|1538->291|1577->321|1616->322|1652->331|1724->376|1738->381|1772->394|1808->403|1850->415|1882->420|2400->911|2437->939|2477->941|2526->962|2636->1045|2695->1088|2735->1090|2784->1111|2845->1145|2855->1146|2895->1165|2957->1200|2967->1201|3016->1229|3085->1271|3133->1298|3202->1340|3254->1371|3316->1406|3326->1407|3361->1421|3432->1465|3447->1471|3503->1506|3641->1617|3656->1623|3715->1661|3868->1783|3937->1821|3978->1834|4161->1990|4229->2036|4441->2221|4456->2227|4510->2260|4807->2530|4822->2536|4875->2568
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|47->16|48->17|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|80->49|81->50|82->51|86->55|86->55|96->65|96->65|96->65|102->71|102->71|102->71
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
                  -- GENERATED --
              */
          