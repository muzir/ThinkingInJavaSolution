package org.muzir.book.solution.Operators;

/**
 * @author muzir
 *
 */
public class Exercise14 {
	public static void main(String[] args) {
		String internedString = "test";
		String sameInternedString = "test";

		String stringObject = new String("test");
		String sameValueStringObject = new String("test");

		boolean[] booleanResultArray = stringEquals(internedString,
				sameInternedString);
		if (booleanResultArray.length != 2) {
			throw new RuntimeException(
					"Check your stringEquals method arguments and if condition");
		}
		System.out.println("Interned Strings == operator result: "
				+ booleanResultArray[0]);
		System.out.println("Interned String equals() method result: "
				+ booleanResultArray[1]);

		booleanResultArray = stringEquals(stringObject, sameValueStringObject);
		if (booleanResultArray.length != 2) {
			throw new RuntimeException(
					"Check your stringEquals method arguments and if condition");
		}
		System.out.println("String object == operator result: "
				+ booleanResultArray[0]);
		System.out.println("String object equals() method result: "
				+ booleanResultArray[1]);
		
	}

	private static boolean[] stringEquals(String... args) {
		boolean[] booleanResultArray = new boolean[2];
		System.out.println("First string:" + args[0]);
		System.out.println("Second string:" + args[1]);
		if (args[0] == args[1]) {
			booleanResultArray[0] = true;
		} else {
			booleanResultArray[0] = false;
		}
		if (args[0].equals(args[1])) {
			booleanResultArray[1] = true;
		} else {
			booleanResultArray[1] = false;
		}
		return booleanResultArray;
	}
}
