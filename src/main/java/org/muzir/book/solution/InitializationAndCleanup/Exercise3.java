package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
 class EmptyObject1 {
	EmptyObject1() {
		System.out.println("I am an empty object");
	}

	EmptyObject1(String message) {
		System.out.println("I am an empty as you suppose, this is my message"
				+ message);
	}
}

public class Exercise3 {

	public static void main(String[] args) {
		EmptyObject1 emptyObject = new EmptyObject1();

	}
}
