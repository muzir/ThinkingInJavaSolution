package org.muzir.book.solution;

import static org.muzir.book.solution.AccessControl.debugOff.Exercise3.*;

import org.muzir.book.solution.AccessControl.Exercise4;

/**
 * Hello world!
 *
 */
class InitialValue {
	int i;

	int f(int i) {
		return i * 10;
	}
}

public class App {
	public static void main(String[] args) {
		InitialValue initialValue = new InitialValue();
		System.out.println("f method return:" + initialValue.f(initialValue.i));
		org.muzir.book.solution.AccessControl.Exercise1 exercise1 = new org.muzir.book.solution.AccessControl.Exercise1();
		System.out.println("Exercise1 " + exercise1.getClass());
		debug();
		Exercise4 exercise4 = new Exercise4();
		System.out.println("Age:" + exercise4.get_age());
	}
}
