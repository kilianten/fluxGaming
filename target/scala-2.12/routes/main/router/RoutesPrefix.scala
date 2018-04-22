// @GENERATOR:play-routes-compiler
// @SOURCE:/home/paul/fluxGaming/conf/routes
// @DATE:Sun Apr 22 20:26:46 IST 2018


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
