package quiz.question3

class Question3ExceptionStaticPropertyService {

	static transactional = true

	def throwExceptionA() {
		throw new ExceptionA("Something went wrong")
	}
}
