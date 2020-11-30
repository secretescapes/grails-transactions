package example2

import grails.transactions.Author
import grails.transactions.RandomNames

class StaticTransactionalExceptionsService {

	static transactional = true

	def throwCheckedException() {
		// The exception will be wrapped in an unchecked exception, so there will be a rollback
		throw new IOException("Something went wrong")
	}

	def createAndThrowCheckedException() {
		// The exception will be wrapped in an unchecked exception, so there will be a rollback
		new Author(name: RandomNames.getRandomName()).save()
		throw new IOException("Something went wrong")
	}
}
