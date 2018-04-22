
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

object stockReport extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],List[Product],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, loginForm: Form[models.users.Login], products: List[Product], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Stock Report", loginForm, user)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""
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
              <th>Stock</th> 
            </tr>
          </thead>
    
          <tbody>
            """),_display_(/*26.14*/for(p<-products) yield /*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
              """),format.raw/*27.15*/("""<tr>
                <td class="numeric">"""),_display_(/*28.38*/p/*28.39*/.getId),format.raw/*28.45*/("""</td>
                <td>"""),_display_(/*29.22*/p/*29.23*/.getName),format.raw/*29.31*/("""</td>
                """),_display_(/*30.18*/if(p.getStock < 20)/*30.37*/{_display_(Seq[Any](format.raw/*30.38*/("""
                  """),format.raw/*31.19*/("""<td  class="numeric" style="color: tomato">"""),_display_(/*31.63*/p/*31.64*/.getStock),format.raw/*31.73*/("""</td>
                """)))}/*32.18*/else/*32.22*/{_display_(Seq[Any](format.raw/*32.23*/("""
                  """),format.raw/*33.19*/("""<td  class="numeric" >"""),_display_(/*33.42*/p/*33.43*/.getStock),format.raw/*33.52*/("""</td>
                """)))}),format.raw/*34.18*/("""
              """),format.raw/*35.15*/("""</tr>
            """)))}),format.raw/*36.14*/("""
          """),format.raw/*37.11*/("""</tbody>
    
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
                  DATE: Sat Apr 21 17:17:38 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/admin/stockReport.scala.html
                  HASH: c924958506ec7f340a259722e5cd65bc4ba7b209
                  MATRIX: 657->1|695->33|1089->53|1291->162|1318->164|1363->201|1402->203|1433->208|1565->313|1606->345|1646->347|1687->360|1763->409|1777->414|1813->429|1854->442|1903->460|1940->470|2234->737|2266->753|2306->755|2349->770|2418->812|2428->813|2455->819|2509->846|2519->847|2548->855|2598->878|2626->897|2665->898|2712->917|2783->961|2793->962|2823->971|2865->994|2878->998|2917->999|2964->1018|3014->1041|3024->1042|3054->1051|3108->1074|3151->1089|3201->1108|3240->1119
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|37->6|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|45->14|47->16|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|67->36|68->37
                  -- GENERATED --
              */
          