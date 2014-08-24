package org.muzir.book.solution.Operators;

/**
 * Show that hex and octal notations work with long values. Use
 * Long.toBinaryString() to display the results
 * 
 * @author muzir
 *
 */
public class Exercise8 {
	public static void main(String[] args) {
		int i1 = 0x2F;// hex value binary 101111
		int i2 = 0177;
		long n1 = 200L;// long value binary 11001000
		long result = i1 + n1;// add long to hex
		System.out.println(Long.toBinaryString(result));
		long result2 = n1 + i2;// add long to octal number
		System.out.println(Long.toBinaryString(result2));
	}
}
