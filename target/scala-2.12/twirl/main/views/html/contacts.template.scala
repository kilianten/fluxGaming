
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

object contacts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],List[models.User],List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], mods: List[models.User], admins: List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Contacts", loginForm, user)/*3.35*/{_display_(Seq[Any](format.raw/*3.36*/("""

    """),format.raw/*5.5*/("""<h1>Contact Us</h1>
    <div class="col-sm-5"></div>
        <h3>Admins</h3>
        <table class="table table-bordered table-hover table-condensed">   
            <thead>
                <tr>
                    <th>Email Address</th>
                    <th>Role</th>
                </tr>

            </thead>
  
            <tbody>
                """),_display_(/*18.18*/for(a<-admins) yield /*18.32*/ {_display_(Seq[Any](format.raw/*18.34*/("""
                    """),format.raw/*19.21*/("""<td>"""),_display_(/*19.26*/a/*19.27*/.getEmail),format.raw/*19.36*/("""</td>
                    <td>"""),_display_(/*20.26*/a/*20.27*/.getRole),format.raw/*20.35*/("""</td>
                """)))}),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""<!-- """),_display_(/*22.23*/for(m<-mods) yield /*22.35*/{_display_(Seq[Any](format.raw/*22.36*/("""
                    """),format.raw/*23.21*/("""<td>"""),_display_(/*23.26*/m/*23.27*/.getEmail),format.raw/*23.36*/("""</td>
                    <td>"""),_display_(/*24.26*/m/*24.27*/.getRole),format.raw/*24.35*/("""</td>    
                """)))}),format.raw/*25.18*/(""" """),format.raw/*25.19*/("""-->
  
            </tbody>
  
        </table>
            <h3>Moderators</h3>
        <table class="table table-bordered table-hover table-condensed">   
            <thead>
                <tr>
                    <th>Email Address</th>
                    <th>Role</th>
                </tr>

            </thead>
  
            <tbody>
                
            """),_display_(/*42.14*/for(m<-mods) yield /*42.26*/{_display_(Seq[Any](format.raw/*42.27*/("""
                """),format.raw/*43.17*/("""<td>"""),_display_(/*43.22*/m/*43.23*/.getEmail),format.raw/*43.32*/("""</td>
                <td>"""),_display_(/*44.22*/m/*44.23*/.getRole),format.raw/*44.31*/("""</td>    
            """)))}),format.raw/*45.14*/("""
  
            """),format.raw/*47.13*/("""</tbody>
  
        </table>
    </div>    

""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],mods:List[models.User],admins:List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,mods,admins)

  def f:((models.User,Form[models.users.Login],List[models.User],List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,mods,admins) => apply(user,loginForm,mods,admins)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 20:41:45 IST 2018
                  SOURCE: /home/paul/fluxGaming/app/views/contacts.scala.html
                  HASH: 6d2437472402151ccb4f93e24b8f95e901146614
                  MATRIX: 1017->1|1219->110|1246->112|1287->145|1325->146|1357->152|1739->507|1769->521|1809->523|1858->544|1890->549|1900->550|1930->559|1988->590|1998->591|2027->599|2081->622|2126->639|2159->645|2187->657|2226->658|2275->679|2307->684|2317->685|2347->694|2405->725|2415->726|2444->734|2502->761|2531->762|2929->1133|2957->1145|2996->1146|3041->1163|3073->1168|3083->1169|3113->1178|3167->1205|3177->1206|3206->1214|3260->1237|3304->1253
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|49->18|49->18|49->18|50->19|50->19|50->19|50->19|51->20|51->20|51->20|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|73->42|73->42|73->42|74->43|74->43|74->43|74->43|75->44|75->44|75->44|76->45|78->47
                  -- GENERATED --
              */
          