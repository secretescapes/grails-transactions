package example1

import grails.transaction.NotTransactional
import grails.transactions.Author
import grails.transactions.RandomNames


class AnnotatedAtMethodLevelOnlyService {

	@NotTransactional
	def createAndThrowUncheckedException() {
		// This is still transactional as it doesn't have a class level annotation.
		new Author(name: RandomNames.getRandomName()).save()
		throw new RuntimeException("Something went wrong")
    }
}
