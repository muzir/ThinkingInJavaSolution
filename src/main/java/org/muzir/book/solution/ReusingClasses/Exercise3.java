package org.muzir.book.solution.ReusingClasses;

/**
 * The compiler will synthesizeadefault constructor foryou that calls the
 * base-class constructor
 * 
 * @author muzir
 *
 */
class Art {
	public Art() {
		System.out.println("Art is called");
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("Drawing is called");
	}
}

class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon is called");
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
	}
}
