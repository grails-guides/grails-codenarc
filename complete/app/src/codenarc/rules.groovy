ruleset {
    description 'Grails-CodeNarc Project RuleSet'

    ruleset('rulesets/basic.xml')
    ruleset('rulesets/braces.xml')
    ruleset('rulesets/convention.xml') {
        'NoDef' {
            enabled = false
        }
    }
    ruleset('rulesets/design.xml')
    ruleset('rulesets/dry.xml')
    ruleset('rulesets/exceptions.xml')
    ruleset('rulesets/formatting.xml') {
        'ClassJavadoc' {
            enabled = false
        }
    }
    ruleset('rulesets/generic.xml')
    ruleset('rulesets/imports.xml')
    ruleset('rulesets/naming.xml')
    ruleset('rulesets/unnecessary.xml')
    ruleset('rulesets/unused.xml')
    ruleset('rulesets/grails.xml')
}
