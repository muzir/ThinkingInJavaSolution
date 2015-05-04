package org.muzir.book.solution.InnerClasses;

class Chair {
	public Shape createChairType() {
		return new Shape() {
			private String type = "perpendicular";

			public String getType() {
				return type;
			}

		};
	}
}

/**
 * @author muzir
 *
 */
public class Exercise13 {
	public static void main(String[] args) {
		Chair c = new Chair();
		Shape chairType = c.createChairType();
		System.out.println(chairType.getType());
	}
}
