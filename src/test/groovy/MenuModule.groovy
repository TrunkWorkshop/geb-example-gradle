import geb.Module

class MenuModule extends Module {

    static content = {
        links { $('li a') }
    }
}
