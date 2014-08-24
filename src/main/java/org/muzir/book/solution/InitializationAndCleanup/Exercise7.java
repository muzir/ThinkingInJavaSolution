package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class NoConstructorClass {

}

public class Exercise7 {

	public static void main(String[] args) {
		NoConstructorClass noConstructorClass = new NoConstructorClass();
		System.out.println(noConstructorClass.hashCode());
		System.out.println(noConstructorClass.getClass().getName());
	}

}
