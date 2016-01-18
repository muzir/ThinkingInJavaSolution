package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise18 {
	private static class NestedClass {
		public String name = "Nested Class";
		protected static String type = "Nested";
	}

	public static void main(String[] args) {
		NestedClass nestedClass = new NestedClass();
		System.out.println(nestedClass.name);
		System.out.println(NestedClass.type);
	}
}
