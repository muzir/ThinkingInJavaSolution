package org.muzir.book.solution.ReusingClasses;

class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}

	@Override
	public String toString() {
		return "Poppet [i=" + i + "]";
	}

}

public class Exercise18 {

	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference

	// Blank finals MUST be initialized in the constructor:
	public Exercise18() {
		j = 1; // Initialize blank final
		p = new Poppet(1); // Initialize blank final reference
	}

	public Exercise18(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}

	public static void main(String[] args) {
		Exercise18 exercise18 = new Exercise18();
		Exercise18 exercise18WithParam = new Exercise18(47);
		System.out.println(exercise18.p.toString());
	}

}
