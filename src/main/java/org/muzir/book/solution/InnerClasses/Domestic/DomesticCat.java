package org.muzir.book.solution.InnerClasses.Domestic;

import org.muzir.book.solution.InnerClasses.Cats.Cats;
import org.muzir.book.solution.InnerClasses.animal.Animal;

public class DomesticCat extends Cats {
	public Animal ancestor() {
		Cats cat = new Cats();
		return cat.new Lion();
	}
}
