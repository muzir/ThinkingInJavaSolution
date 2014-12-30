package org.muzir.book.solution.InnerClasses;

import org.muzir.book.solution.InnerClasses.Animal.Chetah;

class Animal {

	public Chetah getChetah() {
		return new Chetah();
	}

	public class Chetah {
		private Chetah() {
			System.out.println("Run chetah run");
		}
	}
}

public class Exercise5 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Chetah cheetos = animal.getChetah();
	}
}
