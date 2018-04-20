
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

object moderators extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[models.User,Form[models.users.Login],List[models.User],String,List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, loginForm: Form[models.users.Login], users: List[models.User], filter: String, moderators: List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Moderators",loginForm, user)/*3.36*/{_display_(Seq[Any](format.raw/*3.37*/("""



    """),format.raw/*7.5*/("""<div class="container">

        <h1>Moderators</h1>
        <br/>
        <br>

        <div class="row">
            <div class="col-md-3">

                    <button class="btn btn-primary" data-toggle="collapse" data-target="#list">Show Moderators</button>

                    <div id="list" class="collapse">
                        <ul class="list-group">
                                """),_display_(/*20.34*/for(mod <- moderators) yield /*20.56*/{_display_(Seq[Any](format.raw/*20.57*/("""
                                    """),format.raw/*21.37*/("""<li class="list-group-item">"""),_display_(/*21.66*/mod/*21.69*/.getUsername),format.raw/*21.81*/("""</li>
                                """)))}),format.raw/*22.34*/("""
                        """),format.raw/*23.25*/("""</ul>
                    </div>
                    <br>
            </div>

            
        
            <div class="col-md-9">

                    <div id="actions" style="float:right;">
                            <form action=""""),_display_(/*33.44*/routes/*33.50*/.HomeController.moderators()),format.raw/*33.78*/("""" method="GET">
                              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*34.89*/filter),format.raw/*34.95*/("""" placeholder="Search for User">
                              <input type="submit" id="searchsubmit" value="Search" class="btn-md btn-primary">
                            </form>
                    </div>

                <br>
        
                <h2>Add/Remove Moderator Priveleges</h2>
                <p>Add or remove moderator privileges by searching for a user and then click the "Add Moderator"/"Remove Moderator" button. For a list of moderators, click the "List current moderators" button.</p>
                <table class="table">
                <thead>
                    <tr>
                    <th>Username</th>
                    <th>Current Role</th>
                    <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*52.22*/for(u <- users) yield /*52.37*/{_display_(Seq[Any](format.raw/*52.38*/("""
                        """),_display_(/*53.26*/if(u.getRole.equals("mod"))/*53.53*/{_display_(Seq[Any](format.raw/*53.54*/("""
                            """),format.raw/*54.29*/("""<tr class="success">
                        """)))}/*55.27*/else if(u.getRole.equals("user"))/*55.60*/{_display_(Seq[Any](format.raw/*55.61*/("""
                            """),format.raw/*56.29*/("""<tr class="warning">
                        """)))}),format.raw/*57.26*/("""
                    
                    """),format.raw/*59.21*/("""<td>"""),_display_(/*59.26*/u/*59.27*/.getUsername),format.raw/*59.39*/("""</td>
                    <td>"""),_display_(/*60.26*/u/*60.27*/.getRole),format.raw/*60.35*/("""</td>
                    <td>"""),_display_(/*61.26*/u/*61.27*/.getEmail),format.raw/*61.36*/("""</td>
                        <td>
                            """),_display_(/*63.30*/if(u.getRole.equals("mod") || u.getRole.equals("user"))/*63.85*/{_display_(Seq[Any](format.raw/*63.86*/("""
                            """),format.raw/*64.29*/("""<a href=""""),_display_(/*64.39*/routes/*64.45*/.HomeController.makeModerator(u.getUsername, filter)),format.raw/*64.97*/("""">
                                
                                <button  type="button" class="btn btn-primary btn-xs">
                                    """),_display_(/*67.38*/if(u.getRole.equals("mod"))/*67.65*/{_display_(Seq[Any](format.raw/*67.66*/("""
                                        """),format.raw/*68.41*/("""Remove moderator
                                    """)))}/*69.39*/else if(u.getRole.equals("user"))/*69.72*/{_display_(Seq[Any](format.raw/*69.73*/("""
                                        """),format.raw/*70.41*/("""Make moderator
                                    """)))}),format.raw/*71.38*/("""
                                """),format.raw/*72.33*/("""</button>
                            </a>
                            """)))}),format.raw/*74.30*/("""
                        """),format.raw/*75.25*/("""</td>
                    </tr>
                    """)))}),format.raw/*77.22*/("""
                """),format.raw/*78.17*/("""</tbody>
                </table>
            </div>
        </div>
    </div>
        
      

""")))}))
      }
    }
  }

  def render(user:models.User,loginForm:Form[models.users.Login],users:List[models.User],filter:String,moderators:List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(user,loginForm,users,filter,moderators)

  def f:((models.User,Form[models.users.Login],List[models.User],String,List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (user,loginForm,users,filter,moderators) => apply(user,loginForm,users,filter,moderators)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 20 16:51:58 IST 2018
                  SOURCE: /home/paul/Desktop/fluxGaming/app/views/admin/moderators.scala.html
                  HASH: d6d019854cee18b84f18e605f79e32678b6c42b0
                  MATRIX: 1032->1|1255->131|1282->133|1324->167|1362->168|1396->176|1821->574|1859->596|1898->597|1963->634|2019->663|2031->666|2064->678|2134->717|2187->742|2453->981|2468->987|2517->1015|2648->1119|2675->1125|3510->1933|3541->1948|3580->1949|3633->1975|3669->2002|3708->2003|3765->2032|3830->2079|3872->2112|3911->2113|3968->2142|4045->2188|4115->2230|4147->2235|4157->2236|4190->2248|4248->2279|4258->2280|4287->2288|4345->2319|4355->2320|4385->2329|4476->2393|4540->2448|4579->2449|4636->2478|4673->2488|4688->2494|4761->2546|4948->2706|4984->2733|5023->2734|5092->2775|5165->2830|5207->2863|5246->2864|5315->2905|5398->2957|5459->2990|5562->3062|5615->3087|5699->3140|5744->3157
                  LINES: 28->1|33->2|34->3|34->3|34->3|38->7|51->20|51->20|51->20|52->21|52->21|52->21|52->21|53->22|54->23|64->33|64->33|64->33|65->34|65->34|83->52|83->52|83->52|84->53|84->53|84->53|85->54|86->55|86->55|86->55|87->56|88->57|90->59|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|94->63|94->63|94->63|95->64|95->64|95->64|95->64|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|102->71|103->72|105->74|106->75|108->77|109->78
                  -- GENERATED --
              */
          