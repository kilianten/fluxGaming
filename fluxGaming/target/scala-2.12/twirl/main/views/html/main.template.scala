
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
                                  </ul>
                                </li>
                                  """)))}),format.raw/*38.36*/("""
                                """)))}),format.raw/*39.34*/("""
              """),format.raw/*40.15*/("""</ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*42.18*/if(user != null)/*42.34*/{_display_(Seq[Any](format.raw/*42.35*/("""
                  """),format.raw/*43.19*/("""<li><a href="/">"""),_display_(/*43.36*/user/*43.40*/.getUsername()),format.raw/*43.54*/("""</a></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*45.19*/else/*45.24*/{_display_(Seq[Any](format.raw/*45.25*/("""
                  """),format.raw/*46.19*/("""<li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*47.18*/("""
              """),format.raw/*48.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
    <div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*58.37*/routes/*58.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*58.91*/("""">
          <h2>Login</h2>   
          """),_display_(/*60.12*/if(loginForm.hasGlobalErrors)/*60.41*/{_display_(Seq[Any](format.raw/*60.42*/("""
              """),format.raw/*61.15*/("""<script>
                  setTimeout(function()"""),format.raw/*62.40*/("""{"""),format.raw/*62.41*/("""
                          """),format.raw/*63.27*/("""document.getElementById('login').click();
                         """),format.raw/*64.26*/("""}"""),format.raw/*64.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*68.16*/loginForm/*68.25*/.globalError.message),format.raw/*68.45*/("""
            """),format.raw/*69.13*/("""</p>
          """)))}),format.raw/*70.12*/("""
  
  
          """),_display_(/*73.12*/helper/*73.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*73.81*/{_display_(Seq[Any](format.raw/*73.82*/("""
          """),_display_(/*74.12*/CSRF/*74.16*/.formField),format.raw/*74.26*/("""
  
          """),format.raw/*76.11*/("""<div class="form-group">
              """),_display_(/*77.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*77.126*/("""
          """),format.raw/*78.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*81.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*81.129*/("""
          """),format.raw/*82.11*/("""</div>
  
          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))}),format.raw/*87.10*/("""
        """),format.raw/*88.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*96.10*/content),format.raw/*96.17*/("""

        """),format.raw/*98.9*/("""<script src=""""),_display_(/*98.23*/routes/*98.29*/.Assets.versioned("javascripts/main.js")),format.raw/*98.69*/("""" type="text/javascript"></script>
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
                  DATE: Mon Apr 02 17:55:20 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/fluxGaming/app/views/main.scala.html
                  HASH: 174936d9cc5e943e0e419bf931f4871e32af1f29
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3193->1751|3232->1752|3293->1785|3778->2239|3843->2273|3886->2288|3991->2366|4016->2382|4055->2383|4102->2402|4146->2419|4159->2423|4194->2437|4368->2593|4381->2598|4420->2599|4467->2618|4606->2726|4649->2741|4951->3016|4966->3022|5035->3070|5104->3112|5142->3141|5181->3142|5224->3157|5300->3205|5329->3206|5384->3233|5479->3300|5508->3301|5640->3406|5658->3415|5699->3435|5740->3448|5787->3464|5832->3482|5847->3488|5919->3551|5958->3552|5997->3564|6010->3568|6041->3578|6083->3592|6150->3632|6282->3742|6321->3753|6407->3812|6543->3926|6582->3937|6760->4084|6796->4093|7135->4405|7163->4412|7200->4422|7241->4436|7256->4442|7317->4482
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|69->38|70->39|71->40|73->42|73->42|73->42|74->43|74->43|74->43|74->43|76->45|76->45|76->45|77->46|78->47|79->48|89->58|89->58|89->58|91->60|91->60|91->60|92->61|93->62|93->62|94->63|95->64|95->64|99->68|99->68|99->68|100->69|101->70|104->73|104->73|104->73|104->73|105->74|105->74|105->74|107->76|108->77|108->77|109->78|112->81|112->81|113->82|118->87|119->88|127->96|127->96|129->98|129->98|129->98|129->98
                  -- GENERATED --
              */
          