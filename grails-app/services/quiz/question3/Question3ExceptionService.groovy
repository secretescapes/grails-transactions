package quiz.question3

import grails.transaction.Transactional
import groovy.transform.InheritConstructors

@Transactional
class Question3ExceptionService {

    def throwExceptionA() {
		throw new ExceptionA("Something went wrong")
    }

	def throwExceptionB() {
		throw new ExceptionB("Something went wrong")
	}
}

@InheritConstructors
class ExceptionA extends RuntimeException {}
@InheritConstructors
class ExceptionB extends Exception {}

