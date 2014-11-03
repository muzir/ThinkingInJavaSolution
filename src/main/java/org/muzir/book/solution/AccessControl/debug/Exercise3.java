package org.muzir.book.solution.AccessControl.debug;

public class Exercise3 {
	private static String info = "Top Secret";

	public Exercise3() {
		// Exercise7 can not be invoked because class access modifier is package
		// friendly(default access modifier)
		// Exercise7 exercise7 = new Exercise7();
	}

	public static void debug() {
		System.out.println(info);
	}
}
