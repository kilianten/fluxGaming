
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
/*1.2*/import models.products.Product
/*2.2*/import models.shopping.ShopOrder

object salesReport extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[models.User,Form[models.users.Login],List[Product],play.api.Environment,Integer,Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(user: models.User, loginForm: Form[models.users.Login], products: List[Product], env: play.api.Environment, year: Integer, Stock: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Sales Report", loginForm, user)/*5.39*/ {_display_(Seq[Any](format.raw/*5.41*/("""

  """),format.raw/*7.3*/("""<div class="container">

    <h2>Sales Reports</h2>
    <h4>For Year: """),_display_(/*10.20*/year),format.raw/*10.24*/("""</h4>
    <br>
    

    <div class="row">
      <div class="col-sm-10">
          """),_display_(/*16.12*/if(flash.containsKey("success"))/*16.44*/ {_display_(Seq[Any](format.raw/*16.46*/("""
            """),format.raw/*17.13*/("""<div class="alert alert-success">
              """),_display_(/*18.16*/flash/*18.21*/.get("success")),format.raw/*18.36*/("""
            """),format.raw/*19.13*/("""</div>
          """)))}),format.raw/*20.12*/("""

  
    """),format.raw/*23.5*/("""<div class="dropdown">
      <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Select Year
            <span class="caret"></span></button>
            <ul class="dropdown-menu">
              """),_display_(/*27.16*/for(year <- ShopOrder.options) yield /*27.46*/{_display_(Seq[Any](format.raw/*27.47*/("""
                """),format.raw/*28.17*/("""<li><a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.salesReport(year)),format.raw/*28.70*/("""">"""),_display_(/*28.73*/year),format.raw/*28.77*/("""</a></li>
              """)))}),format.raw/*29.16*/("""
        """),format.raw/*30.9*/("""</ul>
    </div>

    <br>


    """),_display_(/*36.6*/for((k,v) <- ShopOrder.getMonth(year)) yield /*36.44*/{_display_(Seq[Any](format.raw/*36.45*/("""
      """),format.raw/*37.7*/("""<p>"""),_display_(/*37.11*/k),format.raw/*37.12*/(""" """),format.raw/*37.13*/(""": """),_display_(/*37.16*/v),format.raw/*37.17*/(""" """),format.raw/*37.18*/("""sold </p>
    """)))}),format.raw/*38.6*/("""
  """),format.raw/*39.3*/("""</div>

  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>

  <hr>
  <h2>Stock Report</h2>
  <br>
  <div class="row">
    <div class="col-sm-10">
        """),_display_(/*56.10*/if(flash.containsKey("success"))/*56.42*/ {_display_(Seq[Any](format.raw/*56.44*/("""
          """),format.raw/*57.11*/("""<div class="alert alert-success">
            """),_display_(/*58.14*/flash/*58.19*/.get("success")),format.raw/*58.34*/("""
          """),format.raw/*59.11*/("""</div>
        """)))}),format.raw/*60.10*/("""

      """),format.raw/*62.7*/("""<table class="table table-bordered table-hover table-condensed">   
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>       
            <th>Stock</th>
            <th>Level</th> 
          </tr>
        </thead>
  
        <tbody>
          """),_display_(/*73.12*/for(p<-products) yield /*73.28*/ {_display_(Seq[Any](format.raw/*73.30*/("""
            """),_display_(/*74.14*/if(p.getStock <= 10)/*74.34*/{_display_(Seq[Any](format.raw/*74.35*/("""
              """),format.raw/*75.15*/("""<tr class="danger">
            """)))}/*76.15*/else if(p.getStock <= 30)/*76.40*/{_display_(Seq[Any](format.raw/*76.41*/("""
              """),format.raw/*77.15*/("""<tr class="warning">
            """)))}/*78.15*/else/*78.19*/{_display_(Seq[Any](format.raw/*78.20*/("""
              """),format.raw/*79.15*/("""<tr class="success">
            """)))}),format.raw/*80.14*/("""
              """),format.raw/*81.15*/("""<td class="numeric">"""),_display_(/*81.36*/p/*81.37*/.getId),format.raw/*81.43*/("""</td>
              <td>"""),_display_(/*82.20*/p/*82.21*/.getName),format.raw/*82.29*/("""</td>
              <td  class="numeric">"""),_display_(/*83.37*/p/*83.38*/.getStock),format.raw/*83.47*/("""</td>

              
                """),_display_(/*86.18*/if(p.getStock <= 10)/*86.38*/{_display_(Seq[Any](format.raw/*86.39*/("""
                  """),format.raw/*87.19*/("""<td>Low</td>
                """)))}/*88.19*/else if(p.getStock <= 30)/*88.44*/{_display_(Seq[Any](format.raw/*88.45*/("""
                  """),format.raw/*89.19*/("""<td>Medium</td>
                """)))}/*90.19*/else/*90.23*/{_display_(Seq[Any](format.raw/*90.24*/("""
                  """),format.raw/*91.19*/("""<td>High</td>
                """)))}),format.raw/*92.18*/("""
                """),format.raw/*93.17*/("""<td>

                  <form action=""""),_display_(/*95.34*/routes/*95.40*/.HomeController.addStock(p.getId)),format.raw/*95.73*/("""" method="GET">
                        Add Stock: <input type="text"  name="Stock" value=""""),_display_(/*96.77*/Stock),format.raw/*96.82*/("""">
                  <input type="submit" value="Submit form">
                  </form>
  
        
              
                """)))}),format.raw/*102.18*/("""
              """),format.raw/*103.15*/("""</td>
            </tr>
          
        </tbody>
  
      </table>
    </div>
  </div>


""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],products:List[Product],env:play.api.Environment,year:Integer,Stock:Integer): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,products,env,year,Stock)

  def f:((models.User,Form[models.users.Login],List[Product],play.api.Environment,Integer,Integer) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,products,env,year,Stock) => apply(user,loginForm,products,env,year,Stock)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 22 12:41:21 IST 2018
                  SOURCE: /home/wdd/webapps/fluxGaming/app/views/admin/salesReport.scala.html
                  HASH: a669391e045cc12089e5971e51d230088fd60300
                  MATRIX: 657->1|695->33|1119->67|1352->207|1379->209|1424->246|1463->248|1493->252|1591->323|1616->327|1727->411|1768->443|1808->445|1849->458|1925->507|1939->512|1975->527|2016->540|2065->558|2101->567|2357->796|2403->826|2442->827|2487->844|2528->858|2543->864|2597->897|2627->900|2652->904|2708->929|2744->938|2804->972|2858->1010|2897->1011|2931->1018|2962->1022|2984->1023|3013->1024|3043->1027|3065->1028|3094->1029|3139->1044|3169->1047|3363->1214|3404->1246|3444->1248|3483->1259|3557->1306|3571->1311|3607->1326|3646->1337|3693->1353|3728->1361|4029->1635|4061->1651|4101->1653|4142->1667|4171->1687|4210->1688|4253->1703|4305->1737|4339->1762|4378->1763|4421->1778|4474->1813|4487->1817|4526->1818|4569->1833|4634->1867|4677->1882|4725->1903|4735->1904|4762->1910|4814->1935|4824->1936|4853->1944|4922->1986|4932->1987|4962->1996|5028->2035|5057->2055|5096->2056|5143->2075|5192->2106|5226->2131|5265->2132|5312->2151|5364->2185|5377->2189|5416->2190|5463->2209|5525->2240|5570->2257|5636->2296|5651->2302|5705->2335|5824->2427|5850->2432|6015->2565|6059->2580
                  LINES: 24->1|25->2|30->3|35->4|36->5|36->5|36->5|38->7|41->10|41->10|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|54->23|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|69->38|70->39|87->56|87->56|87->56|88->57|89->58|89->58|89->58|90->59|91->60|93->62|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|109->78|109->78|109->78|110->79|111->80|112->81|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|117->86|117->86|117->86|118->87|119->88|119->88|119->88|120->89|121->90|121->90|121->90|122->91|123->92|124->93|126->95|126->95|126->95|127->96|127->96|133->102|134->103
                  -- GENERATED --
              */
          