package org.muzir.book.solution.InnerClasses;

public class Exercise11 {
	private class Chair implements Shape {
		public String getType() {
			return "unknown";
		}
	}
	private Shape getShape() {
		Shape chair = new Chair();
		return chair;
	}

	public static void main(String[] args) {
		Exercise11 exercise11 = new Exercise11();
		System.out.println(exercise11.getShape().getType());
	}
}
