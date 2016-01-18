package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public interface Exercise21Interface {
	String foo1();

	class NestedClass {
		static void foo2(Exercise21Interface in) {
			System.out.println(in.foo1());
		}
	}
}
