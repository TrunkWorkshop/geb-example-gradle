import geb.spock.GebReportingSpec

class JCConfTaiwanSpec extends GebReportingSpec {

    def "open the schedule page from home page"() {
        when:
        to JCConfTaiwanHomePage

        and:
        interact {
            moveToElement(headerMenu.links[3])
        }

        and:
        headerMenu.links[3].click()

        then:
        at JCConfTaiwanSchedulePage
    }
}
