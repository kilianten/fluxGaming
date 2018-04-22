
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.User,Form[models.users.Login],Form[models.products.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user : models.User, loginForm: Form[models.users.Login], productForm: Form[models.products.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add  a Product", loginForm, user)/*4.41*/ {_display_(Seq[Any](format.raw/*4.43*/("""
    """),format.raw/*5.5*/("""<div class="container">
        
            <img style="width:12em; float:right;" src=""""),_display_(/*7.57*/routes/*7.63*/.Assets.versioned("images/logos/logoShader.png")),format.raw/*7.111*/("""">
        
            <br>
        
            <h1 style="text-align:center;">Add a Product</h1>
        
            <br>
            <br>
        

    
    """),_display_(/*18.6*/form(action=routes.HomeController.addProductSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*21.39*/ {_display_(Seq[Any](format.raw/*21.41*/("""
        """),format.raw/*22.37*/("""
        """),_display_(/*23.10*/CSRF/*23.14*/.formField),format.raw/*23.24*/("""

        """),_display_(/*25.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
        """),_display_(/*26.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*26.99*/("""
        """),_display_(/*27.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*27.87*/("""
        """),_display_(/*28.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*28.87*/("""

        """),_display_(/*30.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*30.74*/("""
        
        """),format.raw/*32.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*37.23*/routes/*37.29*/.HomeController.index()),format.raw/*37.52*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
        </div>
    """)))}),format.raw/*42.6*/("""
""")))}),format.raw/*43.2*/("""
"""))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],productForm:Form[models.products.Product]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,productForm)

  def f:((models.User,Form[models.users.Login],Form[models.products.Product]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,productForm) => apply(user,loginForm,productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 08:37:00 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/admin/addProduct.scala.html
                  HASH: 68e04e35f5bf5dc3182343109c057d7b1e70fb51
                  MATRIX: 1019->1|1193->104|1237->120|1264->122|1311->161|1350->163|1381->168|1496->257|1510->263|1579->311|1768->474|1925->622|1965->624|2002->661|2039->671|2052->675|2083->685|2121->696|2217->771|2254->781|2364->870|2401->880|2499->957|2536->967|2634->1044|2672->1055|2757->1119|2802->1137|3073->1381|3088->1387|3132->1410|3295->1543|3327->1545
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|49->18|52->21|52->21|53->22|54->23|54->23|54->23|56->25|56->25|57->26|57->26|58->27|58->27|59->28|59->28|61->30|61->30|63->32|68->37|68->37|68->37|73->42|74->43
                  -- GENERATED --
              */
          