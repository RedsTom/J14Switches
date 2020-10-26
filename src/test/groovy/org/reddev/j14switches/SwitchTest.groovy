package org.reddev.j14switches


import spock.lang.Specification

class SwitchTest extends Specification {
    def "Test with Case.key"() {
        expect:
        Switch.apply(value,
                Case.key(test1, { test1 }),
                Case.key(test2, { test2 })
        ).get() == expected
        where:
        value   | test1     | test2   | expected
        "Salut" | "Bonjour" | "Salut" | "Salut"
        56      | 26        | 56      | 56
    }

    def "Test with Case.key and default"() {
        expect:
        Switch.apply(value,
                Case.key(fakeTest, { fakeTest })
        ).orElse(defaultValue) == expectedDefault
        where:
        value   | fakeTest  | defaultValue | expectedDefault
        "Salut" | "Bonjour" | "Bonjour"    | "Bonjour"
        56      | 25        | 42           | 42
    }
}
