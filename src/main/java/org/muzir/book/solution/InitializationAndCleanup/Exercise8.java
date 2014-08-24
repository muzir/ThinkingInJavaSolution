package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class SampleObject {
	public void firstMethod() {
		secondMethod();
		this.secondMethod();
		System.out.println("First Method calling");
	}

	public void secondMethod() {
		System.out.println("Second method calling");
	}
}

public class Exercise8 {

	public static void main(String[] args) {
		SampleObject sampleObject = new SampleObject();
		sampleObject.firstMethod();
	}

}
