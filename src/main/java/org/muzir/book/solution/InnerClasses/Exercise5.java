package org.muzir.book.solution.InnerClasses;

import org.muzir.book.solution.InnerClasses.Animal.Chetah;

/**
 * @author muzir
 *
 */
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

/**
 * @author muzir
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		@SuppressWarnings("unused")
		Chetah cheetos = animal.getChetah();
	}
}
