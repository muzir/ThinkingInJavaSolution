package org.muzir.book.solution.ControlExecution;

/**
 * @author muzir
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		int i1 = 0x0E;
		int i2 = 0x0F;

		System.out.println("Variable i1:" + i1);
		System.out.println("Variable i2:" + i2);

		System.out.println("Binary i1:" + toBinaryString(i1));
		System.out.println("Binary i2:" + toBinaryString(i2));

		int andResult = i1 & i2;
		System.out.println("Bitwise AND operation and binary result:"
				+ toBinaryString(andResult) + " int result:" + andResult);
		int orResult = i1 | i2;
		System.out.println("Bitwise OR operation and result:"
				+ toBinaryString(orResult) + " int result:" + orResult);
		int xorResult = i1 ^ i2;
		System.out.println("Bitwise XOR operation and result:"
				+ toBinaryString(xorResult) + " int result:"
				+ xorResult);
		int notResult = ~i1;// ones complement operator
		System.out.println("Bitwise NOT operation and result:"
				+ toBinaryString(notResult) + " int result:"
				+ notResult);

	}

	private static String toBinaryString(int param) {
		if (param <= 0) {
			throw new RuntimeException("Paramater less than or equal to 0");
		}
		int remainder = 0;
		int division = 0;
		String binary = "";
		do {
			division = param / 2;
			remainder = param % 2;
			binary = remainder + binary;
			param = division;
		} while (1 < param);
		return division + binary;
	}
}
