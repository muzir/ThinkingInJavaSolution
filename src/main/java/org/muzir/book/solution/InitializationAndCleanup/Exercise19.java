package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
public class Exercise19 {

	public static void printArgs(String... args) {
		for (String s : args) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		String[] array = new String[] { "d", "e", "f" };
		printArgs("a", "b", "c");
		printArgs(array);
	}
}
