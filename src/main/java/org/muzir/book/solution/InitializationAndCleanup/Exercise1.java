package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class StringTest {
	String unInitializedString;
}

public class Exercise1 {

	public static void main(String[] args) {
		StringTest stringTest = new StringTest();
		System.out.println(stringTest.unInitializedString);
	}

}
