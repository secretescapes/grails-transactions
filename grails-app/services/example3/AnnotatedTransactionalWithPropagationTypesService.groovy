package example3

import grails.transaction.Transactional
import grails.transactions.Author
import grails.transactions.RandomNames
import org.springframework.transaction.annotation.Propagation

@Transactional
class AnnotatedTransactionalWithPropagationTypesService {

	@Transactional(propagation = Propagation.REQUIRED)
    def createWithPropagationRequired() {
		new Author(name: RandomNames.getRandomName()).save()
    }

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	def createWithPropagationRequireNew() {
		new Author(name: RandomNames.getRandomName()).save()
	}

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	def createWithPropagationNotSupported() {
		new Author(name: RandomNames.getRandomName()).save()
	}
}
