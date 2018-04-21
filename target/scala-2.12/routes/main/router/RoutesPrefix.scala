// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/Desktop/fluxGaming/conf/routes
// @DATE:Sat Apr 21 17:17:36 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
