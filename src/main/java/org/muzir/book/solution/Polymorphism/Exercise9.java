package org.muzir.book.solution.Polymorphism;

class Rodent {
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

class Gerbil extends Rodent implements Comparable {
	@Override
	protected void isWho() {
		System.out.println("Gerbil nibble");
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Hamster extends Rodent {
	@Override
	protected void isWho() {
		System.out.println("Hamster nibble");
	}
}

public class Exercise9 {
	public static void main(String[] args) {
		Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };
		for (Rodent rodent : rodents) {
			rodent.nibble();
		}
	}

}
