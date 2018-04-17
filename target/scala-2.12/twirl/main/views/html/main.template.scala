
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
                                  """),_display_(/*30.36*/if(user.getRole.equals("admin") || user.getRole.equals("mod"))/*30.98*/{_display_(Seq[Any](format.raw/*30.99*/("""
                                """),format.raw/*31.33*/("""<li class="dropdown">
                                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">Moderator Actions
                                  <span class="caret"></span></a>
                                  <ul class="dropdown-menu">
                                    <li><a href="/addReview">Add Review</a></li>
                                    """),_display_(/*36.38*/if(user.getRole.equals("admin"))/*36.70*/{_display_(Seq[Any](format.raw/*36.71*/("""
                                    """),format.raw/*37.37*/("""<li class="divider"></li>
                                    <li><a href="/stockReport">Stock Report</a></li>
                                    <li><a href="/salesReport">Sales Report</a></li>
                                    <li><a href="/moderators">Moderators</a></li>
                                    """)))}),format.raw/*41.38*/("""
                                  """),format.raw/*42.35*/("""</ul>
                                </li>
                                  """)))}),format.raw/*44.36*/("""
                                """)))}),format.raw/*45.34*/("""
              """),format.raw/*46.15*/("""</ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*48.18*/if(user != null)/*48.34*/{_display_(Seq[Any](format.raw/*48.35*/("""
                  """),format.raw/*49.19*/("""<li><a href="/">"""),_display_(/*49.36*/user/*49.40*/.getUsername()),format.raw/*49.54*/("""</a></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*51.19*/else/*51.24*/{_display_(Seq[Any](format.raw/*51.25*/("""
                  """),format.raw/*52.19*/("""<li><a href="/register" ><span class="glyphicon glyphicon-edit"></span> Register</a></li>
                  <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*54.18*/("""
              """),format.raw/*55.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
            """),_display_(/*61.14*/if(loginForm != null)/*61.35*/{_display_(Seq[Any](format.raw/*61.36*/(""" 
    """),format.raw/*62.5*/("""<div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*66.37*/routes/*66.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*66.91*/("""">
          <h2>Login</h2> 
           
          """),_display_(/*69.12*/if(loginForm.hasGlobalErrors)/*69.41*/{_display_(Seq[Any](format.raw/*69.42*/("""
              """),format.raw/*70.15*/("""<script>
                  setTimeout(function()"""),format.raw/*71.40*/("""{"""),format.raw/*71.41*/("""
                          """),format.raw/*72.27*/("""document.getElementById('login').click();
                         """),format.raw/*73.26*/("""}"""),format.raw/*73.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*77.16*/loginForm/*77.25*/.globalError.message),format.raw/*77.45*/("""
            """),format.raw/*78.13*/("""</p>
          """)))}),format.raw/*79.12*/("""
        
  
  
          """),_display_(/*83.12*/helper/*83.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*83.81*/{_display_(Seq[Any](format.raw/*83.82*/("""
          """),_display_(/*84.12*/CSRF/*84.16*/.formField),format.raw/*84.26*/("""
  
          """),format.raw/*86.11*/("""<div class="form-group">
              """),_display_(/*87.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*87.126*/("""
          """),format.raw/*88.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*91.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*91.129*/("""
          """),format.raw/*92.11*/("""</div>
  
          <a href=""""),_display_(/*94.21*/routes/*94.27*/.HomeController.register),format.raw/*94.51*/(""""> Already a member? Click here to log-in</a>
          <br>
          <br>

          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))})))}),format.raw/*101.11*/("""
        """),format.raw/*102.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*110.10*/content),format.raw/*110.17*/("""

        """),format.raw/*112.9*/("""<script src=""""),_display_(/*112.23*/routes/*112.29*/.Assets.versioned("javascripts/main.js")),format.raw/*112.69*/("""" type="text/javascript"></script>
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
                  DATE: Tue Apr 17 18:45:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/main.scala.html
                  HASH: c35df2661b093b2c7627f434af90949863062729
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3195->1753|3234->1754|3295->1787|3700->2165|3741->2197|3780->2198|3845->2235|4191->2550|4254->2585|4364->2664|4429->2698|4472->2713|4577->2791|4602->2807|4641->2808|4688->2827|4732->2844|4745->2848|4780->2862|4954->3018|4967->3023|5006->3024|5053->3043|5300->3259|5343->3274|5472->3376|5502->3397|5541->3398|5574->3404|5783->3586|5798->3592|5867->3640|5946->3692|5984->3721|6023->3722|6066->3737|6142->3785|6171->3786|6226->3813|6321->3880|6350->3881|6482->3986|6500->3995|6541->4015|6582->4028|6629->4044|6683->4071|6698->4077|6770->4140|6809->4141|6848->4153|6861->4157|6892->4167|6934->4181|7001->4221|7133->4331|7172->4342|7258->4401|7394->4515|7433->4526|7490->4556|7505->4562|7550->4586|7800->4801|7837->4810|8177->5122|8206->5129|8244->5139|8286->5153|8302->5159|8364->5199
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|67->36|67->36|67->36|68->37|72->41|73->42|75->44|76->45|77->46|79->48|79->48|79->48|80->49|80->49|80->49|80->49|82->51|82->51|82->51|83->52|85->54|86->55|92->61|92->61|92->61|93->62|97->66|97->66|97->66|100->69|100->69|100->69|101->70|102->71|102->71|103->72|104->73|104->73|108->77|108->77|108->77|109->78|110->79|114->83|114->83|114->83|114->83|115->84|115->84|115->84|117->86|118->87|118->87|119->88|122->91|122->91|123->92|125->94|125->94|125->94|132->101|133->102|141->110|141->110|143->112|143->112|143->112|143->112
                  -- GENERATED --
              */
          