package org.muzir.book.solution.ReusingClasses;

class A {
	public A() {
		System.out.println("A is called");
	}
}

class B {
	public B() {
		System.out.println("B is called");
	}
}

class C extends A {
	B b = new B();
}

public class Exercise5 {
	public static void main(String[] args) {
		C c = new C();
	}
}
