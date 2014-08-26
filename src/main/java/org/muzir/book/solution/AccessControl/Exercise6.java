package org.muzir.book.solution.AccessControl;

/**
 * @author muzir
 *
 */
class Gene {
	protected String _data = "INSTINCT";
}

class Human {
	public Human() {
		Gene gene = new Gene();
		System.out.println(gene._data);
	}
}

public class Exercise6 {

	public static void main(String[] args) {
		Human human = new Human();
	}

}
