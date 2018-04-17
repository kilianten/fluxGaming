
package views.html.mod

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

    """),format.raw/*37.5*/("""<!-- """),_display_(/*37.11*/inputText(reviewForm("lastname"), '_label -> "Name", 'class -> "form-control", '_help -> "")),format.raw/*37.103*/(""" """),format.raw/*37.104*/("""-->


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
                  DATE: Tue Apr 17 19:23:13 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/mod/addReview.scala.html
                  HASH: 6602a12e4845eb41f40487471cf136058514ca27
                  MATRIX: 1006->1|1168->92|1212->108|1239->110|1284->147|1323->149|1356->156|1455->229|1469->235|1538->283|1656->375|1799->508|1839->509|1871->515|1884->519|1915->529|1948->536|2057->624|2089->630|2205->724|2238->731|2350->822|2382->828|2503->927|2540->938|2788->1166|2821->1172|2854->1178|2968->1270|2998->1271|3035->1282|3284->1511|3317->1517|3432->1606|3483->1641|3522->1642|3556->1649|3635->1701|3661->1706|3699->1717|3724->1721|3764->1731|3796->1736|4232->2145|4247->2151|4291->2174|4447->2300|4480->2303
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|55->24|55->24|56->25|56->25|58->27|66->35|68->37|68->37|68->37|68->37|71->40|79->48|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|85->54|86->55|99->68|99->68|99->68|107->76|109->78
                  -- GENERATED --
              */
          