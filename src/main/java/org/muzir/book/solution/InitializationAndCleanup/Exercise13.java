package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class Rhino {
	String _name;

	public Rhino(String name) {
		_name = name;
	}

	@Override
	public String toString() {
		return "Rhino [_name=" + _name + "]";
	}
}

class Rhinos {
	static Rhino rhino1;
	static Rhino rhino2;

	public Rhinos() {
		System.out.println("Rhinos constructor called");
	}

	static {
		rhino1 = new Rhino("Bobby");
		rhino2 = new Rhino("Tobby");
	}
	String _name;

	@Override
	public String toString() {
		return _name;
	}
}

public class Exercise13 {

	public static void main(String[] args) {
		System.out.println(Rhinos.rhino1.toString());
		System.out.println(Rhinos.rhino2.toString());
		@SuppressWarnings("unused")
		Rhinos rhinos = new Rhinos();
	}
}
