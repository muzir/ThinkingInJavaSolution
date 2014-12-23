package org.muzir.book.solution.Interfaces;

abstract class Person {
	public Person() {
		print();
	}

	abstract void print();
}

class Student extends Person {
	int age = 10;

	@Override
	void print() {
		System.out.println("Age:" + age);

	}

}

public class Exercise3 {
	public static void main(String[] args) {
		Student student = new Student();
		student.print();
	}
}
