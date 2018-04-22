// @GENERATOR:play-routes-compiler
<<<<<<< HEAD
// @SOURCE:/home/wdd/webapps/fluxGaming/conf/routes
// @DATE:Sun Apr 22 12:21:27 IST 2018
=======
// @SOURCE:/home/paul/Desktop/fluxGaming/conf/routes
// @DATE:Sat Apr 21 17:17:36 IST 2018
>>>>>>> fcfb6d9050c04854a753d607b23879279d7475f0


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
