package demo

import groovy.transform.CompileStatic
//TODO this should throw a violation
// rule similar to: https://github.com/CodeNarc/CodeNarc/blob/master/src/main/groovy/org/codenarc/rule/imports/NoWildcardImportsRule.groovy
import org.springframework.transaction.annotation.Transactional

@Transactional
@CompileStatic
class BookService {

}