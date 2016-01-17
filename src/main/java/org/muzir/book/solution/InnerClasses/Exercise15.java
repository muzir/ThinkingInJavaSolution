package org.muzir.book.solution.InnerClasses;

class Horse {
	protected String type;

	public Horse(String paramType) {
		type = paramType;
	}
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise15 {
	public Horse getHorse() {
		return new Horse("hinny"){};
	}

	public static void main(String[] args) {
		Exercise15 exercise15 = new Exercise15();
		Horse horse = exercise15.getHorse();
		System.out.println(horse.type);
	}
}
