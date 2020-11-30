package example3

import grails.transaction.Transactional

@Transactional
class AnnotatedTransactionalServiceThrowExceptionService {

	def annotatedTransactionalWithPropagationTypesService

    def callCreateAndThrowExceptionPropagationRequired() {
		annotatedTransactionalWithPropagationTypesService.createWithPropagationRequired()
		throw new RuntimeException("Something went wrong")
    }

	def callCreateAndThrowExceptionPropagationRequiresNew() {
		annotatedTransactionalWithPropagationTypesService.createWithPropagationRequireNew()
		throw new RuntimeException("Something went wrong")
	}
	def callCreateAndThrowExceptionPropagationNotSupported() {
		annotatedTransactionalWithPropagationTypesService.createWithPropagationNotSupported()
		throw new RuntimeException("Something went wrong")
	}
}
