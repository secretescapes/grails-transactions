package example2

import grails.transaction.Transactional
import grails.transactions.Author

@Transactional
class AnnotatedTransactionalExceptionsService {
	def throwCheckedException() {
		throw new IOException("Something went wrong")
	}

	def throwUncheckedException() {
		throw new RuntimeException("Something went wrong")
	}
}
