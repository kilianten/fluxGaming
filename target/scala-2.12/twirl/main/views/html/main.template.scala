
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
                                    <li><a href="/addProduct">Add a Product</a></li>
                                    <li><a href="/stockReport">Stock Report</a></li>
                                    <li><a href="/salesReport">Sales Report</a></li>
                                    <li><a href="/moderators">Moderators</a></li>
                                    """)))}),format.raw/*42.38*/("""
                                  """),format.raw/*43.35*/("""</ul>
                                </li>
                                  """)))}),format.raw/*45.36*/("""
                                """)))}),format.raw/*46.34*/("""
              """),format.raw/*47.15*/("""</ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*49.18*/if(user != null)/*49.34*/{_display_(Seq[Any](format.raw/*49.35*/("""
                  """),format.raw/*50.19*/("""<li><a class="dropdown-toggle" data-toggle="dropdown" href="/">"""),_display_(/*50.83*/user/*50.87*/.getUsername()),format.raw/*50.101*/("""
                    """),format.raw/*51.21*/("""<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="/viewOrders">Orders</a></li>
                    </ul>
                </li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*57.19*/else/*57.24*/{_display_(Seq[Any](format.raw/*57.25*/("""
                  """),format.raw/*58.19*/("""<li><a href="/register" ><span class="glyphicon glyphicon-edit"></span> Register</a></li>
                  <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*60.18*/("""
              """),format.raw/*61.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
            """),_display_(/*67.14*/if(loginForm != null)/*67.35*/{_display_(Seq[Any](format.raw/*67.36*/(""" 
    """),format.raw/*68.5*/("""<div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*72.37*/routes/*72.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*72.91*/("""">
          <h2>Login</h2> 
           
          """),_display_(/*75.12*/if(loginForm.hasGlobalErrors)/*75.41*/{_display_(Seq[Any](format.raw/*75.42*/("""
              """),format.raw/*76.15*/("""<script>
                  setTimeout(function()"""),format.raw/*77.40*/("""{"""),format.raw/*77.41*/("""
                          """),format.raw/*78.27*/("""document.getElementById('login').click();
                         """),format.raw/*79.26*/("""}"""),format.raw/*79.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*83.16*/loginForm/*83.25*/.globalError.message),format.raw/*83.45*/("""
            """),format.raw/*84.13*/("""</p>
          """)))}),format.raw/*85.12*/("""
        
  
  
          """),_display_(/*89.12*/helper/*89.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*89.81*/{_display_(Seq[Any](format.raw/*89.82*/("""
          """),_display_(/*90.12*/CSRF/*90.16*/.formField),format.raw/*90.26*/("""
  
          """),format.raw/*92.11*/("""<div class="form-group">
              """),_display_(/*93.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*93.126*/("""
          """),format.raw/*94.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*97.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*97.129*/("""
          """),format.raw/*98.11*/("""</div>
  
          <a href=""""),_display_(/*100.21*/routes/*100.27*/.HomeController.register),format.raw/*100.51*/(""""> Already a member? Click here to log-in</a>
          <br>
          <br>

          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))})))}),format.raw/*107.11*/("""
        """),format.raw/*108.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*116.10*/content),format.raw/*116.17*/("""

        """),format.raw/*118.9*/("""<script src=""""),_display_(/*118.23*/routes/*118.29*/.Assets.versioned("javascripts/main.js")),format.raw/*118.69*/("""" type="text/javascript"></script>
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
                  DATE: Fri Apr 20 16:51:58 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/main.scala.html
                  HASH: 845e05ad6eb570c8428a09f4dbced511d089fc4e
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3195->1753|3234->1754|3295->1787|3700->2165|3741->2197|3780->2198|3845->2235|4276->2635|4339->2670|4449->2749|4514->2783|4557->2798|4662->2876|4687->2892|4726->2893|4773->2912|4864->2976|4877->2980|4913->2994|4962->3015|5317->3352|5330->3357|5369->3358|5416->3377|5663->3593|5706->3608|5835->3710|5865->3731|5904->3732|5937->3738|6146->3920|6161->3926|6230->3974|6309->4026|6347->4055|6386->4056|6429->4071|6505->4119|6534->4120|6589->4147|6684->4214|6713->4215|6845->4320|6863->4329|6904->4349|6945->4362|6992->4378|7046->4405|7061->4411|7133->4474|7172->4475|7211->4487|7224->4491|7255->4501|7297->4515|7364->4555|7496->4665|7535->4676|7621->4735|7757->4849|7796->4860|7854->4890|7870->4896|7916->4920|8166->5135|8203->5144|8543->5456|8572->5463|8610->5473|8652->5487|8668->5493|8730->5533
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|67->36|67->36|67->36|68->37|73->42|74->43|76->45|77->46|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|88->57|88->57|88->57|89->58|91->60|92->61|98->67|98->67|98->67|99->68|103->72|103->72|103->72|106->75|106->75|106->75|107->76|108->77|108->77|109->78|110->79|110->79|114->83|114->83|114->83|115->84|116->85|120->89|120->89|120->89|120->89|121->90|121->90|121->90|123->92|124->93|124->93|125->94|128->97|128->97|129->98|131->100|131->100|131->100|138->107|139->108|147->116|147->116|149->118|149->118|149->118|149->118
                  -- GENERATED --
              */
          