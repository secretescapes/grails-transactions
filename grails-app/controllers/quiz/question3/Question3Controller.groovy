package quiz.question3

import grails.transactions.Author

class Question3Controller {

	def question3Service

    def index() { }

	def optionA() {
		try {
			question3Service.optionA()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def optionB() {
		try {
			question3Service.optionB()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def optionC() {
		try {
			question3Service.optionC()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def optionD() {
		try {
			question3Service.optionD()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def optionE() {
		try {
			question3Service.optionE()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}

	def optionF() {
		try {
			question3Service.optionF()
		} catch(RuntimeException e) {
			flash.message = "Checked exception was trown: ${e.toString()}"
		} catch(Exception e) {
			flash.message = "Unchecked exception was trown: ${e.toString()}"
		}
		return [authors: Author.findAll()]
	}
}
