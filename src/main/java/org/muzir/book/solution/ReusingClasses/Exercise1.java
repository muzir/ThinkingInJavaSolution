package org.muzir.book.solution.ReusingClasses;

/**
 * Use lazy initialization to instantiate composite object
 * 
 * @author muzir
 *
 */
class Simple {
	String _message;

	Simple(String message) {
		_message = message;
	}

	@Override
	public String toString() {
		return "Simple [_message=" + _message + "]";
	}
}

class SimpleImpl {
	Simple simple;

	public SimpleImpl() {
		if (simple == null) {
			simple = new Simple("Simple Object Message");
		}
	}

	@Override
	public String toString() {
		return "SimpleImpl [simple=" + simple + "]";
	}

}

public class Exercise1 {

	public static void main(String[] args) {
		SimpleImpl simpleImpl = new SimpleImpl();
		System.out.println(simpleImpl);
	}
}
