// : innerClasses/Parsel3.java
// Using .new to create instances of inner classe.
package org.muzir.book.solution.InnerClasses;

public class Parsel3 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		Parsel3 parcel3 = new Parsel3();
		Contents contents = parcel3.new Contents();
		System.out.println("value:" + contents.value());
		Destination destination = parcel3.new Destination("Tasmania");
		System.out.println("destination:" + destination.readLabel());
	}
}
