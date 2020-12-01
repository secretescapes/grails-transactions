package quiz.question2

import groovy.transform.InheritConstructors


class Question2Service {

	static transactional = true

    def bar() {
		throw new BlahException()
    }
}

@InheritConstructors
class BlahException extends Exception{}
