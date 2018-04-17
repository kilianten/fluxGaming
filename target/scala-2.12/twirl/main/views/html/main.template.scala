
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
                  """),format.raw/*48.19*/("""<li><a href="/register" ><span class="glyphicon glyphicon-edit"></span> Register</a></li>
                  <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                """)))}),format.raw/*50.18*/("""
              """),format.raw/*51.15*/("""</ul>
            </div>
          </div>
        </div>

            <!-- The Modal -->
            """),_display_(/*57.14*/if(loginForm != null)/*57.35*/{_display_(Seq[Any](format.raw/*57.36*/(""" 
    """),format.raw/*58.5*/("""<div id="myModal" class="modal">     
      <!-- Modal content -->
      <div class="modal-content">
          <span class="close">&times;</span>
          <img id="loginLogo" src=""""),_display_(/*62.37*/routes/*62.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*62.91*/("""">
          <h2>Login</h2> 
           
          """),_display_(/*65.12*/if(loginForm.hasGlobalErrors)/*65.41*/{_display_(Seq[Any](format.raw/*65.42*/("""
              """),format.raw/*66.15*/("""<script>
                  setTimeout(function()"""),format.raw/*67.40*/("""{"""),format.raw/*67.41*/("""
                          """),format.raw/*68.27*/("""document.getElementById('login').click();
                         """),format.raw/*69.26*/("""}"""),format.raw/*69.27*/(""",2);
              </script>
            <br>
            <p class="alert alert-warning">
              """),_display_(/*73.16*/loginForm/*73.25*/.globalError.message),format.raw/*73.45*/("""
            """),format.raw/*74.13*/("""</p>
          """)))}),format.raw/*75.12*/("""
        
  
  
          """),_display_(/*79.12*/helper/*79.18*/.form(action = controllers.routes.HomeController.loginSubmit())/*79.81*/{_display_(Seq[Any](format.raw/*79.82*/("""
          """),_display_(/*80.12*/CSRF/*80.16*/.formField),format.raw/*80.26*/("""
  
          """),format.raw/*82.11*/("""<div class="form-group">
              """),_display_(/*83.16*/inputText(loginForm("username"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Username")),format.raw/*83.126*/("""
          """),format.raw/*84.11*/("""</div>
  
          <div class="form-group">
             """),_display_(/*87.15*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*87.129*/("""
          """),format.raw/*88.11*/("""</div>
  
          <a href=""""),_display_(/*90.21*/routes/*90.27*/.HomeController.register),format.raw/*90.51*/(""""> Already a member? Click here to log-in</a>
          <br>
          <br>

          <div class="form-group">
              <input type="submit" value="Sign in" class="btn btn-primary">
          </div>
        """)))})))}),format.raw/*97.11*/("""
        """),format.raw/*98.9*/("""</div>
      </div>
       
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 

        """),_display_(/*106.10*/content),format.raw/*106.17*/("""

        """),format.raw/*108.9*/("""<script src=""""),_display_(/*108.23*/routes/*108.29*/.Assets.versioned("javascripts/main.js")),format.raw/*108.69*/("""" type="text/javascript"></script>
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
                  DATE: Tue Apr 17 20:08:56 IST 2018
                  SOURCE: /home/paul/fluxGaming/fluxGaming/app/views/main.scala.html
                  HASH: 2a07a3eff711d87791ee5a953ad2a53359a88b3c
                  MATRIX: 989->1|1148->89|1192->105|1219->106|1298->211|1333->220|1367->228|1392->233|1590->404|1605->410|1668->451|1756->512|1771->518|1841->566|2092->790|2107->796|2176->844|2997->1638|3022->1654|3061->1655|3124->1691|3193->1751|3232->1752|3293->1785|3948->2409|4013->2443|4056->2458|4161->2536|4186->2552|4225->2553|4272->2572|4316->2589|4329->2593|4364->2607|4538->2763|4551->2768|4590->2769|4637->2788|4884->3004|4927->3019|5056->3121|5086->3142|5125->3143|5158->3149|5367->3331|5382->3337|5451->3385|5530->3437|5568->3466|5607->3467|5650->3482|5726->3530|5755->3531|5810->3558|5905->3625|5934->3626|6066->3731|6084->3740|6125->3760|6166->3773|6213->3789|6267->3816|6282->3822|6354->3885|6393->3886|6432->3898|6445->3902|6476->3912|6518->3926|6585->3966|6717->4076|6756->4087|6842->4146|6978->4260|7017->4271|7074->4301|7089->4307|7134->4331|7383->4546|7419->4555|7759->4867|7788->4874|7826->4884|7868->4898|7884->4904|7946->4944
                  LINES: 28->1|31->2|34->3|35->4|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|48->17|48->17|48->17|60->29|60->29|60->29|61->30|61->30|61->30|62->31|71->40|72->41|73->42|75->44|75->44|75->44|76->45|76->45|76->45|76->45|78->47|78->47|78->47|79->48|81->50|82->51|88->57|88->57|88->57|89->58|93->62|93->62|93->62|96->65|96->65|96->65|97->66|98->67|98->67|99->68|100->69|100->69|104->73|104->73|104->73|105->74|106->75|110->79|110->79|110->79|110->79|111->80|111->80|111->80|113->82|114->83|114->83|115->84|118->87|118->87|119->88|121->90|121->90|121->90|128->97|129->98|137->106|137->106|139->108|139->108|139->108|139->108
                  -- GENERATED --
              */
          