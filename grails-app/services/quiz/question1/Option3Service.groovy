package quiz.question1

import grails.transaction.NotTransactional
import grails.transactions.Author
import grails.transactions.RandomNames


class Option3Service {

	@NotTransactional
	def foo() {
		new Author(name: RandomNames.getRandomName()).save()
		throw new RuntimeException("Something went wrong")
    }
}
