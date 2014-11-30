package org.muzir.book.solution.ReusingClasses;

public class Evercise7 {

	public static void main(String[] args) {
		F f = new F();

	}

}

class D {
	public D(int i) {
		System.out.println("D is called:" + i);
	}
}

class E {
	public E(int i) {
		System.out.println("E is called:" + i);
	}
}

class F extends D {
	public F() {
		super(10);
		E e = new E(5);
	}
}
