
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

object addReview extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,Form[models.users.Login],Form[models.Review],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], reviewForm: Form[models.Review]):play.twirl.api.HtmlFormat.Appendable = {
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

    """),_display_(/*18.6*/form(action=routes.HomeController.addReviewSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*18.139*/{_display_(Seq[Any](format.raw/*18.140*/("""
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

    """),format.raw/*47.5*/("""<div style="background-color: rgb(228, 204, 204); padding:.1em;" class="jumbotron">
    """),_display_(/*48.6*/for((value, name) <- Genre.options) yield /*48.41*/{_display_(Seq[Any](format.raw/*48.42*/("""
      """),format.raw/*49.7*/("""<input type="checkbox" name="genreSelect[]" value=""""),_display_(/*49.59*/value),format.raw/*49.64*/(""""
      />"""),_display_(/*50.10*/name),format.raw/*50.14*/("""<br>
    """)))}),format.raw/*51.6*/("""
    """),format.raw/*52.5*/("""</div>

    <label>Banner Image Upload (Displayed at: 1660x780)</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br>

    <label>Tile Image Upload (Displayed at: 300x300)</label>
    <input class="btn-sm btn-default" type="file" name="uploadTile">
    <br>
    

    <div class="actions">
        <input type="submit" value="Add Review" class="btn btn-primary">
        <a href=""""),_display_(/*65.19*/routes/*65.25*/.HomeController.index()),format.raw/*65.48*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>

    <br>
  
  </div>
  """)))}),format.raw/*73.4*/("""

""")))}),format.raw/*75.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],reviewForm:Form[models.Review]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,reviewForm)

  def f:((models.User,Form[models.users.Login],Form[models.Review]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,reviewForm) => apply(user,loginForm,reviewForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Apr 02 17:55:20 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/fluxGaming/app/views/admin/addReview.scala.html
                  HASH: 576667c00b149bfe5ff3ecff8ea833d220357157
                  MATRIX: 1008->1|1170->92|1214->108|1241->110|1286->147|1325->149|1358->156|1457->229|1471->235|1540->283|1658->375|1801->508|1841->509|1873->515|1886->519|1917->529|1950->536|2059->624|2091->630|2207->724|2240->731|2352->822|2384->828|2505->927|2542->938|2790->1166|2823->1173|3072->1402|3105->1408|3220->1497|3271->1532|3310->1533|3344->1540|3423->1592|3449->1597|3487->1608|3512->1612|3552->1622|3584->1627|4020->2036|4035->2042|4079->2065|4235->2191|4268->2194
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|55->24|55->24|56->25|56->25|58->27|66->35|68->37|76->45|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|82->51|83->52|96->65|96->65|96->65|104->73|106->75
                  -- GENERATED --
              */
          