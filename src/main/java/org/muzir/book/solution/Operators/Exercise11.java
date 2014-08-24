package org.muzir.book.solution.Operators;

/**
 * @author muzir
 *
 */
public class Exercise11 {
	public static void main(String[] args) {
		int i1 = 2;
		int i2 = 8;
		System.out.println("Initial i1 value:" + i1 + " Binary Value:"
				+ Integer.toBinaryString(i1));
		System.out.println("Initial i1 value:" + i1 + " Binary Value:"
				+ Integer.toBinaryString(i1));
		// Divide i2 i1 times by 2 8/2=4 then 4/2=2
		int rightShiftOperatorResult = i2 >> i1;
		System.out.println("After right shift value:"
				+ rightShiftOperatorResult + " Binary value:"
				+ Integer.toBinaryString(rightShiftOperatorResult));
		// Multiply i2 i1 times by 2 8*2=16 then 16*2=32
		int leftShiftOperatorResult = i2 << i1;
		System.out.println("After left shift value:" + leftShiftOperatorResult
				+ " Binary value:"
				+ Integer.toBinaryString(leftShiftOperatorResult));

		int allBinaryOne = 0xFF;
		int signedZeroExtension = 0x7F;
		System.out.println("All Binary One:" + allBinaryOne);
		// Multipyl allBinaryOne 2 times by 2
		int leftShiftAllBinaryOne = allBinaryOne << 2;
		System.out.println("leftShiftAllBinaryOne value:"
				+ leftShiftAllBinaryOne + " Binary Value:"
				+ Integer.toBinaryString(leftShiftAllBinaryOne));
		// Remove 2 1 starting from high significiant bit
		int unsignedRightShiftOperatorResult = allBinaryOne >>> 2;
		System.out.println("unsignedRightShiftOperatorResult value:"
				+ unsignedRightShiftOperatorResult + " Binary Value:"
				+ Integer.toBinaryString(unsignedRightShiftOperatorResult));
		System.out.println("signedZeroExtension value:" + signedZeroExtension
				+ " Binary Value:"
				+ Integer.toBinaryString(signedZeroExtension));
		int signedZeroExtensionResult = signedZeroExtension >>> 2;
		System.out.println("signZeroExtensionResult value:"
				+ signedZeroExtensionResult + " Binary Value:"
				+ Integer.toBinaryString(signedZeroExtensionResult));
	}
}
