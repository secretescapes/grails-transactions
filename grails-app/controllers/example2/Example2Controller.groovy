package example2

import grails.transactions.Author

class Example2Controller {

	def staticTransactionalService
	def staticTransactionalExceptionsService
	def annotatedTransactionalService

    def index() { }

	def exampleA() {
		try {
			staticTransactionalService.createAndCallToThrowCheckedException()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def exampleB() {
		try {
			staticTransactionalExceptionsService.createAndThrowCheckedException()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def exampleC() {
		try {
			annotatedTransactionalService.createAndCallToThrowCheckedException()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def exampleD() {
		try {
			annotatedTransactionalService.tryCreateAndCallToThrowUnchecked()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}
}
