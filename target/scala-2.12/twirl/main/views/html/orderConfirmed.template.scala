
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
/*1.2*/import play.api.Play.current
/*2.2*/import models.shopping._
/*3.2*/import models.products._

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,models.shopping.ShopOrder,Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: models.User, order: models.shopping.ShopOrder, loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*7.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*8.2*/main("Order Confirmation", loginForm, user)/*8.45*/ {_display_(Seq[Any](format.raw/*8.47*/("""


"""),format.raw/*11.1*/("""<div class="row">

    <h2 style="padding-left: 1em">Order Confirmation</h2>

	<div class="col-md-12">
		"""),_display_(/*16.4*/if(flash.containsKey("success"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
			  """),format.raw/*17.6*/("""<div class="alert alert-success">
			      """),_display_(/*18.11*/flash/*18.16*/.get("success")),format.raw/*18.31*/("""
			  """),format.raw/*19.6*/("""</div>
		""")))}),format.raw/*20.4*/(""" 

		"""),format.raw/*22.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*34.18*/if(order != null)/*34.35*/ {_display_(Seq[Any](format.raw/*34.37*/("""
                    """),format.raw/*35.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*36.22*/for(i <- order.getItems) yield /*36.46*/ {_display_(Seq[Any](format.raw/*36.48*/("""
                    """),format.raw/*37.21*/("""<tr>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getName),format.raw/*38.50*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getDescription),format.raw/*39.57*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getPrice))),format.raw/*40.64*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getQuantity()),format.raw/*41.45*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*44.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*45.16*/("""
			"""),format.raw/*46.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*50.68*/("%.2f".format(order.getOrderTotal))),format.raw/*50.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(user:models.User,order:models.shopping.ShopOrder,loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(user,order,loginForm)

  def f:((models.User,models.shopping.ShopOrder,Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (user,order,loginForm) => apply(user,order,loginForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/orderConfirmed.scala.html
                  HASH: ca7e4e75f1d4d2ff1bb0aef1bfcfabce290c934e
                  MATRIX: 651->1|687->31|719->57|1113->84|1297->175|1324->176|1395->222|1446->265|1485->267|1515->270|1588->317|1629->349|1669->351|1702->357|1773->401|1787->406|1823->421|1856->427|1896->437|1928->442|2234->721|2260->738|2300->740|2349->761|2459->844|2499->868|2539->870|2588->891|2649->925|2659->926|2699->945|2761->980|2771->981|2818->1007|2887->1049|2935->1076|2997->1111|3007->1112|3042->1126|3111->1168|3163->1199|3247->1252|3318->1292|3349->1296|3525->1445|3583->1481
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|38->8|38->8|38->8|41->11|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|50->20|62->32|62->32|62->32|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|69->39|69->39|69->39|70->40|70->40|72->42|73->43|74->44|78->48|78->48
=======
                  DATE: Sat Apr 21 17:17:37 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/orderConfirmed.scala.html
                  HASH: febaad684e8680317d5b0933695c0a8f3b962316
                  MATRIX: 651->1|687->31|719->57|1113->84|1297->175|1324->176|1395->222|1446->265|1485->267|1515->270|1647->376|1688->408|1728->410|1761->416|1832->460|1846->465|1882->480|1915->486|1955->496|1987->501|2293->780|2319->797|2359->799|2408->820|2518->903|2558->927|2598->929|2647->950|2708->984|2718->985|2758->1004|2820->1039|2830->1040|2877->1066|2946->1108|2994->1135|3056->1170|3066->1171|3101->1185|3170->1227|3222->1258|3306->1311|3377->1351|3408->1355|3584->1504|3642->1540
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|38->8|38->8|38->8|41->11|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|50->20|52->22|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|71->41|71->41|71->41|72->42|72->42|74->44|75->45|76->46|80->50|80->50
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
                  -- GENERATED --
              */
          