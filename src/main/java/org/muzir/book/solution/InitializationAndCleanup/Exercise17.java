package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class StringObject {
	String _param;

	public StringObject() {
		System.out.println("Test");
	}

	public StringObject(String param) {
		_param = param;
		System.out.println("Param:" + param);
	}

	@Override
	public String toString() {
		return "StringObject [_param=" + _param + "]";
	}

}

public class Exercise17 {

	public static void main(String[] args) {
		StringObject[] array = new StringObject[1];
		array[0] = new StringObject("Ali");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
