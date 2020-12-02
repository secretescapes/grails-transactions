package example1

import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames


class AnnotatedAtMethodLevelAndStaticFalseService {

	static transactional = false

	@Transactional
	def createAndThrowUncheckedException() {
		new Author(name: RandomNames.getRandomName()).save()
		throw new RuntimeException("Something went wrong")
	}
}
