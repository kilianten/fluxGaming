
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[models.users.Login],models.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, loginForm: Form[models.users.Login], user: models.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*7.62*/("""
        """),format.raw/*8.9*/("""<title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*11.113*/("""">
    </head>
    <body>
        <!--- NAVBAR -->
        <div id="custom-bootstrap-menu" class="navbar navbar-default " role="navigation">
          <div class="container-fluid">
          <a href="/"><img id="logo" src=""""),_display_(/*17.44*/routes/*17.50*/.Assets.versioned("images/logos/logoBanner.png")),format.raw/*17.98*/(""""></a>
            <div class="navbar-header"><a class="navbar-brand" href="/"></a>
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-menubuilder"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
              </button>
            </div>
            <div class="collapse navbar-collapse navbar-menubuilder">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="/">Home</a></li>
                <li><a href="/reviews">Reviews</a></li>
                <li><a href="/store">Store</a></li>
                <li><a href="/">Contact</a></li>
                                <!-- DROPDOWN MENU -->
                                """),_display_(/*29.34*/if(user != null)/*29.50*/{_display_(Seq[Any](format.raw/*29.51*/("""
                                  """),_display_(/*30.36*/if(user.getRole.equals("admin") || user.equals("moderator"))/*30.96*/{_display_(Seq[Any](format.raw/*30.97*/("""
                                """),format.raw/*31.33*/("""<li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">Moderator Actions
                                  <span class="caret"></span></a>
                                  <ul class="dropdown-menu">
                                    <li><a href="/addReview">Add Review</a></li>
                                    <li><a href="/stockReport">Stock Report</a></li>
                                    <li><a href="/salesReport">Sales Report</a></li>
                                  </ul>
                                </li>
                                  """)))}),format.raw/*40.36*/("""
                                """)))}),format.raw/*41.34*/("""
              """),format.raw/*42.15*/("""</ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*44.18*/if(user != null)/*44.34*/{_display_(Seq[Any](format.raw/*44.35*/("""
                  """),format.raw/*45.19*/("""<li><a href="/">"""),_display_(/*45.36*/user/*45.40*/.getUsername()),format.raw/*45.54*/("""</a></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*47.19*/else/*47.24*/{_display_(Seq[Any](format.raw/*47.25*/("""
                  """),format.raw/*48.19*/("""<li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*49.18*/("""
              """),format.raw/*50.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
    <div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*60.37*/routes/*60.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*60.91*/("""">
          <h2>Login</h2>   
          """),_display_(/*62.12*/if(loginForm.hasGlobalErrors)/*62.41*/{_display_(Seq[Any](format.raw/*62.42*/("""
              """),format.raw/*63.15*/("""<script>
                  setTimeout(function()"""),format.raw/*64.40*/("""{"""),format.raw/*64.41*/("""
                          """),format.raw/*65.27*/("""document.getElementById('login').click();
                         """),format.raw/*66.26*/("""}"""),format.raw/*66.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*70.16*/loginForm/*70.25*/.globalError.message),format.raw/*70.45*/("""
            """),format.raw/*71.13*/("""</p>
          """)))}),format.raw/*72.12*/("""
  
  
          """),_display_(/*75.12*/helper/*75.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*75.81*/{_display_(Seq[Any](format.raw/*75.82*/("""
          """),_display_(/*76.12*/CSRF/*76.16*/.formField),format.raw/*76.26*/("""
  
          """),format.raw/*78.11*/("""<div class="form-group">
              """),_display_(/*79.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*79.126*/("""
          """),format.raw/*80.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*83.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*83.129*/("""
          """),format.raw/*84.11*/("""</div>
  
          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))}),format.raw/*89.10*/("""
        """),format.raw/*90.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*98.10*/content),format.raw/*98.17*/("""

        """),format.raw/*100.9*/("""<script src=""""),_display_(/*100.23*/routes/*100.29*/.Assets.versioned("javascripts/main.js")),format.raw/*100.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,loginForm:Form[models.users.Login],user:models.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,loginForm,user)(content)

  def f:((String,Form[models.users.Login],models.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,loginForm,user) => (content) => apply(title,loginForm,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 10 11:49:45 IST 2018
                  SOURCE: /home/paul/fluxGaming/fluxGaming/app/views/main.scala.html
                  HASH: 74f353a9c5dcc59f509ef0f1d09c2d90974a8217
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3193->1751|3232->1752|3293->1785|3948->2409|4013->2443|4056->2458|4161->2536|4186->2552|4225->2553|4272->2572|4316->2589|4329->2593|4364->2607|4538->2763|4551->2768|4590->2769|4637->2788|4776->2896|4819->2911|5121->3186|5136->3192|5205->3240|5274->3282|5312->3311|5351->3312|5394->3327|5470->3375|5499->3376|5554->3403|5649->3470|5678->3471|5810->3576|5828->3585|5869->3605|5910->3618|5957->3634|6002->3652|6017->3658|6089->3721|6128->3722|6167->3734|6180->3738|6211->3748|6253->3762|6320->3802|6452->3912|6491->3923|6577->3982|6713->4096|6752->4107|6930->4254|6966->4263|7305->4575|7333->4582|7371->4592|7413->4606|7429->4612|7491->4652
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|71->40|72->41|73->42|75->44|75->44|75->44|76->45|76->45|76->45|76->45|78->47|78->47|78->47|79->48|80->49|81->50|91->60|91->60|91->60|93->62|93->62|93->62|94->63|95->64|95->64|96->65|97->66|97->66|101->70|101->70|101->70|102->71|103->72|106->75|106->75|106->75|106->75|107->76|107->76|107->76|109->78|110->79|110->79|111->80|114->83|114->83|115->84|120->89|121->90|129->98|129->98|131->100|131->100|131->100|131->100
                  -- GENERATED --
              */
          