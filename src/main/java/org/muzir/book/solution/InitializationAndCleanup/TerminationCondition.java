package org.muzir.book.solution.InitializationAndCleanup;

//: initialization/TerminationCondition.java
// Using finalize() to detect an object that
// hasn't been properly cleaned up.

class Book {
	boolean checkedOut = false;

	Book(boolean checkOut) {
		checkedOut = checkOut;
	}

	protected void finalize() {

		System.out.println("Error: checked out");
		// Normally, you'll also do this:
		// super.finalize(); // Call the base-class version
	}
}

public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		// Drop the reference, forget to clean up:
		new Book(true);
		// Force garbage collection & finalization:
		System.gc();
	}
} /*
 * Output: Error: checked out
 */// :~