package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise10 {
	public Shape foo(boolean param) {
		if (param) {
			class WindowType implements Shape {
				String windowType = "Rectangular";

				public String getType() {
					return windowType;
				}
			}
			Shape windowType2 = new WindowType();
			return windowType2;
		}
		Shape shape = new Shape() {
			public String getType() {
				return "default";
			}
		};
		return shape;
	}

	public static void main(String[] args) {
		Exercise10 exercise1 = new Exercise10();
		System.out.println(exercise1.foo(true).getType());
		System.out.println(exercise1.foo(false).getType());
	}
}
