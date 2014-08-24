package org.muzir.book.solution.ControlExecution;

public class Exercise7 {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			i = i + 1;
			if (i == 99) {
				break;
			}
		} while (i < 100);
	}
}
