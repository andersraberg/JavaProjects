package se.anders_raberg.groovy

class MyFirstGroovyTest {

	static main(args) {
		[1, 2, 3].each {e -> println e}
		def list = [4, 5, 6]
		list.add(100)
		list.each {v -> println  2 * v}
	}

}
