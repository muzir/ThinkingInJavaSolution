package org.muzir.book.solution.Operators;

/**
 * @author muzir
 *
 *         Write a method that displays char values in binary form.
 */
public class Exercise13 {

	public static void main(String[] args) {
		String helloWorld = "Hello World!";
		char[] charArray = helloWorld.toCharArray();
		for (char c : charArray) {
			// Java lets each primitive type cast to each other except boolean
			int characterAsciValue = (int) c;
			System.out.println("Character: " + c + " characterAsciValue:"
					+ characterAsciValue + " binary value: "
					+ Integer.toBinaryString(characterAsciValue));
		}
	}
}
