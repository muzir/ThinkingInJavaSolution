package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise12 {

	public Shape getPencil(final String type) {
		return new Shape() {
			private String pencilType = type;

			public String getType() {
				return pencilType;
			}
		};
	}

	public static void main(String[] args) {
		Exercise12 exercise12 = new Exercise12();
		Shape shape = exercise12.getPencil("0.7");
		System.out.println("Shape type:" + shape.getType());
	}
}
