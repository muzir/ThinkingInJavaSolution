package org.muzir.book.solution.InitializationAndCleanup;

/**
 * Difference with two approach, Java initialize
 * Initialization1.initializeByDefinition before, because Initialization2
 * approach initialize the field when constructor is called. It is different
 * when extend this two class and usage of super method.
 * 
 * @author muzir
 *
 */
class Initialization1 {
	String initializeByDefinition = "initializeByDefinition";
}

class Initialization2 {
	public Initialization2() {
		initializeByDefinition = "initializeByDefinition";
	}

	String initializeByDefinition;
}

public class Exercise2 {

	public static void main(String[] args) {
		Initialization1 initialization1 = new Initialization1();
		System.out.println(initialization1.initializeByDefinition);
		Initialization2 initialization2 = new Initialization2();
		System.out.println(initialization2.initializeByDefinition);
	}

}
