package org.muzir.book.solution.ReusingClasses;

public class Exercise8 {

	public static void main(String[] args) {
		DerivedClass derivedClass = new DerivedClass(10);
	}

}

class BaseClass {
	public BaseClass(int i) {
		System.out.println("BaseClass is invoked:" + i);
	}
}

class DerivedClass extends BaseClass {
	public DerivedClass() {
		super(5);
		System.out.println("DerivedClass default constructor");
	}

	public DerivedClass(int i) {
		super(5);
		System.out.println("Non Default constructor");
	}
}