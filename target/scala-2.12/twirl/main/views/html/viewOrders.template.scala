
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
            """),_display_(/*12.14*/orders(i)),format.raw/*12.23*/("""
              
            """),format.raw/*14.13*/("""<div class="col-md-12">
                """),_display_(/*15.18*/if(flash.containsKey("success"))/*15.50*/ {_display_(Seq[Any](format.raw/*15.52*/("""
                    """),format.raw/*16.21*/("""<div class="alert alert-success">
                      """),_display_(/*17.24*/flash/*17.29*/.get("success")),format.raw/*17.44*/("""
                    """),format.raw/*18.21*/("""</div>
                """)))}),format.raw/*19.18*/("""
        
            """),format.raw/*21.13*/("""<table class="table table-bordered table-hover table-condensed">
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
                            <td>"""),_display_(/*36.34*/o/*36.35*/.getProduct.getId),format.raw/*36.52*/("""</td>
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
                  DATE: Tue Apr 17 20:08:55 IST 2018
                  SOURCE: /home/paul/fluxGaming/fluxGaming/app/views/viewOrders.scala.html
                  HASH: 22cfa5bd625aaf51f9946116e668844c3e5c5245
                  MATRIX: 651->1|687->31|719->57|1099->84|1274->166|1301->168|1340->199|1379->201|1411->207|1466->235|1506->259|1546->261|1587->275|1617->284|1673->312|1741->353|1782->385|1822->387|1871->408|1955->465|1969->470|2005->485|2054->506|2109->530|2159->552|2701->1067|2749->1099|2789->1101|2842->1126|2907->1164|2917->1165|2955->1182|3021->1221|3031->1222|3078->1248|3151->1294|3199->1321|3265->1360|3275->1361|3310->1375|3383->1421|3435->1452|3523->1509|3786->1745|3852->1789|3977->1883|4009->1888
                  LINES: 24->1|25->2|26->3|31->5|36->6|37->7|37->7|37->7|39->9|41->11|41->11|41->11|42->12|42->12|44->14|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|69->39|69->39|69->39|70->40|70->40|72->42|77->47|77->47|81->51|82->52
                  -- GENERATED --
              */
          