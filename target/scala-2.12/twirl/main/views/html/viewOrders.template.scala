
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

    """),format.raw/*9.5*/("""<div class="row">

        """),_display_(/*11.10*/for(i <- orders.indices) yield /*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
              
            """),format.raw/*13.13*/("""<div class="col-md-9">
                """),_display_(/*14.18*/if(flash.containsKey("success"))/*14.50*/ {_display_(Seq[Any](format.raw/*14.52*/("""
                    """),format.raw/*15.21*/("""<div class="alert alert-success">
                      """),_display_(/*16.24*/flash/*16.29*/.get("success")),format.raw/*16.44*/("""
                    """),format.raw/*17.21*/("""</div>
                """)))}),format.raw/*18.18*/("""
                
                """),format.raw/*20.17*/("""<h2 style="clear: both">Order: """),_display_(/*20.49*/(i+1)),format.raw/*20.54*/("""</h2>
            <table class="table table-bordered table-hover table-condensed">
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
                        <!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*34.22*/for(o <- orders.get(i).getItems) yield /*34.54*/ {_display_(Seq[Any](format.raw/*34.56*/("""
                        """),format.raw/*35.25*/("""<tr>
                            <td>"""),_display_(/*36.34*/o/*36.35*/.getProduct.getName),format.raw/*36.54*/("""</td>
                            <td>"""),_display_(/*37.34*/o/*37.35*/.getProduct.getDescription),format.raw/*37.61*/("""</td>
                            <td>&euro; """),_display_(/*38.41*/("%.2f".format(o.getPrice))),format.raw/*38.68*/("""</td>
                            <td>"""),_display_(/*39.34*/o/*39.35*/.getQuantity()),format.raw/*39.49*/("""</td>
                            <td>&euro; """),_display_(/*40.41*/("%.2f".format(o.getItemTotal))),format.raw/*40.72*/("""</td>
                        </tr>
                    """)))}),format.raw/*42.22*/("""<!-- End of For loop -->                
                </tbody>
            </table>
            <div class="row">
                    <div class="col-md-12">
                        <p class="text-right"><strong>Order Total: &euro; """),_display_(/*47.76*/("%.2f".format(orders.get(i).getOrderTotal))),format.raw/*47.120*/("""</strong></p>
                    </div>  
                </div>
            </div>
        """)))}),format.raw/*51.10*/("""
    """),format.raw/*52.5*/("""</div>


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
                  DATE: Sat Apr 21 15:33:27 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/viewOrders.scala.html
                  HASH: 4c24561c04722d343bb7631f80695a5492b2d765
                  MATRIX: 651->1|687->31|719->57|1099->84|1274->166|1301->168|1340->199|1379->201|1411->207|1466->235|1506->259|1546->261|1602->289|1669->329|1710->361|1750->363|1799->384|1883->441|1897->446|1933->461|1982->482|2037->506|2099->540|2158->572|2184->577|2744->1110|2792->1142|2832->1144|2885->1169|2950->1207|2960->1208|3000->1227|3066->1266|3076->1267|3123->1293|3196->1339|3244->1366|3310->1405|3320->1406|3355->1420|3428->1466|3480->1497|3568->1554|3831->1790|3897->1834|4022->1928|4054->1933
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|44->14|44->14|44->14|45->15|46->16|46->16|46->16|47->17|48->18|50->20|50->20|50->20|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|69->39|69->39|69->39|70->40|70->40|72->42|77->47|77->47|81->51|82->52
                  -- GENERATED --
              */
          