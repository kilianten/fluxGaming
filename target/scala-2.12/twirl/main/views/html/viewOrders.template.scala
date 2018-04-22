
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,Form[models.users.Login],List[ShopOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(user: models.User, loginForm: Form[models.users.Login] ,orders: List[ShopOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Orders", loginForm, user)/*7.33*/ {_display_(Seq[Any](format.raw/*7.35*/("""

    """),format.raw/*9.5*/("""<h2>Order History</h2>

    <br>
    <br>
    <div class="row">

            <h2 style="padding-left: 1em">View Orders</h2>
            <br>

        """),_display_(/*18.10*/for(i <- orders.indices) yield /*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""
            """),format.raw/*19.13*/("""<div class="container"> 
            <strong><p>Purchased On: """),_display_(/*20.39*/orders/*20.45*/.get(i).getOrderDate),format.raw/*20.65*/("""</p></strong>
              
            <div class="col-md-10">
                """),_display_(/*23.18*/if(flash.containsKey("success"))/*23.50*/ {_display_(Seq[Any](format.raw/*23.52*/("""
                    """),format.raw/*24.21*/("""<div class="alert alert-success">
                      """),_display_(/*25.24*/flash/*25.29*/.get("success")),format.raw/*25.44*/("""
                    """),format.raw/*26.21*/("""</div>
                """)))}),format.raw/*27.18*/("""
                
                """),format.raw/*29.17*/("""<h2 style="clear: both">Order: """),_display_(/*29.49*/(i+1)),format.raw/*29.54*/("""</h2>
            <table class="table table-bordered table-hover table-condensed">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Item Price</th>
                    <th>Quantity</th>
                    <th>Total</th>
                </tr>
                </thead>
                <tbody>
                    """),_display_(/*41.22*/for(o <- orders.get(i).getItems) yield /*41.54*/ {_display_(Seq[Any](format.raw/*41.56*/("""
                        """),format.raw/*42.25*/("""<tr>
                            <td>"""),_display_(/*43.34*/o/*43.35*/.getProduct.getName),format.raw/*43.54*/("""</td>
                            <td>"""),_display_(/*44.34*/o/*44.35*/.getProduct.getDescription),format.raw/*44.61*/("""</td>
                            <td>&euro; """),_display_(/*45.41*/("%.2f".format(o.getPrice))),format.raw/*45.68*/("""</td>
                            <td>"""),_display_(/*46.34*/o/*46.35*/.getQuantity()),format.raw/*46.49*/("""</td>
                            <td>&euro; """),_display_(/*47.41*/("%.2f".format(o.getItemTotal))),format.raw/*47.72*/("""</td>
                        </tr>
                    """)))}),format.raw/*49.22*/("""            
                """),format.raw/*50.17*/("""</tbody>
            </table>
            <div class="row">
                    <div class="col-md-3">
                            <p class="text-left">
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.ShoppingController.cancelOrder()),format.raw/*55.82*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span> Cancel Order</a>
                            </p>
                        </div> 
                    <div class="col-md-9">
                        <p class="text-right"><strong>Order Total: &euro; """),_display_(/*60.76*/("%.2f".format(orders.get(i).getOrderTotal))),format.raw/*60.120*/("""</strong></p>
                    </div>  
                </div>
            </div>
        </div>

        <hr>
        """)))}),format.raw/*67.10*/("""
    """),format.raw/*68.5*/("""</div>


""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],orders:List[ShopOrder]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,orders)

  def f:((models.User,Form[models.users.Login],List[ShopOrder]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,orders) => apply(user,loginForm,orders)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 13:17:59 IST 2018
                  SOURCE: /home/paul/fluxGaming/app/views/viewOrders.scala.html
                  HASH: 64835f636c55cfabcc99dfccb4803f3d3c879761
                  MATRIX: 651->1|687->31|719->57|1099->84|1274->166|1301->168|1340->199|1379->201|1411->207|1589->358|1629->382|1669->384|1710->397|1800->460|1815->466|1856->486|1965->568|2006->600|2046->602|2095->623|2179->680|2193->685|2229->700|2278->721|2333->745|2395->779|2454->811|2480->816|2915->1224|2963->1256|3003->1258|3056->1283|3121->1321|3131->1322|3171->1341|3237->1380|3247->1381|3294->1407|3367->1453|3415->1480|3481->1519|3491->1520|3526->1534|3599->1580|3651->1611|3739->1668|3796->1697|4018->1892|4033->1898|4087->1931|4458->2275|4524->2319|4678->2442|4710->2447
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|37->7|37->7|39->9|48->18|48->18|48->18|49->19|50->20|50->20|50->20|53->23|53->23|53->23|54->24|55->25|55->25|55->25|56->26|57->27|59->29|59->29|59->29|71->41|71->41|71->41|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|76->46|76->46|76->46|77->47|77->47|79->49|80->50|85->55|85->55|85->55|90->60|90->60|97->67|98->68
                  -- GENERATED --
              */
          