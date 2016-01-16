package org.muzir.book.solution.Interfaces;

abstract class Animal {
	public static void what() {
		System.out.println("What");
	}
}

class Dog extends Animal {
	public static void say() {
		System.out.println("Bark bark");
	}
}

public class Exercise4 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.what();
	}
}
