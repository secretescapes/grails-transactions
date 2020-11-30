package example3

import grails.transactions.Author

class Example3Controller {

	def annotatedTransactionalServiceThrowExceptionService

    def index() { }

	def propagationRequired() {
		try {
			annotatedTransactionalServiceThrowExceptionService.callCreateAndThrowExceptionPropagationRequired()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def propagationRequiresNew() {
		try {
			annotatedTransactionalServiceThrowExceptionService.callCreateAndThrowExceptionPropagationRequiresNew()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def propagationNotSupported() {
		try {
			annotatedTransactionalServiceThrowExceptionService.callCreateAndThrowExceptionPropagationNotSupported()
		} catch(IOException checkedException) {
			flash.message = "Checked exception was trown: ${checkedException.toString()}"
		} catch(RuntimeException uncheckedException) {
			log.error "Exception", uncheckedException
			flash.message = "Unchecked exception was trown: ${uncheckedException.toString()}"
		}
		return [authors: Author.findAll()]
	}
}
