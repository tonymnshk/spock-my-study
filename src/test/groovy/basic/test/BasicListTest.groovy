package basic.test

import spock.lang.Specification

/**
 * given, when, then are Spock‘s labels which indicate test sections as in
 * Behavior Driven Development. The test is very readable and easy to write.
 */

class BasicListTest extends Specification{
    def "should not be empty after adding element"() {
        given:
        // [] is Groovy literal for List and is infered
        def list = []

        when:
        list.add(42)

        then:
        // Assets are implicit and not need to be stated.
        // Change "==" to "!=" and see what's happing!
        list.size() == 1
        list == [42]
    }
}
