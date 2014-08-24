package org.muzir.book.solution;

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
	}
}
