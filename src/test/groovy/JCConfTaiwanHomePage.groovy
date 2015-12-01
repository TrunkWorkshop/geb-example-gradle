import geb.Page

class JCConfTaiwanHomePage extends Page {

    static at = { title == "JCConf Taiwan 2015" }

    static content = {
        headerMenu { module MenuModule, $("#header ul", 0) }
    }
}
