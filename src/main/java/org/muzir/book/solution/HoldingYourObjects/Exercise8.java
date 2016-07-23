package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise8 {
	public static void main(String[] args) {
		List<Gerbil> gerbils = Arrays.asList(new Gerbil(0), new Gerbil(0), new Gerbil(1), new Gerbil(100));
		Iterator<Gerbil> iterator = gerbils.iterator();
		while (iterator.hasNext()) {
			Gerbil g = iterator.next();
			g.hop();
		}
	}
}
