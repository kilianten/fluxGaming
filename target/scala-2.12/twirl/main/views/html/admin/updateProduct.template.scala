
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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[models.User,Form[models.users.Login],Form[models.products.Product],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], productForm: Form[models.products.Product], productId: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add a Product", loginForm, user)/*4.40*/ {_display_(Seq[Any](format.raw/*4.42*/("""
  

  """),format.raw/*7.3*/("""<div class="container">

    <img style="width:12em; float:right;" src=""""),_display_(/*9.49*/routes/*9.55*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*9.103*/("""">

    <br>

    <h1 style="text-align:center;">Add a Product</h1>

    <br>
    <br>

    """),_display_(/*18.6*/form(action=routes.HomeController.updateProductSubmit(productId), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*18.152*/{_display_(Seq[Any](format.raw/*18.153*/("""
    """),_display_(/*19.6*/CSRF/*19.10*/.formField),format.raw/*19.20*/("""

    """),_display_(/*21.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*21.81*/("""
    """),_display_(/*22.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*22.95*/("""
    """),_display_(/*23.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*23.83*/("""
    """),_display_(/*24.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*24.83*/("""

    """),_display_(/*26.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*26.70*/("""

    """),format.raw/*28.5*/("""<label>Banner Image Upload (Must be: 1660x780)</label>
    <input class="btn-sm btn-default" type="file" name="upload">
    <br>


    <div class="actions">
        <input type="submit" value="Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*35.19*/routes/*35.25*/.HomeController.index()),format.raw/*35.48*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
    </div>

    <br>
  
  </div>
  """)))}),format.raw/*43.4*/("""

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],productForm:Form[models.products.Product],productId:Long): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,productForm,productId)

  def f:((models.User,Form[models.users.Login],Form[models.products.Product],Long) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,productForm,productId) => apply(user,loginForm,productForm,productId)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 19 20:38:34 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/admin/updateProduct.scala.html
                  HASH: 2c67022be1b8fc5b9c617edbe4895479f447507a
                  MATRIX: 1027->1|1217->120|1261->136|1288->138|1334->176|1373->178|1406->185|1505->258|1519->264|1588->312|1707->405|1863->551|1903->552|1935->558|1948->562|1979->572|2012->579|2108->654|2140->660|2250->749|2282->755|2380->832|2412->838|2510->915|2543->922|2628->986|2661->992|2940->1244|2955->1250|2999->1273|3155->1399|3188->1402
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|38->7|40->9|40->9|40->9|49->18|49->18|49->18|50->19|50->19|50->19|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|57->26|57->26|59->28|66->35|66->35|66->35|74->43|76->45
                  -- GENERATED --
              */
          