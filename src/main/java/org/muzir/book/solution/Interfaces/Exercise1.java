package org.muzir.book.solution.Interfaces;

abstract class Rodent {
	protected void nibble() {
		isWho();
	}

	protected void isWho() {
		System.out.println("Rodents nibble");
	}
}

class Mouse extends Rodent {
	@Override
	protected void isWho() {
		System.out.println("Mouse nibble");
	}
}

class Gerbil extends Rodent {
	@Override
	protected void isWho() {
		System.out.println("Gerbil nibble");
	}
}

class Hamster extends Rodent {
	@Override
	protected void isWho() {
		System.out.println("Hamster nibble");
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		// Rodent rodent1 = new Rodent();
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent rodent : rodents) {
			rodent.nibble();
		}
	}
}
