package org.muzir.book.solution.AccessControl.debugOff;

public class Exercise3 {
	@SuppressWarnings("unused")
	private static String info;

	public Exercise3() {
		info = "Top Secret";
	}

	public static void debug() {
		System.out.println("No information");
	}
}
