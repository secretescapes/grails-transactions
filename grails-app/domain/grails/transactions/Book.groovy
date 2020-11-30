package grails.transactions

class Book {

	String title
	Author author

	static belongsTo = Author

    static constraints = {
    }
}
