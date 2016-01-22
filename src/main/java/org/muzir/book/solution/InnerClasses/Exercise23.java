package org.muzir.book.solution.InnerClasses;

interface U {
	void a();

	void b();

	void c();
}

class A {
	U getU() {
		return new U() {
			public void a() {
				System.out.println("a method called");

			}

			public void b() {
				System.out.println("b method called");

			}

			public void c() {
				System.out.println("c method called");

			}
		};
	}
}

class B {
	U[] arr = new U[10];
	int i = 0;

	void addU(U u) {
		if (i == 9) {
			return;
		}
		arr[i] = u;
		i = i + 1;
	}

	void reset(int j) {
		arr[j] = null;
	}

	void callU() {
		for (int x = 0; x < arr.length - 1; x++) {
			U u = arr[x];
			if (u != null) {
				u.a();
				u.b();
				u.c();
			}
		}
	}
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise23 {
	public static void main(String[] args) {
		A a = new A();
		A a1 = new A();
		A a2 = new A();
		B b = new B();
		b.addU(a.getU());
		b.addU(a1.getU());
		b.addU(a2.getU());

		b.callU();
		b.reset(1);
		b.callU();
	}
}
