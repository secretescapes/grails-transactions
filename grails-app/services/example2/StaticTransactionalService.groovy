package example2

import grails.transactions.Author
import grails.transactions.RandomNames

class StaticTransactionalService {

	def staticTransactionalExceptionsService

	static transactional = true

	def createAndCallToThrowCheckedException() {
		// The exception will be wrapped in an unchecked exception, so there should be a rollback
		new Author(name: RandomNames.getRandomName()).save()
		staticTransactionalExceptionsService.throwCheckedException()
	}
}
