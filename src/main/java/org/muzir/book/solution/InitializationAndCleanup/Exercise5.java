package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class Dog {
	public String bark(char c) {
		return "Character bark";
	}

	public String bark(int i) {
		return "Integer bark";
	}

	public String bark(short s) {
		return "Short bark";
	}

	public String bark(double d) {
		return "Double bark";
	}

	public String bark(float f) {
		return "Float bark";
	}

	public String bark(float f, int i) {
		return "Float int hybrid bark";
	}

	public String bark(int i, float f) {
		return "Float int hybrid bark reverse order";
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		long l = 2l;
		short s = 1;
		int i = 10;
		char c = 'c';
		float f = 2.113434f;
		Dog dog = new Dog();
		System.out.println("Argument char: " + dog.bark(c));
		System.out.println("Argument int: " + dog.bark(i));
		System.out.println("Argument short: " + dog.bark(s));
		System.out.println("Argument long: " + dog.bark(l));
		System.out.println("Argument float and int: " + dog.bark(f, i));
		System.out.println("Argument int and float:" + dog.bark(i, f));
	}
}
