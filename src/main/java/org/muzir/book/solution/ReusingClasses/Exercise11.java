package org.muzir.book.solution.ReusingClasses;

public class Exercise11 {

	public static void main(String[] args) {
		Detergent1Delegation detergent1Delegation = new Detergent1Delegation();
		detergent1Delegation.scrub();
		System.out.println(detergent1Delegation.cleanser1.toString());
	}

}

class Cleanser1 {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}
}

class Detergent1 extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

} /*
 * Output: Cleanser dilute() apply() Detergent.scrub() scrub() foam() Testing
 * base class: Cleanser dilute() apply() scrub()
 */// :~

class Detergent1Delegation {
	Cleanser1 cleanser1 = new Cleanser1();

	public Detergent1Delegation() {

	}

	public void scrub() {
		cleanser1.scrub();
	}
}
