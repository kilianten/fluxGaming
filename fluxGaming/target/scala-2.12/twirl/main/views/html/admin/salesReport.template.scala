
package views.html.admin

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
/*1.2*/import models.products.Product
/*2.2*/import models.User

object salesReport extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],List[Product],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, loginForm: Form[models.users.Login], products: List[Product], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Sales Report", loginForm, user)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
    """),format.raw/*6.5*/("""<p class="lead">Sales Report</p>
    <br>
    <div class="row">
      <div class="col-sm-10">
          """),_display_(/*10.12*/if(flash.containsKey("success"))/*10.44*/ {_display_(Seq[Any](format.raw/*10.46*/("""
            """),format.raw/*11.13*/("""<div class="alert alert-success">
              """),_display_(/*12.16*/flash/*12.21*/.get("success")),format.raw/*12.36*/("""
            """),format.raw/*13.13*/("""</div>
          """)))}),format.raw/*14.12*/("""

        """),format.raw/*16.9*/("""<table class="table table-bordered table-hover table-condensed">   
          <thead>
            <tr>
              <th>ID</th>
              <th>Name</th>       
              <th>Description</th>
              <th>Stock</th>
              <th>Price</th>   
            </tr>
          </thead>
    
          <tbody>
            """),_display_(/*28.14*/for(p<-products) yield /*28.30*/ {_display_(Seq[Any](format.raw/*28.32*/("""
              """),format.raw/*29.15*/("""<tr>
                <td class="numeric">"""),_display_(/*30.38*/p/*30.39*/.getId),format.raw/*30.45*/("""</td>
                <td>"""),_display_(/*31.22*/p/*31.23*/.getName),format.raw/*31.31*/("""</td>
                <td>"""),_display_(/*32.22*/p/*32.23*/.getDescription),format.raw/*32.38*/("""</td>
                <td  class="numeric">"""),_display_(/*33.39*/p/*33.40*/.getStock),format.raw/*33.49*/("""</td>
                <td  class="numeric">€ """),_display_(/*34.41*/("%.2f".format(p.getPrice))),format.raw/*34.68*/("""</td>
    
              </tr>
            """)))}),format.raw/*37.14*/("""
          """),format.raw/*38.11*/("""</tbody>
    
        </table>
      </div>
    </div>
  
  
""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],products:List[Product],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,products,env)

  def f:((models.User,Form[models.users.Login],List[Product],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,products,env) => apply(user,loginForm,products,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 17:30:17 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/admin/salesReport.scala.html
                  HASH: 40ef4470810f19d2c60ed143028598364da5875f
                  MATRIX: 657->1|695->33|1089->53|1291->162|1318->164|1363->201|1402->203|1433->208|1565->313|1606->345|1646->347|1687->360|1763->409|1777->414|1813->429|1854->442|1903->460|1940->470|2300->803|2332->819|2372->821|2415->836|2484->878|2494->879|2521->885|2575->912|2585->913|2614->921|2668->948|2678->949|2714->964|2785->1008|2795->1009|2825->1018|2898->1064|2946->1091|3021->1135|3060->1146
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|47->16|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|68->37|69->38
                  -- GENERATED --
              */
          