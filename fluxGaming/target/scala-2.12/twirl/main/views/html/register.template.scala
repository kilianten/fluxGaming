
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

object register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,Form[models.users.Login],Form[models.users.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], registerForm: Form[models.users.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Register", loginForm, user)/*4.35*/{_display_(Seq[Any](format.raw/*4.36*/("""

    """),format.raw/*6.5*/("""<img id="loginLogo" src=""""),_display_(/*6.31*/routes/*6.37*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*6.85*/("""">
    <br>
    <br>
    <div class="container">

    <h2>Register</h2>   
    """),_display_(/*12.6*/if(registerForm.hasGlobalErrors)/*12.38*/{_display_(Seq[Any](format.raw/*12.39*/("""

      """),format.raw/*14.7*/("""<p class="alert alert-warning">
        """),_display_(/*15.10*/registerForm/*15.22*/.globalError.message),format.raw/*15.42*/("""
      """),format.raw/*16.7*/("""</p>
    """)))}),format.raw/*17.6*/("""


    """),_display_(/*20.6*/helper/*20.12*/.form(action = controllers.routes.HomeController.registerSubmit())/*20.78*/{_display_(Seq[Any](format.raw/*20.79*/("""
    """),_display_(/*21.6*/CSRF/*21.10*/.formField),format.raw/*21.20*/("""

    """),format.raw/*23.5*/("""<div class="form-group">
        """),_display_(/*24.10*/inputText(registerForm("username"), '_label -> "Username", 'class -> "form-control input-xs", 'placeholder -> "Username", '_help -> "")),format.raw/*24.145*/("""
    """),format.raw/*25.5*/("""</div>

    <div class="form-group">
        """),_display_(/*28.10*/inputText(registerForm("email"), '_label -> "Email", 'class -> "form-control input-xs", 'placeholder -> "Email", '_help -> "")),format.raw/*28.136*/("""
    """),format.raw/*29.5*/("""</div>

    <div class="form-group">
       """),_display_(/*32.9*/inputPassword(registerForm("password"), '_label -> "Password", 'class -> "form-control input-xs", 'placeholder -> "Password", '_help -> "")),format.raw/*32.148*/("""
    """),format.raw/*33.5*/("""</div>

    <div class="form-group">
        """),_display_(/*36.10*/inputPassword(registerForm("confirmPassword"), '_label -> "Confirm Password", 'class -> "form-control input-xs", 'placeholder -> "Confirm Password", '_help -> "")),format.raw/*36.172*/("""
    """),format.raw/*37.5*/("""</div>


    <div class="form-group">
        <input type="submit" value="Register" class="btn btn-primary">
    </div>

    </div>
  """)))}),format.raw/*45.4*/("""
""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],registerForm:Form[models.users.Register]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,registerForm)

  def f:((models.User,Form[models.users.Login],Form[models.users.Register]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,registerForm) => apply(user,loginForm,registerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 18:24:43 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/register.scala.html
                  HASH: a3857ab7cb378edd4c61dc9deb6f2ad7f967e81b
                  MATRIX: 1009->1|1181->102|1225->118|1252->120|1293->153|1331->154|1363->160|1415->186|1429->192|1497->240|1603->320|1644->352|1683->353|1718->361|1786->402|1807->414|1848->434|1882->441|1922->451|1956->459|1971->465|2046->531|2085->532|2117->538|2130->542|2161->552|2194->558|2255->592|2412->727|2444->732|2517->778|2665->904|2697->909|2768->954|2929->1093|2961->1098|3034->1144|3218->1306|3250->1311|3415->1446|3447->1448
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|37->6|37->6|37->6|43->12|43->12|43->12|45->14|46->15|46->15|46->15|47->16|48->17|51->20|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|55->24|56->25|59->28|59->28|60->29|63->32|63->32|64->33|67->36|67->36|68->37|76->45|77->46
                  -- GENERATED --
              */
          