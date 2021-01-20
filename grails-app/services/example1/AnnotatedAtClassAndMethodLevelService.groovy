package example1

import grails.transaction.NotTransactional
import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames


@Transactional
class AnnotatedAtClassAndMethodLevelService {

	@NotTransactional
	def createAndThrowUncheckedException() {
		// This now transactional, as it has been properly annotated at class level
		new Author(name: RandomNames.getRandomName()).save()
		throw new RuntimeException("Something went wrong")
	}
}
