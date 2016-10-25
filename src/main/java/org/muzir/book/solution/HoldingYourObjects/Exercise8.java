package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise8 {
	public static void main(String[] args) {
		List<Gerbilo> gerbils = Arrays.asList(new Gerbilo(0), new Gerbilo(0), new Gerbilo(1), new Gerbilo(100));
		Iterator<Gerbilo> iterator = gerbils.iterator();
		while (iterator.hasNext()) {
			Gerbilo g = iterator.next();
			g.hop();
		}
	}
}
