package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public interface Exercise20 {
	void foo();

	class NestedClass implements Exercise20 {
		public void foo() {
			System.out.println("Invoke a method in an interface:)");
		}

		public static void main(String[] args) {
			NestedClass nestedClass = new NestedClass();
			nestedClass.foo();
		}
	}
}
