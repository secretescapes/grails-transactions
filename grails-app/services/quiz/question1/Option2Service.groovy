package quiz.question1

import grails.transaction.NotTransactional
import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames

@Transactional
class Option2Service {


	static transactional = true

	@NotTransactional
	def foo() {
		new Author(name: RandomNames.getRandomName()).save()
		throw new RuntimeException("Something went wrong")
	}
}
