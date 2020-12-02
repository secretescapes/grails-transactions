package example1

import grails.transactions.Author

class Example1Controller {

	def annotatedAtMethodLevelOnlyService
	def annotatedAtMethodLevelAndStaticService
	def annotatedAtClassAndMethodLevelService
	def annotatedAtMethodLevelAndStaticFalseService

	def index() {}

    def exampleA() {
		try {
			annotatedAtMethodLevelOnlyService.createAndThrowUncheckedException()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}

	def exampleB() {
		try {
			annotatedAtMethodLevelAndStaticService.createAndThrowUncheckedException()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}

	def exampleC() {
		try {
			annotatedAtClassAndMethodLevelService.createAndThrowUncheckedException()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}

	def exampleD() {
		try {
			annotatedAtMethodLevelAndStaticFalseService.createAndThrowUncheckedException()
		} catch (Throwable t) {
			log.error "error thrown", t
		}
		return [authors: Author.findAll()]
	}
}
