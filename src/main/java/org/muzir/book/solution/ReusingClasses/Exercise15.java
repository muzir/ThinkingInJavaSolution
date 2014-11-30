package org.muzir.book.solution.ReusingClasses;

class Bikes {
	Bikes(String model) {
		System.out.println("Create a new bike:" + model);
	}

	protected void engineSound() {
		System.out.println("tar tar tar");
	}
}

class Yamaha extends Bikes {
	public Yamaha() {
		super("Yamaha");
		System.out.println("Create a yamaha bike");
	}
}

public class Exercise15 {

	public static void main(String[] args) {
		Yamaha yamaha = new Yamaha();
		yamaha.engineSound();
	}

}
