
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
                                    <li><a href=""""),_display_(/*39.51*/routes/*39.57*/.HomeController.salesReport(0)),format.raw/*39.87*/("""">Sales/Stock Report</a></li>
                                    <li><a href="/moderators">Moderators</a></li>
                                    """)))}),format.raw/*41.38*/("""
                                  """),format.raw/*42.35*/("""</ul>
                                </li>
                                  """)))}),format.raw/*44.36*/("""
                                """)))}),format.raw/*45.34*/("""
              """),format.raw/*46.15*/("""</ul>
              <ul class="nav navbar-nav navbar-right">
                """),_display_(/*48.18*/if(user != null)/*48.34*/{_display_(Seq[Any](format.raw/*48.35*/("""
                  """),format.raw/*49.19*/("""<li><a class="dropdown-toggle" data-toggle="dropdown" href="/">"""),_display_(/*49.83*/user/*49.87*/.getUsername()),format.raw/*49.101*/("""
                    """),format.raw/*50.21*/("""<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                      <li><a href="/viewOrders">Orders</a></li>
                    </ul>
                </li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*56.19*/else/*56.24*/{_display_(Seq[Any](format.raw/*56.25*/("""
                  """),format.raw/*57.19*/("""<li><a href="/register" ><span class="glyphicon glyphicon-edit"></span> Register</a></li>
                  <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*59.18*/("""
              """),format.raw/*60.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
            """),_display_(/*66.14*/if(loginForm != null)/*66.35*/{_display_(Seq[Any](format.raw/*66.36*/(""" 
    """),format.raw/*67.5*/("""<div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*71.37*/routes/*71.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*71.91*/("""">
          <h2>Login</h2> 
           
          """),_display_(/*74.12*/if(loginForm.hasGlobalErrors)/*74.41*/{_display_(Seq[Any](format.raw/*74.42*/("""
              """),format.raw/*75.15*/("""<script>
                  setTimeout(function()"""),format.raw/*76.40*/("""{"""),format.raw/*76.41*/("""
                          """),format.raw/*77.27*/("""document.getElementById('login').click();
                         """),format.raw/*78.26*/("""}"""),format.raw/*78.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*82.16*/loginForm/*82.25*/.globalError.message),format.raw/*82.45*/("""
            """),format.raw/*83.13*/("""</p>
          """)))}),format.raw/*84.12*/("""
        
  
  
          """),_display_(/*88.12*/helper/*88.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*88.81*/{_display_(Seq[Any](format.raw/*88.82*/("""
          """),_display_(/*89.12*/CSRF/*89.16*/.formField),format.raw/*89.26*/("""
  
          """),format.raw/*91.11*/("""<div class="form-group">
              """),_display_(/*92.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*92.126*/("""
          """),format.raw/*93.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*96.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*96.129*/("""
          """),format.raw/*97.11*/("""</div>
  
          <a href=""""),_display_(/*99.21*/routes/*99.27*/.HomeController.register),format.raw/*99.51*/(""""> Already a member? Click here to log-in</a>
          <br>
          <br>

          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))})))}),format.raw/*106.11*/("""
        """),format.raw/*107.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*115.10*/content),format.raw/*115.17*/("""

        """),format.raw/*117.9*/("""<script src=""""),_display_(/*117.23*/routes/*117.29*/.Assets.versioned("javascripts/main.js")),format.raw/*117.69*/("""" type="text/javascript"></script>
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
                  DATE: Sun Apr 22 12:41:21 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/main.scala.html
                  HASH: 0d5c59824f343b01758d861325bd074252a7fec4
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3195->1753|3234->1754|3295->1787|3700->2165|3741->2197|3780->2198|3845->2235|4033->2396|4048->2402|4099->2432|4279->2581|4342->2616|4452->2695|4517->2729|4560->2744|4665->2822|4690->2838|4729->2839|4776->2858|4867->2922|4880->2926|4916->2940|4965->2961|5320->3298|5333->3303|5372->3304|5419->3323|5666->3539|5709->3554|5838->3656|5868->3677|5907->3678|5940->3684|6149->3866|6164->3872|6233->3920|6312->3972|6350->4001|6389->4002|6432->4017|6508->4065|6537->4066|6592->4093|6687->4160|6716->4161|6848->4266|6866->4275|6907->4295|6948->4308|6995->4324|7049->4351|7064->4357|7136->4420|7175->4421|7214->4433|7227->4437|7258->4447|7300->4461|7367->4501|7499->4611|7538->4622|7624->4681|7760->4795|7799->4806|7856->4836|7871->4842|7916->4866|8166->5081|8203->5090|8543->5402|8572->5409|8610->5419|8652->5433|8668->5439|8730->5479
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|67->36|67->36|67->36|68->37|70->39|70->39|70->39|72->41|73->42|75->44|76->45|77->46|79->48|79->48|79->48|80->49|80->49|80->49|80->49|81->50|87->56|87->56|87->56|88->57|90->59|91->60|97->66|97->66|97->66|98->67|102->71|102->71|102->71|105->74|105->74|105->74|106->75|107->76|107->76|108->77|109->78|109->78|113->82|113->82|113->82|114->83|115->84|119->88|119->88|119->88|119->88|120->89|120->89|120->89|122->91|123->92|123->92|124->93|127->96|127->96|128->97|130->99|130->99|130->99|137->106|138->107|146->115|146->115|148->117|148->117|148->117|148->117
                  -- GENERATED --
              */
          