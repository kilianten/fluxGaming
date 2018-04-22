
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

<<<<<<< HEAD
    <br>
    <br>
    <div class="row">

        """),_display_(/*15.10*/for(i <- orders.indices) yield /*15.34*/ {_display_(Seq[Any](format.raw/*15.36*/("""
            """),format.raw/*16.13*/("""<div class="container"> 
            <strong><p>Purchased On: """),_display_(/*17.39*/orders/*17.45*/.get(i).getOrderDate),format.raw/*17.65*/("""</p></strong>
              
            <div class="col-md-10">
                """),_display_(/*20.18*/if(flash.containsKey("success"))/*20.50*/ {_display_(Seq[Any](format.raw/*20.52*/("""
                    """),format.raw/*21.21*/("""<div class="alert alert-success">
                      """),_display_(/*22.24*/flash/*22.29*/.get("success")),format.raw/*22.44*/("""
                    """),format.raw/*23.21*/("""</div>
                """)))}),format.raw/*24.18*/("""
        
            """),format.raw/*26.13*/("""<table class="table table-bordered table-hover table-condensed">
=======
            <h2 style="padding-left: 1em">View Orders</h2>
            <br>

        """),_display_(/*14.10*/for(i <- orders.indices) yield /*14.34*/ {_display_(Seq[Any](format.raw/*14.36*/("""
              
            """),format.raw/*16.13*/("""<div class="col-md-9">
                """),_display_(/*17.18*/if(flash.containsKey("success"))/*17.50*/ {_display_(Seq[Any](format.raw/*17.52*/("""
                    """),format.raw/*18.21*/("""<div class="alert alert-success">
                      """),_display_(/*19.24*/flash/*19.29*/.get("success")),format.raw/*19.44*/("""
                    """),format.raw/*20.21*/("""</div>
                """)))}),format.raw/*21.18*/("""
                
                """),format.raw/*23.17*/("""<h2 style="clear: both">Order: """),_display_(/*23.49*/(i+1)),format.raw/*23.54*/("""</h2>
            <table class="table table-bordered table-hover table-condensed">
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
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
<<<<<<< HEAD
=======
                        <!-- Start of For loop - For each p in products add a row -->
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
                    """),_display_(/*37.22*/for(o <- orders.get(i).getItems) yield /*37.54*/ {_display_(Seq[Any](format.raw/*37.56*/("""
                        """),format.raw/*38.25*/("""<tr>
                            <td>"""),_display_(/*39.34*/o/*39.35*/.getProduct.getName),format.raw/*39.54*/("""</td>
                            <td>"""),_display_(/*40.34*/o/*40.35*/.getProduct.getDescription),format.raw/*40.61*/("""</td>
                            <td>&euro; """),_display_(/*41.41*/("%.2f".format(o.getPrice))),format.raw/*41.68*/("""</td>
                            <td>"""),_display_(/*42.34*/o/*42.35*/.getQuantity()),format.raw/*42.49*/("""</td>
                            <td>&euro; """),_display_(/*43.41*/("%.2f".format(o.getItemTotal))),format.raw/*43.72*/("""</td>
                        </tr>
<<<<<<< HEAD
                    """)))}),format.raw/*45.22*/("""            
                """),format.raw/*46.17*/("""</tbody>
            </table>
            <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong>Order Total: &euro; """),_display_(/*50.76*/("%.2f".format(orders.get(i).getOrderTotal))),format.raw/*50.120*/("""</strong></p>
                    </div>  
                </div>
            </div>
        </div>

        <hr>
        """)))}),format.raw/*57.10*/("""
    """),format.raw/*58.5*/("""</div>
=======
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->                
                </tbody>
            </table>
            <div class="row">
                    <div class="col-md-3">
                            <p class="text-left">
                                <a href=""""),_display_(/*51.43*/routes/*51.49*/.ShoppingController.cancelOrder()),format.raw/*51.82*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                                <span class="glyphicon glyphicon-trash"></span> Cancel Order</a>
                            </p>
                        </div> 
                    <div class="col-md-9">
                        <p class="text-right"><strong>Order Total: &euro; """),_display_(/*56.76*/("%.2f".format(orders.get(i).getOrderTotal))),format.raw/*56.120*/("""</strong></p>
                    </div>  
                </div>
            </div> 
        """)))}),format.raw/*60.10*/("""
    """),format.raw/*61.5*/("""</div>
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0


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
<<<<<<< HEAD
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/viewOrders.scala.html
                  HASH: 6fe19d21e8c872e4772aa5622123f6edf1202b1d
                  MATRIX: 651->1|687->31|719->57|1099->84|1274->166|1301->168|1340->199|1379->201|1411->207|1512->281|1552->305|1592->307|1633->320|1723->383|1738->389|1779->409|1888->491|1929->523|1969->525|2018->546|2102->603|2116->608|2152->623|2201->644|2256->668|2306->690|2723->1080|2771->1112|2811->1114|2864->1139|2929->1177|2939->1178|2979->1197|3045->1236|3055->1237|3102->1263|3175->1309|3223->1336|3289->1375|3299->1376|3334->1390|3407->1436|3459->1467|3547->1524|3604->1553|3810->1732|3876->1776|4030->1899|4062->1904
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|37->7|37->7|39->9|45->15|45->15|45->15|46->16|47->17|47->17|47->17|50->20|50->20|50->20|51->21|52->22|52->22|52->22|53->23|54->24|56->26|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|72->42|73->43|73->43|75->45|76->46|80->50|80->50|87->57|88->58
=======
                  DATE: Sat Apr 21 17:17:37 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/viewOrders.scala.html
                  HASH: 51eeff131b3edf7fadeba099dbab943f911da087
                  MATRIX: 651->1|687->31|719->57|1099->84|1274->166|1301->168|1340->199|1379->201|1411->207|1543->312|1583->336|1623->338|1679->366|1746->406|1787->438|1827->440|1876->461|1960->518|1974->523|2010->538|2059->559|2114->583|2176->617|2235->649|2261->654|2821->1187|2869->1219|2909->1221|2962->1246|3027->1284|3037->1285|3077->1304|3143->1343|3153->1344|3200->1370|3273->1416|3321->1443|3387->1482|3397->1483|3432->1497|3505->1543|3557->1574|3645->1631|3924->1883|3939->1889|3993->1922|4364->2266|4430->2310|4556->2405|4588->2410
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|37->7|37->7|39->9|44->14|44->14|44->14|46->16|47->17|47->17|47->17|48->18|49->19|49->19|49->19|50->20|51->21|53->23|53->23|53->23|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|72->42|73->43|73->43|75->45|81->51|81->51|81->51|86->56|86->56|90->60|91->61
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
                  -- GENERATED --
              */
          