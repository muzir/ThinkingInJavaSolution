package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class OverloadConstructor {
	public OverloadConstructor() {
		System.out.println("Default Constructor");
	}

	public OverloadConstructor(String s) {
		this();
		System.out.println("Argument constructor " + s);
	}
}

public class Exercise9 {

	public static void main(String[] args) {
		OverloadConstructor overloadConstructor = new OverloadConstructor(
				"test");
	}
}
