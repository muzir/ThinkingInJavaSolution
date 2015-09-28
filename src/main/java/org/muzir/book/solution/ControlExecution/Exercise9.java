package org.muzir.book.solution.ControlExecution;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {

	public static void main(String[] args) {
		int number = 89;
		// number = Integer.parseInt(args[0]);
		fibonacciNumber(number);
	}

	private static void fibonacciNumber(int number) {
		List<Integer> fibonacciSequence = new ArrayList<Integer>();
		fibonacciSequence.add(0);
		if (number == 0) {
			printList(fibonacciSequence);
		}
		fibonacciSequence.add(1);
		for (;;) {
			if (number == 1) {
				printList(fibonacciSequence);
				break;
			}
			int index = fibonacciSequence.size();
			int nextFibonacciValue = fibonacciSequence.get(index - 1)
					+ fibonacciSequence.get(index - 2);
			fibonacciSequence.add(nextFibonacciValue);
			number = number - 1;

		}
	}

	private static void printList(List<Integer> fibonacciSequence) {
		for (Integer i : fibonacciSequence) {
			System.out.print(i + ", ");
		}
	}

}
