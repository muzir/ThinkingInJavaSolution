package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class StaticInitialization {
	static String name = "name1";
	static String age;
	static {
		age = "1";
	}

	public static String show() {
		return "Name:" + name + " age:" + age;
	}
}

public class Exercise14 {

	public static void main(String[] args) {
		System.out.println(StaticInitialization.show());
	}

}
