package org.muzir.book.solution.Polymorphism;

class Cycle {
	protected void balance() {
		System.out.println("Cycle balance called");
	}
}

class Unicycle extends Cycle {
	public void balance() {
		System.out.println("Unicycle balance called");
	}
}

class Bicycle extends Cycle {
	public void balance() {
		System.out.println("Bicycle balance called");
	}
}

class Tricycle extends Cycle {

}

public class Exercise15 {
	public static void main(String[] args) {
		Cycle[] cycles = { new Bicycle(), new Unicycle(), new Tricycle() };
		cycles[0].balance();
		((Unicycle)cycles[1]).balance();
		((Tricycle)cycles[2]).balance();
	}

}
