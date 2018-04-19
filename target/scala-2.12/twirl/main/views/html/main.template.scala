
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
                  """),format.raw/*50.19*/("""<li><a href="/">"""),_display_(/*50.36*/user/*50.40*/.getUsername()),format.raw/*50.54*/("""</a></li>
                  <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Log Out </a></li>                    
                """)))}/*52.19*/else/*52.24*/{_display_(Seq[Any](format.raw/*52.25*/("""
                  """),format.raw/*53.19*/("""<li><a href="/register" ><span class="glyphicon glyphicon-edit"></span> Register</a></li>
                  <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*55.18*/("""
              """),format.raw/*56.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
            """),_display_(/*62.14*/if(loginForm != null)/*62.35*/{_display_(Seq[Any](format.raw/*62.36*/(""" 
    """),format.raw/*63.5*/("""<div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*67.37*/routes/*67.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*67.91*/("""">
          <h2>Login</h2> 
           
          """),_display_(/*70.12*/if(loginForm.hasGlobalErrors)/*70.41*/{_display_(Seq[Any](format.raw/*70.42*/("""
              """),format.raw/*71.15*/("""<script>
                  setTimeout(function()"""),format.raw/*72.40*/("""{"""),format.raw/*72.41*/("""
                          """),format.raw/*73.27*/("""document.getElementById('login').click();
                         """),format.raw/*74.26*/("""}"""),format.raw/*74.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*78.16*/loginForm/*78.25*/.globalError.message),format.raw/*78.45*/("""
            """),format.raw/*79.13*/("""</p>
          """)))}),format.raw/*80.12*/("""
        
  
  
          """),_display_(/*84.12*/helper/*84.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*84.81*/{_display_(Seq[Any](format.raw/*84.82*/("""
          """),_display_(/*85.12*/CSRF/*85.16*/.formField),format.raw/*85.26*/("""
  
          """),format.raw/*87.11*/("""<div class="form-group">
              """),_display_(/*88.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*88.126*/("""
          """),format.raw/*89.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*92.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*92.129*/("""
          """),format.raw/*93.11*/("""</div>
  
          <a href=""""),_display_(/*95.21*/routes/*95.27*/.HomeController.register),format.raw/*95.51*/(""""> Already a member? Click here to log-in</a>
          <br>
          <br>

          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))})))}),format.raw/*102.11*/("""
        """),format.raw/*103.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*111.10*/content),format.raw/*111.17*/("""

        """),format.raw/*113.9*/("""<script src=""""),_display_(/*113.23*/routes/*113.29*/.Assets.versioned("javascripts/main.js")),format.raw/*113.69*/("""" type="text/javascript"></script>
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
                  DATE: Thu Apr 19 20:51:26 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/main.scala.html
                  HASH: 57d2d10d3f9568a5c4bbcf3382aee960d76f6405
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3195->1753|3234->1754|3295->1787|3700->2165|3741->2197|3780->2198|3845->2235|4276->2635|4339->2670|4449->2749|4514->2783|4557->2798|4662->2876|4687->2892|4726->2893|4773->2912|4817->2929|4830->2933|4865->2947|5039->3103|5052->3108|5091->3109|5138->3128|5385->3344|5428->3359|5557->3461|5587->3482|5626->3483|5659->3489|5868->3671|5883->3677|5952->3725|6031->3777|6069->3806|6108->3807|6151->3822|6227->3870|6256->3871|6311->3898|6406->3965|6435->3966|6567->4071|6585->4080|6626->4100|6667->4113|6714->4129|6768->4156|6783->4162|6855->4225|6894->4226|6933->4238|6946->4242|6977->4252|7019->4266|7086->4306|7218->4416|7257->4427|7343->4486|7479->4600|7518->4611|7575->4641|7590->4647|7635->4671|7885->4886|7922->4895|8262->5207|8291->5214|8329->5224|8371->5238|8387->5244|8449->5284
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|67->36|67->36|67->36|68->37|73->42|74->43|76->45|77->46|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|83->52|83->52|83->52|84->53|86->55|87->56|93->62|93->62|93->62|94->63|98->67|98->67|98->67|101->70|101->70|101->70|102->71|103->72|103->72|104->73|105->74|105->74|109->78|109->78|109->78|110->79|111->80|115->84|115->84|115->84|115->84|116->85|116->85|116->85|118->87|119->88|119->88|120->89|123->92|123->92|124->93|126->95|126->95|126->95|133->102|134->103|142->111|142->111|144->113|144->113|144->113|144->113
                  -- GENERATED --
              */
          