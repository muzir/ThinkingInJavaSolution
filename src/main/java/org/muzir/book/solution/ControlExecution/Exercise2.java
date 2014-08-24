package org.muzir.book.solution.ControlExecution;

import java.util.Random;

/**
 * @author muzir
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			int firstRandomNumber = random.nextInt(100);
			int secondRandomNumber = random.nextInt(100);
			System.out.println("First number:" + firstRandomNumber
					+ " Second number:" + secondRandomNumber);
			if (firstRandomNumber > secondRandomNumber) {
				System.out
						.println("First generated number is greater than second one.");
			} else if (secondRandomNumber > firstRandomNumber) {
				System.out
						.println("Second generated number is greater than first one.");
			} else {
				System.out
						.println("First and second generated number are equal.");
			}
		}
	}

}
