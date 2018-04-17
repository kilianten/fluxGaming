
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

object review extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],models.Review,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], review: models.Review, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(review.getName + " Review", loginForm, user)/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""

  """),format.raw/*5.3*/("""<head>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/review.css")),format.raw/*6.84*/("""">                
  </head>


  <div class="container-fluid">
      
    <img id="logoReview" src=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*12.86*/("""">
    <img id="logoReviewRight" src=""""),_display_(/*13.37*/routes/*13.43*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*13.91*/("""">

    <div class="gradientBoxesWithOuterShadows">
      <h1 id="title">Review: """),_display_(/*16.31*/review/*16.37*/.getName),format.raw/*16.45*/(""" """),format.raw/*16.46*/("""( """),_display_(/*16.49*/review/*16.55*/.getYear),format.raw/*16.63*/(""" """),format.raw/*16.64*/(""")</h1>

      <div class="img-container">
          """),_display_(/*19.12*/if(env.resource("public/images/gamePictures/" + review.getId + ".jpg").isDefined)/*19.93*/ {_display_(Seq[Any](format.raw/*19.95*/("""
            """),format.raw/*20.13*/("""<img class="banner" src="/assets/images/gamePictures/"""),_display_(/*20.67*/(review.getId + ".jpg")),format.raw/*20.90*/(""""/>
            <img class="top" src="/assets/images/misc/blurry.png"/>
            
          """)))}/*23.13*/else/*23.18*/{_display_(Seq[Any](format.raw/*23.19*/("""
            """),format.raw/*24.13*/("""<img class="banner" src="/assets/images/misc/notFoundBanner.png"/>
          """)))}),format.raw/*25.12*/("""
          """),format.raw/*26.11*/("""</div>


    <div id="reviewBody">
      <h3><i>"""),_display_(/*30.15*/review/*30.21*/.getCaption),format.raw/*30.32*/("""</i></h3>
      <hr>
      """),_display_(/*32.8*/for(g <- review.getGenres) yield /*32.34*/{_display_(Seq[Any](format.raw/*32.35*/("""
        """),format.raw/*33.9*/("""<button disabled class="genreBtn" type="button">"""),_display_(/*33.58*/g/*33.59*/.getName),format.raw/*33.67*/("""</button>  
      """)))}),format.raw/*34.8*/("""
      """),format.raw/*35.7*/("""<hr>
      """),_display_(/*36.8*/if(env.resource("public/images/gamePictures/" + review.getId + "Tile.jpg").isDefined)/*36.93*/ {_display_(Seq[Any](format.raw/*36.95*/("""
        """),format.raw/*37.9*/("""<img class="tile" src="/assets/images/gamePictures/"""),_display_(/*37.61*/(review.getId + "Tile.jpg")),format.raw/*37.88*/(""""/>
      """)))}),format.raw/*38.8*/("""

      """),format.raw/*40.7*/("""<p id="review">"""),_display_(/*40.23*/review/*40.29*/.getReview),format.raw/*40.39*/("""</p>

      <br>

        <h3>Rating:</h3> 
        """),_display_(/*45.10*/for(i <- 1 to review.getRating) yield /*45.41*/{_display_(Seq[Any](format.raw/*45.42*/("""          
         """),format.raw/*46.10*/("""<img id="star" src=""""),_display_(/*46.31*/routes/*46.37*/.Assets.versioned("images/misc/star.png")),format.raw/*46.78*/("""">
        """)))}),format.raw/*47.10*/("""

        """),_display_(/*49.10*/if(review.getRating > 0)/*49.34*/{_display_(Seq[Any](format.raw/*49.35*/("""
          """),_display_(/*50.12*/review/*50.18*/.getRating),format.raw/*50.28*/(""" """),format.raw/*50.29*/("""/10
        """)))}),format.raw/*51.10*/("""

        """),format.raw/*53.9*/("""<br>
        <br>

    </div>



  </div>   
  
  </div>

""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],review:models.Review,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,review,env)

  def f:((models.User,Form[models.users.Login],models.Review,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,review,env) => apply(user,loginForm,review,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 20:08:56 IST 2018
                  SOURCE: /home/paul/fluxGaming/fluxGaming/app/views/review.scala.html
                  HASH: 9260bf97ec1b130c52357ea46753fbc3da9970c3
                  MATRIX: 1014->1|1214->108|1241->110|1298->159|1337->161|1367->165|1434->206|1448->212|1511->255|1639->356|1654->362|1723->410|1789->449|1804->455|1873->503|1982->585|1997->591|2026->599|2055->600|2085->603|2100->609|2129->617|2158->618|2238->671|2328->752|2368->754|2409->767|2490->821|2534->844|2649->941|2662->946|2701->947|2742->960|2851->1038|2890->1049|2966->1098|2981->1104|3013->1115|3067->1143|3109->1169|3148->1170|3184->1179|3260->1228|3270->1229|3299->1237|3348->1256|3382->1263|3420->1275|3514->1360|3554->1362|3590->1371|3669->1423|3717->1450|3758->1461|3793->1469|3836->1485|3851->1491|3882->1501|3962->1554|4009->1585|4048->1586|4096->1606|4144->1627|4159->1633|4221->1674|4264->1686|4302->1697|4335->1721|4374->1722|4413->1734|4428->1740|4459->1750|4488->1751|4532->1764|4569->1774|4658->1833
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|43->12|43->12|43->12|44->13|44->13|44->13|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|55->24|56->25|57->26|61->30|61->30|61->30|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|71->40|71->40|71->40|71->40|76->45|76->45|76->45|77->46|77->46|77->46|77->46|78->47|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|84->53|95->64
                  -- GENERATED --
              */
          