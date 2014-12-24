package org.muzir.book.solution.Interfaces;

import org.muzir.book.solution.Interfaces.test.IHuman;

class Human implements IHuman {

	public void physiologicalNeeds() {
		System.out.println("Being healhty");

	}

	public void safetyNeeds() {
		System.out.println("Feel the safety");

	}

	public void esteem() {
		System.out.println("Respect the society and yourself");

	}

}

public class Exercise5 {

	public static void main(String[] args) {
		Human human = new Human();
		human.physiologicalNeeds();
		human.safetyNeeds();
		human.esteem();
	}
}
