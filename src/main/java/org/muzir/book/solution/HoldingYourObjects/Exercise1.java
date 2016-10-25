package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.List;

class Gerbil {
	private int gerbilNumber;

	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}

	public void hop() {
		System.out.println(gerbilNumber);
	}
}

public class Exercise1 {
	public static void main(String[] args) {
		List<Gerbil> gerbils = Arrays.asList(new Gerbil(0), new Gerbil(0), new Gerbil(1), new Gerbil(100));
		gerbils.forEach(u -> u.hop());
	}
}
