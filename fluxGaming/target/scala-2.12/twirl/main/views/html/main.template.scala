
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
              </ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*30.18*/if(user != null)/*30.34*/{_display_(Seq[Any](format.raw/*30.35*/("""
                  """),format.raw/*31.19*/("""<li><a href="/">"""),_display_(/*31.36*/user/*31.40*/.getUsername()),format.raw/*31.54*/("""</a></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*33.19*/else/*33.24*/{_display_(Seq[Any](format.raw/*33.25*/("""
                  """),format.raw/*34.19*/("""<li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*35.18*/("""
              """),format.raw/*36.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
    <div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*46.37*/routes/*46.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*46.91*/("""">
          <h2>Login</h2>   
          """),_display_(/*48.12*/if(loginForm.hasGlobalErrors)/*48.41*/{_display_(Seq[Any](format.raw/*48.42*/("""
              """),format.raw/*49.15*/("""<script>
                  setTimeout(function()"""),format.raw/*50.40*/("""{"""),format.raw/*50.41*/("""
                          """),format.raw/*51.27*/("""document.getElementById('login').click();
                         """),format.raw/*52.26*/("""}"""),format.raw/*52.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*56.16*/loginForm/*56.25*/.globalError.message),format.raw/*56.45*/("""
            """),format.raw/*57.13*/("""</p>
          """)))}),format.raw/*58.12*/("""
  
  
          """),_display_(/*61.12*/helper/*61.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*61.81*/{_display_(Seq[Any](format.raw/*61.82*/("""
          """),_display_(/*62.12*/CSRF/*62.16*/.formField),format.raw/*62.26*/("""
  
          """),format.raw/*64.11*/("""<div class="form-group">
              """),_display_(/*65.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*65.126*/("""
          """),format.raw/*66.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*69.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*69.129*/("""
          """),format.raw/*70.11*/("""</div>
  
          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))}),format.raw/*75.10*/("""
        """),format.raw/*76.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*84.10*/content),format.raw/*84.17*/("""

        """),format.raw/*86.9*/("""<script src=""""),_display_(/*86.23*/routes/*86.29*/.Assets.versioned("javascripts/main.js")),format.raw/*86.69*/("""" type="text/javascript"></script>
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
                  DATE: Mon Apr 02 13:38:39 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/fluxGaming/app/views/main.scala.html
                  HASH: 1363a62b05a556ed65ef3144c683de84754338de
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|3001->1642|3026->1658|3065->1659|3112->1678|3156->1695|3169->1699|3204->1713|3378->1869|3391->1874|3430->1875|3477->1894|3616->2002|3659->2017|3961->2292|3976->2298|4045->2346|4114->2388|4152->2417|4191->2418|4234->2433|4310->2481|4339->2482|4394->2509|4489->2576|4518->2577|4650->2682|4668->2691|4709->2711|4750->2724|4797->2740|4842->2758|4857->2764|4929->2827|4968->2828|5007->2840|5020->2844|5051->2854|5093->2868|5160->2908|5292->3018|5331->3029|5417->3088|5553->3202|5592->3213|5770->3360|5806->3369|6145->3681|6173->3688|6210->3698|6251->3712|6266->3718|6327->3758
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|61->30|61->30|61->30|62->31|62->31|62->31|62->31|64->33|64->33|64->33|65->34|66->35|67->36|77->46|77->46|77->46|79->48|79->48|79->48|80->49|81->50|81->50|82->51|83->52|83->52|87->56|87->56|87->56|88->57|89->58|92->61|92->61|92->61|92->61|93->62|93->62|93->62|95->64|96->65|96->65|97->66|100->69|100->69|101->70|106->75|107->76|115->84|115->84|117->86|117->86|117->86|117->86
                  -- GENERATED --
              */
          