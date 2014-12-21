//: polymorphism/PrivateOverride.java
// Trying to override a private method.
package org.muzir.book.solution.Polymorphism;

import org.muzir.book.solution.Commons.CommonBase;

public class PrivateOverride extends CommonBase {
	private void f() {
		print("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {

	public void f() {
		print("public f()");
	}
} /*
 * Output: private f()
 */// :~
