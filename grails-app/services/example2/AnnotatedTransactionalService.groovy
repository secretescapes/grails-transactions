package example2

import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames

@Transactional
class AnnotatedTransactionalService {

	def annotatedTransactionalExceptionsService



	def createAndCallToThrowCheckedException() {
		new Author(name: RandomNames.getRandomName()).save()
		annotatedTransactionalExceptionsService.throwCheckedException()
	}

	def tryCreateAndCallToThrowUnchecked() {
		try {
			new Author(name: RandomNames.getRandomName()).save()
			annotatedTransactionalExceptionsService.throwUncheckedException()
		} catch (RuntimeException e) {
			//swallow the exception
		}
	}
}
