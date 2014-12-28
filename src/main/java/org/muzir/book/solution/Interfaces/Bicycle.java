package org.muzir.book.solution.Interfaces;

public class Bicycle implements Cycle {

	@Override
	public void draw() {
		System.out.println(this.getClass() + " draw");
	}

}
