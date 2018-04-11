
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

    """),_display_(/*37.6*/inputText(reviewForm("lastname"), '_label -> "Name", 'class -> "form-control", '_help -> "")),format.raw/*37.98*/("""


    """),_display_(/*40.6*/select(
      reviewForm("year"),
      options(Review.options),
      '_label -> "Year",
      '_default -> "Choose Release Year",
      '_disabled -> Seq("null", "null"),
      '_help -> "",
      'class -> "form-control"
    )),format.raw/*48.6*/("""

    """),format.raw/*50.5*/("""<div style="background-color: rgb(228, 204, 204); padding:.1em;" class="jumbotron">
    """),_display_(/*51.6*/for((value, name) <- Genre.options) yield /*51.41*/{_display_(Seq[Any](format.raw/*51.42*/("""
      """),format.raw/*52.7*/("""<input type="checkbox" name="genreSelect[]" value=""""),_display_(/*52.59*/value),format.raw/*52.64*/(""""
      />"""),_display_(/*53.10*/name),format.raw/*53.14*/("""<br>
    """)))}),format.raw/*54.6*/("""
    """),format.raw/*55.5*/("""</div>

    <label>Banner Image Upload (Displayed at: 1660x780)</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br>

    <label>Tile Image Upload (Displayed at: 300x300)</label>
    <input class="btn-sm btn-default" type="file" name="uploadTile">
    <br>
    

    <div class="actions">
        <input type="submit" value="Add Review" class="btn btn-primary">
        <a href=""""),_display_(/*68.19*/routes/*68.25*/.HomeController.index()),format.raw/*68.48*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>

    <br>
  
  </div>
  """)))}),format.raw/*76.4*/("""

""")))}),format.raw/*78.2*/("""
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
                  DATE: Wed Apr 11 19:37:52 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/fluxGaming/app/views/admin/addReview.scala.html
                  HASH: 0e99c6ae9bc4ff01c918e781455df2dd7fab645d
                  MATRIX: 1008->1|1170->92|1214->108|1241->110|1286->147|1325->149|1358->156|1457->229|1471->235|1540->283|1658->375|1801->508|1841->509|1873->515|1886->519|1917->529|1950->536|2059->624|2091->630|2207->724|2240->731|2352->822|2384->828|2505->927|2542->938|2790->1166|2823->1173|2936->1265|2970->1273|3219->1502|3252->1508|3367->1597|3418->1632|3457->1633|3491->1640|3570->1692|3596->1697|3634->1708|3659->1712|3699->1722|3731->1727|4167->2136|4182->2142|4226->2165|4382->2291|4415->2294
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|55->24|55->24|56->25|56->25|58->27|66->35|68->37|68->37|71->40|79->48|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|85->54|86->55|99->68|99->68|99->68|107->76|109->78
                  -- GENERATED --
              */
          