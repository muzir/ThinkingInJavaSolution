package org.muzir.book.solution.Operators;

/**
 * Display the largest and smallest numbers for both float and double
 * exponential notation
 * 
 * @author muzir
 *
 */
public class Exercise9 {
	public static void main(String[] args) {

		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;

		System.out.println("Min Float:" + minFloat);
		System.out.println("Max Float:" + maxFloat);
		System.out.println("Min Double:" + minDouble);
		System.out.println("Max Double:" + maxDouble);
	}
}
