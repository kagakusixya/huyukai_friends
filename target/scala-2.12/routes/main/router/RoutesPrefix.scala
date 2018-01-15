
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/karasawa/Documents/Daigaku/huyukai/huyukai_friends/conf/routes
// @DATE:Mon Jan 15 17:38:57 JST 2018


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
