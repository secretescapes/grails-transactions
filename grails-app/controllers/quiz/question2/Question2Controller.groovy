package quiz.question2

class Question2Controller {

	def question2Service

    def index() { }

	def foo() {
		try {
			question2Service.bar()
			render "A"
			return
		}
		catch(BlahException e) {
			render "B"
			return
		}
		catch(Throwable t) {
			render "C"
			return
		}
	}
}
