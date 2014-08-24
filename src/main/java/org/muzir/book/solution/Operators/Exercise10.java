package org.muzir.book.solution.Operators;

/**
 * @author muzir
 *
 */
public class Exercise10 {
	public static void main(String[] args) {
		int i1 = 0xFFFFFFED;
		int i2 = 0x0F;

		System.out.println("Variable i1:" + i1);
		System.out.println("Variable i2:" + i2);

		System.out.println("Binary i1:" + Integer.toBinaryString(i1));
		System.out.println("Binary i2:" + Integer.toBinaryString(i2));

		int andResult = i1 & i2;
		System.out.println("Bitwise AND operation and binary result:"
				+ Integer.toBinaryString(andResult) + " int result:"
				+ andResult);
		int orResult = i1 | i2;
		System.out.println("Bitwise OR operation and result:"
				+ Integer.toBinaryString(orResult) + " int result:" + orResult);
		int xorResult = i1 ^ i2;
		System.out.println("Bitwise XOR operation and result:"
				+ Integer.toBinaryString(xorResult) + " int result:"
				+ xorResult);
		int notResult = ~i1;// ones complement operator
		System.out.println("Bitwise NOT operation and result:"
				+ Integer.toBinaryString(notResult) + " int result:"
				+ notResult);
	}
}
