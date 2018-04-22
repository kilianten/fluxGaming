
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
    """),format.raw/*25.5*/("""<!-- """),_display_(/*25.11*/inputText(reviewForm("rating"), '_label -> "Rating (1-10)", 'class -> "form-control", '_help -> "")),format.raw/*25.110*/(""" """),format.raw/*25.111*/("""-->
    
    """),_display_(/*27.6*/select(reviewForm("rating"),
    options(Review.ratingOptions),
    'class -> "form-control",
    '_help -> "",
    '_label -> "Rating",
    )),format.raw/*32.6*/("""

    
    """),_display_(/*35.6*/select(
      reviewForm("author"),
      options(User.listAdmins),
      '_label -> "Author",
      '_default -> "Choose Author",
      '_disabled -> Seq("null", "null"),
      '_help -> "",
      'class -> "form-control"
    )),format.raw/*43.6*/("""

    """),format.raw/*45.5*/("""<!-- """),_display_(/*45.11*/inputText(reviewForm("lastname"), '_label -> "Name", 'class -> "form-control", '_help -> "")),format.raw/*45.103*/(""" """),format.raw/*45.104*/("""-->



    """),_display_(/*49.6*/select(
      reviewForm("year"),
      options(Review.options),
      '_label -> "Year",
      '_default -> "Choose Release Year",
      '_disabled -> Seq("null", "null"),
      '_help -> "",
      'class -> "form-control"
    )),format.raw/*57.6*/("""

    """),format.raw/*59.5*/("""<div style="background-color: rgb(228, 204, 204); padding:.1em;" class="jumbotron">
    """),_display_(/*60.6*/for((value, name) <- Genre.options) yield /*60.41*/{_display_(Seq[Any](format.raw/*60.42*/("""
      """),format.raw/*61.7*/("""<input type="checkbox" name="genreSelect[]" value=""""),_display_(/*61.59*/value),format.raw/*61.64*/(""""
      />"""),_display_(/*62.10*/name),format.raw/*62.14*/("""<br>
    """)))}),format.raw/*63.6*/("""
    """),format.raw/*64.5*/("""</div>

    <label>Banner Image Upload (Displayed at: 1660x780)</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br>

    <label>Tile Image Upload (Displayed at: 300x300)</label>
    <input class="btn-sm btn-default" type="file" name="uploadTile">
    <br>
    

    <div class="actions">
        <input type="submit" value="Add Review" class="btn btn-primary">
        <a href=""""),_display_(/*77.19*/routes/*77.25*/.HomeController.index()),format.raw/*77.48*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>

    <br>
  
  </div>
  """)))}),format.raw/*85.4*/("""

""")))}),format.raw/*87.2*/("""
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
<<<<<<< HEAD
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/mod/addReview.scala.html
=======
                  DATE: Sat Apr 21 17:17:38 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/mod/addReview.scala.html
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0
                  HASH: 43d636590bf46b47be573176a87af109ae781746
                  MATRIX: 1006->1|1168->92|1212->108|1239->110|1284->147|1323->149|1356->156|1455->229|1469->235|1538->283|1656->375|1799->508|1839->509|1871->515|1884->519|1915->529|1948->536|2057->624|2089->630|2205->724|2238->731|2350->822|2382->827|2415->833|2536->932|2566->933|2606->947|2768->1089|2806->1101|3054->1329|3087->1335|3120->1341|3234->1433|3264->1434|3302->1446|3551->1675|3584->1681|3699->1770|3750->1805|3789->1806|3823->1813|3902->1865|3928->1870|3966->1881|3991->1885|4031->1895|4063->1900|4499->2309|4514->2315|4558->2338|4714->2464|4747->2467
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|55->24|55->24|56->25|56->25|56->25|56->25|58->27|63->32|66->35|74->43|76->45|76->45|76->45|76->45|80->49|88->57|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|94->63|95->64|108->77|108->77|108->77|116->85|118->87
                  -- GENERATED --
              */
          