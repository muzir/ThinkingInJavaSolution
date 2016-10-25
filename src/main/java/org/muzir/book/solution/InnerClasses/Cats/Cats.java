package org.muzir.book.solution.InnerClasses.Cats;

import org.muzir.book.solution.InnerClasses.animal.Animal;

public class Cats {
	protected class Lion implements Animal {

		public Lion() {
		}

		public void isWarmBlooded() {
			System.out.println("Lion is warm blooded.");
		}
	}
}
