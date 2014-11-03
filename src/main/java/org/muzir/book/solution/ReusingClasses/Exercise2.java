package org.muzir.book.solution.ReusingClasses;

public class Exercise2 extends Detergent {

	@Override
	public void scrub() {
		System.out.println("Invoked from exercise2");
		super.scrub();
	}

	public void sterilize() {

	}

	public static void main(String[] args) {
		Exercise2 exercise2 = new Exercise2();
		exercise2.scrub();
	}

}
