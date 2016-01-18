package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise21 implements Exercise21Interface {

	public static void main(String[] args) {
		Exercise21 exercise21 = new Exercise21();
		Exercise21Interface.NestedClass.foo2(exercise21);
	}

	public String foo1() {
		return "foo1";
	}

}
