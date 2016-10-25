package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.List;

class Gerbilo {
	private int gerbilNumber;

	public Gerbilo(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println(gerbilNumber);
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		List<Gerbilo> gerbils = Arrays.asList(new Gerbilo(0), new Gerbilo(0), new Gerbilo(1), new Gerbilo(100));
		gerbils.forEach(u -> u.hop());
	}
}
