package org.muzir.book.solution.ReusingClasses;

/**
 * @author muzir
 *
 */
class Animal {
	public void say(String message) {
		System.out.println("Animal say with parameter:" + message);
		return;
	}

	public void say() {
		System.out.println("Animal say no paramater");
	}

	public void say(int i) {
		System.out.println("Animal say int paramater:" + i);
	}
}

class Cat extends Animal {
	@Override
	public void say() {
		System.out.println("Meow");
	}

}

public class Exercise13 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();
		animal.say();
		animal.say("Hi");
		animal.say(1);
		cat.say();
	}
}
