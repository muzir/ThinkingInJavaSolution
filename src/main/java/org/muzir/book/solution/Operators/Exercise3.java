package org.muzir.book.solution.Operators;

//: Create a class containing a float and use it to demonstrate aliasing during method calls.

class MutableFloat {
	MutableFloat(float value) {
		_value = value;
	}

	float _value;
}

public class Exercise3 {
	private static void changeMutableValue(MutableFloat mutableFloat) {
		mutableFloat._value = 0.0f;
	}

	private static void changeImmutableValue(Float value) {
		value = 1.00f;
	}

	public static void main(String[] args) {
		MutableFloat mutableFloat = new MutableFloat(1.00f);
		System.out.println("MutableFloat first value:" + mutableFloat._value);
		changeMutableValue(mutableFloat);
		System.out.println("After changeMutableValue method call:"
				+ mutableFloat._value);
		changeImmutableValue(mutableFloat._value);
		System.out.println("After changeImmutableValue method call:"
				+ mutableFloat._value);
	}
}
