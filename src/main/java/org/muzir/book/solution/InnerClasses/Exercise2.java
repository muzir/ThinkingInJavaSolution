package org.muzir.book.solution.InnerClasses;

/**
 * @author muzir
 *
 */
class CellPhone {
	String brand = "HTC";

	@Override
	public String toString() {
		return "CellPhone [brand=" + brand + "]";
	}

}

/**
 * @author muzir
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			CellPhone cellPhone = new CellPhone();
			sequence.add(cellPhone);
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.println(selector.current().toString());
			selector.next();
		}
	}
}
