package org.muzir.book.solution.ControlExecution;

/**
 * @author muzir
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		boolean isPrime = true;
		for (int i = 2; i < 1000000; i++) {
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Number " + i + " is Prime!");
			}
		}
	}

}
