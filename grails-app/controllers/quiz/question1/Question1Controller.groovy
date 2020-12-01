package quiz.question1

import grails.transactions.Author

class Question1Controller {

	def option1Service
	def option2Service
	def option3Service

	def index() {}

	def option1() {
		try {
			option1Service.foo()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}

	def option2() {
		try {
			option2Service.foo()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}

	def option3() {
		try {
			option3Service.foo()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}
}
