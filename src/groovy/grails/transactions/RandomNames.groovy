package grails.transactions

class RandomNames {

	private static final NAMES = ["Hemingway", "Twain", "Austen", "Dickens", "Woolf"]

	static String getRandomName() {
		Random random = new Random()
		return NAMES[random.nextInt(NAMES.size())]
	}
}
