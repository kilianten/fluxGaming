
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

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

		"""),format.raw/*20.3*/("""<table class="table table-bordered table-hover table-condensed">
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
                """),_display_(/*32.18*/if(order != null)/*32.35*/ {_display_(Seq[Any](format.raw/*32.37*/("""
                    """),format.raw/*33.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*34.22*/for(i <- order.getItems) yield /*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
                    """),format.raw/*35.21*/("""<tr>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName),format.raw/*36.50*/("""</td>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getDescription),format.raw/*37.57*/("""</td>
                        <td>&euro; """),_display_(/*38.37*/("%.2f".format(i.getPrice))),format.raw/*38.64*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getQuantity()),format.raw/*39.45*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getItemTotal))),format.raw/*40.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*42.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*43.16*/("""
			"""),format.raw/*44.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*48.68*/("%.2f".format(order.getOrderTotal))),format.raw/*48.104*/("""</strong></p>
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
                  DATE: Fri Apr 20 16:51:58 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/orderConfirmed.scala.html
                  HASH: ca7e4e75f1d4d2ff1bb0aef1bfcfabce290c934e
                  MATRIX: 651->1|687->31|719->57|1113->84|1297->175|1324->176|1395->222|1446->265|1485->267|1515->270|1588->317|1629->349|1669->351|1702->357|1773->401|1787->406|1823->421|1856->427|1896->437|1928->442|2234->721|2260->738|2300->740|2349->761|2459->844|2499->868|2539->870|2588->891|2649->925|2659->926|2699->945|2761->980|2771->981|2818->1007|2887->1049|2935->1076|2997->1111|3007->1112|3042->1126|3111->1168|3163->1199|3247->1252|3318->1292|3349->1296|3525->1445|3583->1481
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|38->8|38->8|38->8|41->11|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|50->20|62->32|62->32|62->32|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|69->39|69->39|69->39|70->40|70->40|72->42|73->43|74->44|78->48|78->48
                  -- GENERATED --
              */
          