
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
"""),_display_(/*4.2*/main("Register", null, user)/*4.30*/{_display_(Seq[Any](format.raw/*4.31*/("""

    """),format.raw/*6.5*/("""<img id="loginLogo" src=""""),_display_(/*6.31*/routes/*6.37*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*6.85*/("""">
    <br>
    <br>
    <div class="container">

    <h1>Register</h1> 
    <br>  
    """),_display_(/*13.6*/if(registerForm.hasGlobalErrors)/*13.38*/{_display_(Seq[Any](format.raw/*13.39*/("""

      """),format.raw/*15.7*/("""<p class="alert alert-warning">
        """),_display_(/*16.10*/registerForm/*16.22*/.globalError.message),format.raw/*16.42*/("""
      """),format.raw/*17.7*/("""</p>
    """)))}),format.raw/*18.6*/("""


    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.HomeController.registerSubmit())/*21.78*/{_display_(Seq[Any](format.raw/*21.79*/("""
   

    """),format.raw/*24.5*/("""<div class="form-group">
        """),_display_(/*25.10*/inputText(registerForm("username"), '_label -> "Username", 'class -> "form-control input-xs", 'placeholder -> "Username", '_help -> "")),format.raw/*25.145*/("""
    """),format.raw/*26.5*/("""</div>

    <div class="form-group">
        """),_display_(/*29.10*/inputText(registerForm("email"), '_label -> "Email", 'class -> "form-control input-xs", 'placeholder -> "Email", '_help -> "")),format.raw/*29.136*/("""
    """),format.raw/*30.5*/("""</div>

    <div class="form-group">
       """),_display_(/*33.9*/inputPassword(registerForm("password"), '_label -> "Password", 'class -> "form-control input-xs", 'placeholder -> "Password", '_help -> "")),format.raw/*33.148*/("""
    """),format.raw/*34.5*/("""</div>

    <div class="form-group">
        """),_display_(/*37.10*/inputPassword(registerForm("confirmPassword"), '_label -> "Confirm Password", 'class -> "form-control input-xs", 'placeholder -> "Confirm Password", '_help -> "")),format.raw/*37.172*/("""
    """),format.raw/*38.5*/("""</div>


    <div class="form-group">
        <input type="submit" value="Register" class="btn btn-primary">
    </div>

    </div>
  """)))}),format.raw/*46.4*/("""
""")))}),format.raw/*47.2*/("""
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
                  DATE: Tue Apr 17 20:08:56 IST 2018
                  SOURCE: /home/paul/fluxGaming/fluxGaming/app/views/register.scala.html
                  HASH: d317450dc6b9732a732a1b5e03eb63db81ed70a2
                  MATRIX: 1009->1|1181->102|1225->118|1252->120|1288->148|1326->149|1358->155|1410->181|1424->187|1492->235|1607->324|1648->356|1687->357|1722->365|1790->406|1811->418|1852->438|1886->445|1926->455|1960->463|1975->469|2050->535|2089->536|2126->546|2187->580|2344->715|2376->720|2449->766|2597->892|2629->897|2700->942|2861->1081|2893->1086|2966->1132|3150->1294|3182->1299|3347->1434|3379->1436
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|37->6|37->6|37->6|37->6|44->13|44->13|44->13|46->15|47->16|47->16|47->16|48->17|49->18|52->21|52->21|52->21|52->21|55->24|56->25|56->25|57->26|60->29|60->29|61->30|64->33|64->33|65->34|68->37|68->37|69->38|77->46|78->47
                  -- GENERATED --
              */
          