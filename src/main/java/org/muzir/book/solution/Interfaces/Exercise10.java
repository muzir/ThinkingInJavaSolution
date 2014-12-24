package org.muzir.book.solution.Interfaces;

import org.muzir.book.solution.Commons.CommonBase;
import org.muzir.book.solution.Polymorphism.Note;

interface Playable {
	// Compile-time constant:
	int VALUE = 5; // static & final

	// Cannot have method definitions:
	void play(Note n); // Automatically public

	void adjust();
}

class Wind1 extends CommonBase implements Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Percussion1 extends CommonBase implements Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Stringed1 extends CommonBase implements Playable {
	public void play(Note n) {
		print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		print(this + ".adjust()");
	}
}

class Brass1 extends Wind1 {
	public String toString() {
		return "Brass";
	}
}

class Woodwind1 extends Wind1 {
	public String toString() {
		return "Woodwind";
	}
}

public class Exercise10 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Playable i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Playable[] orchestra = { new Wind1(), new Percussion1(),
				new Stringed1(), new Brass1(), new Woodwind1() };
		tuneAll(orchestra);
	}
}
/*
 * Output: Wind.play() MIDDLE_C Percussion.play() MIDDLE_C Stringed.play()
 * MIDDLE_C Brass.play() MIDDLE_C Woodwind.play() MIDDLE_C
 */// :~

