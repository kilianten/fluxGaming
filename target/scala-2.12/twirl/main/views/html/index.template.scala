
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],List[models.Review],play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], reviews: List[models.Review], env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Home", loginForm, user)/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

  """),format.raw/*5.3*/("""<head>
      <link rel="stylesheet" href=""""),_display_(/*6.37*/routes/*6.43*/.Assets.versioned("stylesheets/index.css")),format.raw/*6.85*/("""">                
  </head>

  <div class="container-fluid">

      <div class="row">
        <div class="col-lg-9">

          <!-- active, newest review -->
          <div id="indexCarousel" class="carousel slide" data-ride="carousel">
            <div class = "carousel-inner">
              <div class = "item active"> 
                <a href=""""),_display_(/*18.27*/routes/*18.33*/.HomeController.review(reviews(0).getId)),format.raw/*18.73*/(""""> 
                  """),_display_(/*19.20*/if(env.resource("public/images/gamePictures/" + reviews.get(0).getId + ".jpg").isDefined)/*19.109*/ {_display_(Seq[Any](format.raw/*19.111*/("""
                    """),format.raw/*20.21*/("""<img class="caroselImage" src="/assets/images/gamePictures/"""),_display_(/*20.81*/(reviews.get(0).getId + ".jpg")),format.raw/*20.112*/(""""/>
                  """)))}/*21.21*/else/*21.26*/{_display_(Seq[Any](format.raw/*21.27*/("""
                    """),format.raw/*22.21*/("""<img class="caroselImage" src="/assets/images/misc/notFoundBanner.png"/>
                  """)))}),format.raw/*23.20*/("""
                  """),format.raw/*24.19*/("""<div class="carousel-caption d-none d-md-block">
                  <h2>"""),_display_(/*25.24*/reviews/*25.31*/.get(0).getName),format.raw/*25.46*/("""</h2>
                  <p><i>"""),_display_(/*26.26*/reviews/*26.33*/.get(0).getCaption),format.raw/*26.51*/("""</i></p>
                  
                </a>
              </div>
            </div>
            <!-- Cycle through review 1-4 -->
            """),_display_(/*32.14*/for(i <- 1 to (reviews.size -1)) yield /*32.46*/{_display_(Seq[Any](format.raw/*32.47*/("""
              """),format.raw/*33.15*/("""<div class = "item">  
                <a href=""""),_display_(/*34.27*/routes/*34.33*/.HomeController.review(reviews(i).getId)),format.raw/*34.73*/(""""> 
                  """),_display_(/*35.20*/if(env.resource("public/images/gamePictures/" + reviews.get(i).getId + ".jpg").isDefined)/*35.109*/ {_display_(Seq[Any](format.raw/*35.111*/("""
                    """),format.raw/*36.21*/("""<img class="caroselImage" src="/assets/images/gamePictures/"""),_display_(/*36.81*/(reviews.get(i).getId + ".jpg")),format.raw/*36.112*/(""""/>
                  """)))}/*37.21*/else/*37.26*/{_display_(Seq[Any](format.raw/*37.27*/("""
                    """),format.raw/*38.21*/("""<img class="caroselImage" src="/assets/images/misc/notFoundBanner.png"/>
                  """)))}),format.raw/*39.20*/("""
                """),format.raw/*40.17*/("""<div class="carousel-caption d-none d-md-block">
                <h2>"""),_display_(/*41.22*/reviews/*41.29*/.get(i).getName),format.raw/*41.44*/("""</h2>
                <p><i>"""),_display_(/*42.24*/reviews/*42.31*/.get(i).getCaption),format.raw/*42.49*/("""</i></p>
                </a>
                </div>
              </div> 
              """)))}),format.raw/*46.16*/("""  
              """),format.raw/*47.15*/("""<a class="left carousel-control" href="#indexCarousel" data-slide="prev">
                  <span class="glyphicon glyphicon-chevron-left"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#indexCarousel" data-slide="next">
                  <span class="glyphicon glyphicon-chevron-right"></span>
                  <span class="sr-only">Next</span>
                </a>
              </div><!--  end of carosel -->      
            </div> <!-- end of col -->
          </div>  <!-- end of row -->
        
      <div class="col-lg-3">
          """),_display_(/*60.12*/if(flash.containsKey("success"))/*60.44*/{_display_(Seq[Any](format.raw/*60.45*/("""
            """),format.raw/*61.13*/("""<div class="alert alert-success">
              """),_display_(/*62.16*/flash/*62.21*/.get("success")),format.raw/*62.36*/("""
            """),format.raw/*63.13*/("""</div>
          """)))}),format.raw/*64.12*/("""
          """),format.raw/*65.11*/("""<a href=""""),_display_(/*65.21*/routes/*65.27*/.HomeController.store),format.raw/*65.48*/("""">
            <div class="jumbotron">
              
              <h2>Store</h2>
              <hr>

              <p>Check out our store page to get some FluxGaming merch to show your friends!</p>

              <img id="logoStore" src=""""),_display_(/*73.41*/routes/*73.47*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*73.95*/("""">

            </div>
          </a>
      </div>

      <!--  end of container -->
  
  </div> 
""")))}),format.raw/*82.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],reviews:List[models.Review],env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,reviews,env)

  def f:((models.User,Form[models.users.Login],List[models.Review],play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,reviews,env) => apply(user,loginForm,reviews,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/index.scala.html
                  HASH: a71960a976cfc8cd781b6c091ea4d36c941d2ed5
                  MATRIX: 1019->1|1226->115|1253->117|1290->146|1329->148|1359->152|1428->195|1442->201|1504->243|1882->594|1897->600|1958->640|2008->663|2107->752|2148->754|2197->775|2284->835|2337->866|2379->890|2392->895|2431->896|2480->917|2603->1009|2650->1028|2749->1100|2765->1107|2801->1122|2859->1153|2875->1160|2914->1178|3089->1326|3137->1358|3176->1359|3219->1374|3295->1423|3310->1429|3371->1469|3421->1492|3520->1581|3561->1583|3610->1604|3697->1664|3750->1695|3792->1719|3805->1724|3844->1725|3893->1746|4016->1838|4061->1855|4158->1925|4174->1932|4210->1947|4266->1976|4282->1983|4321->2001|4442->2091|4487->2108|5153->2747|5194->2779|5233->2780|5274->2793|5350->2842|5364->2847|5400->2862|5441->2875|5490->2893|5529->2904|5566->2914|5581->2920|5623->2941|5891->3182|5906->3188|5975->3236|6104->3335
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|63->32|63->32|63->32|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|77->46|78->47|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|95->64|96->65|96->65|96->65|96->65|104->73|104->73|104->73|113->82
                  -- GENERATED --
              */
          