package org.muzir.book.solution.InnerClasses;

import org.muzir.book.solution.InnerClasses.Outer.Inner;

/**
 * @author muzir
 *
 */
class Outer {
	private String type;

	public Outer(String type) {
		this.type = type;
	}

	public Inner getInner() {
		return new Inner();
	}

	class Inner {

		@Override
		public String toString() {
			return "Inner [type() = " + type + " ]";
		}

	}
}

/**
 * @author muzir
 *
 */
public class Exercise1 {
	public static void main(String[] args) {
		Outer outer = new Outer("outer");
		Inner inner = outer.getInner();
		System.out.println(inner.toString());
	}
}
