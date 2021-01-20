package quiz.question3

import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames

@Transactional
class Question3Service {

	def question3ExceptionService
	def question3ExceptionStaticPropertyService

    def optionA() {
		new Author(name: RandomNames.getRandomName()).save()
		throw new ExceptionA("Something went wrong")
    }

	def optionB() {
		try {
			new Author(name: RandomNames.getRandomName()).save()
			throw new ExceptionA("Something went wrong")
		} catch (ExceptionA e) {
			//handle exception
		}
	}

	def optionC() {
		new Author(name: RandomNames.getRandomName()).save()
		question3ExceptionService.throwExceptionA()
	}

	def optionD() {
		try {
			new Author(name: RandomNames.getRandomName()).save()
			question3ExceptionService.throwExceptionA()
		} catch(ExceptionA e) {
			//handle Exception
		}
	}

	def optionE() {
		new Author(name: RandomNames.getRandomName()).save()
		question3ExceptionService.throwExceptionB()
	}

	def optionF() {
		new Author(name: RandomNames.getRandomName()).save()
		question3ExceptionStaticPropertyService.throwExceptionA()
	}
}