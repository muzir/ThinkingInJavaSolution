package org.muzir.book.solution.Operators;

import java.util.Random;

/**
 * @author muzir Write a program that simulates coin-flipping
 */
public class Exercise7 {
	public static void main(String[] args) {
		Random random = new Random();
		int coinResult = random.nextInt(2);
		if (coinResult == 0) {
			System.out.println("Head");
		} else if (coinResult == 1) {
			System.out.println("Tail");
		} else {
			System.out.println("Unexpected Result");
		}
	}
}
