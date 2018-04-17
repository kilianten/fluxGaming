
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

object reviews extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template7[models.User,Form[models.users.Login],List[models.Review],play.api.Environment,List[models.Genre],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], reviews: List[models.Review], env: play.api.Environment, genres: List[models.Genre], genreId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Reviews", loginForm, user)/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

  """),format.raw/*5.3*/("""<head>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/reviews.css")),format.raw/*6.85*/("""">                
  </head>

  <div id="actions">
    <form action=""""),_display_(/*10.20*/routes/*10.26*/.HomeController.reviews(genreId)),format.raw/*10.58*/("""" method="GET">
      <input type="search" id="searchbox" name="filter" value=""""),_display_(/*11.65*/filter),format.raw/*11.71*/("""" placeholder="Search Review Name">
      <input type="submit" id="searchsubmit" value="Filter by title" class="btn-md btn-primary">
    </form>
  </div>

  <h1 style="text-align:center;">Reviews</h1>

  """),_display_(/*18.4*/if(!filter.equals(""))/*18.26*/{_display_(Seq[Any](format.raw/*18.27*/("""
    """),format.raw/*19.5*/("""<p style="text-align: center;"> Showing results for: """),_display_(/*19.59*/filter),format.raw/*19.65*/(""" """),format.raw/*19.66*/("""</p>
  """)))}),format.raw/*20.4*/("""

        """),format.raw/*22.9*/("""<div class="col-md-3 hidden-sm hidden-xs">
          <div class="list-group">
            <a href=""""),_display_(/*24.23*/routes/*24.29*/.HomeController.reviews(0, filter)),format.raw/*24.63*/("""" class="list-group-item">All Genres</a>
            """),_display_(/*25.14*/for(g <- genres) yield /*25.30*/{_display_(Seq[Any](format.raw/*25.31*/("""
              """),format.raw/*26.15*/("""<a href=""""),_display_(/*26.25*/routes/*26.31*/.HomeController.reviews(g.getId, filter)),format.raw/*26.71*/("""" class="list-group-item"> """),_display_(/*26.99*/g/*26.100*/.getName),format.raw/*26.108*/("""
                """),format.raw/*27.17*/("""<span class="badge">"""),_display_(/*27.38*/g/*27.39*/.getReviews.size()),format.raw/*27.57*/("""</span>
              </a>
            """)))}),format.raw/*29.14*/("""
          """),format.raw/*30.11*/("""</div>
        </div>

  """),_display_(/*33.4*/for(r <- reviews) yield /*33.21*/{_display_(Seq[Any](format.raw/*33.22*/("""
    """),format.raw/*34.5*/("""<div class="col-md-3 col-sm-6">
          <div class="gradientBoxesWithOuterShadows">
              <!-- admin buttons -->
              """),_display_(/*37.16*/if(user != null)/*37.32*/{_display_(Seq[Any](format.raw/*37.33*/("""
                """),_display_(/*38.18*/if(user.getRole.equals("admin") || user.getRole.equals("mod"))/*38.80*/{_display_(Seq[Any](format.raw/*38.81*/("""
                    
                    """),format.raw/*40.21*/("""<a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.deleteReview(r.getId)),format.raw/*40.74*/("""">
                    <img class="icon" src="/assets/images/misc/bin.png"/>
                    </a>
                    <a href=""""),_display_(/*43.31*/routes/*43.37*/.HomeController.updateReview(r.getId)),format.raw/*43.74*/("""">
                    <img class="icon" src="/assets/images/misc/edit.png"/>
                    </a>
                """)))}),format.raw/*46.18*/("""
              """)))}),format.raw/*47.16*/("""
            """),format.raw/*48.13*/("""<a href=""""),_display_(/*48.23*/routes/*48.29*/.HomeController.review(r.getId)),format.raw/*48.60*/(""""> 
            """),_display_(/*49.14*/if(env.resource("public/images/gamePictures/" + r.getId + "Tile.jpg").isDefined)/*49.94*/ {_display_(Seq[Any](format.raw/*49.96*/("""
              """),format.raw/*50.15*/("""<img class="tile" src="/assets/images/gamePictures/"""),_display_(/*50.67*/(r.getId + "Tile.jpg")),format.raw/*50.89*/(""""/>
            """)))}/*51.15*/else/*51.20*/{_display_(Seq[Any](format.raw/*51.21*/("""
              """),format.raw/*52.15*/("""<img class="tile" src="/assets/images/misc/noImage.png"/>
            """)))}),format.raw/*53.14*/("""
        
            """),format.raw/*55.13*/("""<h3><u>"""),_display_(/*55.21*/r/*55.22*/.getName),format.raw/*55.30*/("""</u></h3>
            <h4>"""),_display_(/*56.18*/r/*56.19*/.getCaption),format.raw/*56.30*/("""</h5>
            <h5>- """),_display_(/*57.20*/r/*57.21*/.getAuthor),format.raw/*57.31*/("""</h5>

          </div> 
        </div>
    
  """)))}),format.raw/*62.4*/("""

""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],reviews:List[models.Review],env:play.api.Environment,genres:List[models.Genre],genreId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,reviews,env,genres,genreId,filter)

  def f:((models.User,Form[models.users.Login],List[models.Review],play.api.Environment,List[models.Genre],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,reviews,env,genres,genreId,filter) => apply(user,loginForm,reviews,env,genres,genreId,filter)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 17 18:45:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/reviews.scala.html
                  HASH: bfba6f55b7eeaecbe77372e70ce1a6b0cdbcc0fb
                  MATRIX: 1052->1|1318->174|1345->176|1385->208|1424->210|1454->214|1521->255|1535->261|1599->305|1696->375|1711->381|1764->413|1871->493|1898->499|2129->704|2160->726|2199->727|2231->732|2312->786|2339->792|2368->793|2406->801|2443->811|2570->911|2585->917|2640->951|2721->1005|2753->1021|2792->1022|2835->1037|2872->1047|2887->1053|2948->1093|3003->1121|3014->1122|3044->1130|3089->1147|3137->1168|3147->1169|3186->1187|3257->1227|3296->1238|3348->1264|3381->1281|3420->1282|3452->1287|3617->1425|3642->1441|3681->1442|3726->1460|3797->1522|3836->1523|3906->1565|3943->1575|3958->1581|4016->1618|4175->1750|4190->1756|4248->1793|4399->1913|4446->1929|4487->1942|4524->1952|4539->1958|4591->1989|4635->2006|4724->2086|4764->2088|4807->2103|4886->2155|4929->2177|4965->2195|4978->2200|5017->2201|5060->2216|5162->2287|5212->2309|5247->2317|5257->2318|5286->2326|5340->2353|5350->2354|5382->2365|5434->2390|5444->2391|5475->2401|5553->2449|5586->2452
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|37->6|37->6|37->6|41->10|41->10|41->10|42->11|42->11|49->18|49->18|49->18|50->19|50->19|50->19|50->19|51->20|53->22|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|60->29|61->30|64->33|64->33|64->33|65->34|68->37|68->37|68->37|69->38|69->38|69->38|71->40|71->40|71->40|71->40|74->43|74->43|74->43|77->46|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|84->53|86->55|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|93->62|95->64
                  -- GENERATED --
              */
          