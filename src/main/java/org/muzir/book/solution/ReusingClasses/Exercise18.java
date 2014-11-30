package org.muzir.book.solution.ReusingClasses;

public class Exercise18 {

	class Value {
		public Value() {
			System.out.println("Create new Value");
		}
	}

	class FinalData {
		final Value v1 = new Value();
		static final Value v19 = new Value();
	}

	public static void main(String[] args) {

	}

}
