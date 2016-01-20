package org.muzir.book.solution.InnerClasses;

class MNA {
	private void f() {
	}

	class A {
		private void g() {
		};

		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}

/**
 * @author erhun.baycelik
 *
 */
public class MultiplyNestedClasses {

	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A manaa = mna.new A();
		MNA.A.B manaab = manaa.new B();
		manaab.h();
	}
}
