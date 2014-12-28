package org.muzir.book.solution.Interfaces;

public class Unicycle implements Cycle {

	@Override
	public void draw() {
		System.out.println(this.getClass() + " draw");
	}

}
