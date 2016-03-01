package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class EmptyObject2 {
	EmptyObject2(String message) {
		System.out.println("I am an empty as you suppose, this is my message"
				+ message);
	}
}

public class Exercise4 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EmptyObject2 emptyObjectWithMessage = new EmptyObject2(
				" Peace all the world.");
	}

}
