package org.muzir.book.solution.Operators;

//: operators/Exercise5.java
/**
 * @author muzir Create a class called Dog containing two Strings:name and says.
 *         In main(), create two dog objetcs with names "spot" (who says,
 *         "Ruff") and "scruffy" (who says, "Wurf!"). Then display their names
 *         and what they say.
 * */
class Dog {
	Dog(String name, String say) {
		_name = name;
		_say = say;
	}

	@Override
	public String toString() {
		return "Name: " + _name + " Say--" + _say;
	}

	String _name;
	String _say;
}

public class Exercise5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff!");
		Dog dog2 = new Dog("scruffy", "Wurf!");
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		// Created for Exercise6
		Dog dog3 = new Dog("Karabas", "Hav");
		dog3 = dog1;
		if (dog3 == dog1) {
			System.out.println("Karabas same with spot");
		} else {
			System.out.println("Karabas different from spot");
		}

		if (dog3.equals(dog1)) {
			System.out.println("Karabas same with spot");
		} else {
			System.out.println("Karabas different from spot");
		}
		if (dog3 == dog2) {
			System.out.println("Karabas same with scruffy");
		} else {
			System.out.println("Karabas different from scruffy");
		}

		if (dog3.equals(dog2)) {
			System.out.println("Karabas same with scruffy");
		} else {
			System.out.println("Karabas different from scruffy");
		}
	}
}
