package assertion.helper.method

import spock.lang.Specification

/**
 * How to share common assertions between tests in Spock Framework?
 */

class ListWithHelperTest extends Specification {
    def "should be empty after removing element"() {
        given:
        def list = [42] // it's a List

        when:
        list.remove(0)

        then:
        // Spock can assert than an Exception was _NOT_ thrown:
        notThrown(IllegalArgumentException)

        // call helper mehtod here:
        doCommonAssertions(list)
    }

    // Assertion helpers have to have void return type and explicit asserts
    void doCommonAssertions(List<Integer> list) { // type is optional
        assert list != null
        assert list.isEmpty()
    }
}
