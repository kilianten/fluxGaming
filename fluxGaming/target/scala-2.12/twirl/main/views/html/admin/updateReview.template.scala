
package views.html.admin

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

object updateReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],Form[models.Review],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], reviewForm: Form[models.Review], reviewId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add a Review", loginForm, user)/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
  

  """),format.raw/*7.3*/("""<div class="container">

    <img style="width:12em; float:right;" src=""""),_display_(/*9.49*/routes/*9.55*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*9.103*/("""">

    <br>

    <h1 style="text-align:center;">Add a Review</h1>

    <br>
    <br>

    """),_display_(/*18.6*/form(action=routes.HomeController.updateReviewSubmit(reviewId), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*18.150*/{_display_(Seq[Any](format.raw/*18.151*/("""
    """),_display_(/*19.6*/CSRF/*19.10*/.formField),format.raw/*19.20*/("""

    """),_display_(/*21.6*/inputText(reviewForm("name"), '_label -> "Name", 'class -> "form-control", '_help -> "")),format.raw/*21.94*/("""
    """),_display_(/*22.6*/inputText(reviewForm("caption"), '_label -> "Caption", 'class -> "form-control", '_help -> "")),format.raw/*22.100*/("""

    """),_display_(/*24.6*/textarea(reviewForm("review"), '_label -> "Review", 'class -> "form-control", '_help -> "")),format.raw/*24.97*/("""
    """),_display_(/*25.6*/inputText(reviewForm("rating"), '_label -> "Rating (1-10)", 'class -> "form-control", '_help -> "")),format.raw/*25.105*/("""
    
    """),_display_(/*27.6*/select(
      reviewForm("author"),
      options(User.listAdmins),
      '_label -> "Author",
      '_default -> "Choose Author",
      '_disabled -> Seq("null", "null"),
      '_help -> "",
      'class -> "form-control"
    )),format.raw/*35.6*/("""

    """),_display_(/*37.6*/select(
      reviewForm("year"),
      options(Review.options),
      '_label -> "Year",
      '_default -> "Choose Release Year",
      '_disabled -> Seq("null", "null"),
      '_help -> "",
      'class -> "form-control"
    )),format.raw/*45.6*/("""


    """),format.raw/*48.5*/("""<div style="background-color: rgb(228, 204, 204); padding:.1em;" class="jumbotron">
      """),_display_(/*49.8*/for((value, name) <- Genre.options) yield /*49.43*/{_display_(Seq[Any](format.raw/*49.44*/("""
        """),format.raw/*50.9*/("""<input type="checkbox" name="genreSelect[]" value=""""),_display_(/*50.61*/value),format.raw/*50.66*/(""""
        """),_display_(/*51.10*/if(Genre.inGenre(value.toLong, reviewId))/*51.51*/{_display_(Seq[Any](format.raw/*51.52*/("""
          """),format.raw/*52.11*/("""checked
        """)))}),format.raw/*53.10*/("""
        """),format.raw/*54.9*/("""/>"""),_display_(/*54.12*/name),format.raw/*54.16*/("""<br>
      """)))}),format.raw/*55.8*/("""
      """),format.raw/*56.7*/("""</div>
    <br>

    <label>Banner Image Upload (Must be: 1660x780)</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br>

    <label>Tile Image Upload (Displayed at: 300x300)</label>
    <input class="btn-sm btn-default" type="file" name="uploadTile">
    <br>
    
    """),_display_(/*67.6*/inputText(reviewForm("id"), '_label -> null, 'hidden -> "hidden", '_help -> "")),format.raw/*67.85*/("""



    """),format.raw/*71.5*/("""<div class="actions">
        <input type="submit" value="Update Review" class="btn btn-primary">
        <a href=""""),_display_(/*73.19*/routes/*73.25*/.HomeController.index()),format.raw/*73.48*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>

    <br>
  
  </div>
  """)))}),format.raw/*81.4*/("""

""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],reviewForm:Form[models.Review],reviewId:Long): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,reviewForm,reviewId)

  def f:((models.User,Form[models.users.Login],Form[models.Review],Long) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,reviewForm,reviewId) => apply(user,loginForm,reviewForm,reviewId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 19:37:52 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/admin/updateReview.scala.html
                  HASH: 3bca8dca848ce8ba46d4cb76c97c9e7d07538b99
                  MATRIX: 1016->1|1194->108|1238->124|1265->126|1310->163|1349->165|1382->172|1481->245|1495->251|1564->299|1682->391|1836->535|1876->536|1908->542|1921->546|1952->556|1985->563|2094->651|2126->657|2242->751|2275->758|2387->849|2419->855|2540->954|2577->965|2825->1193|2858->1200|3107->1429|3141->1436|3258->1527|3309->1562|3348->1563|3384->1572|3463->1624|3489->1629|3527->1640|3577->1681|3616->1682|3655->1693|3703->1710|3739->1719|3769->1722|3794->1726|3836->1738|3870->1745|4196->2045|4296->2124|4331->2132|4474->2248|4489->2254|4533->2277|4689->2403|4722->2406
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|55->24|55->24|56->25|56->25|58->27|66->35|68->37|76->45|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|84->53|85->54|85->54|85->54|86->55|87->56|98->67|98->67|102->71|104->73|104->73|104->73|112->81|114->83
                  -- GENERATED --
              */
          