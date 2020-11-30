package grails.transactions

class Author {

	String name
	List<Book> books = []

	static hasMany = ['books': Book]

    static constraints = {
    }
}
