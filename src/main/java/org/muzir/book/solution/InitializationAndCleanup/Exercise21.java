package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
enum Currency {
	USD, EUR, GBP, INR, AUD, CAD;
}

public class Exercise21 {

	public static void main(String[] args) {
		for (Currency c : Currency.values()) {
			System.out.println("Currency value:" + c + " Ordinal:"
					+ c.ordinal());
			printCurrencyCountry(c);
		}

	}

	private static void printCurrencyCountry(Currency c) {
		switch (c) {
		case USD:
			System.out.println("United States Of America");
			break;
		case EUR:
			System.out.println("Euro");
			break;
		case GBP:
			System.out.println("England");
			break;
		case INR:
			System.out.println("India");
			break;
		case AUD:
			System.out.println("Australia");
			break;
		case CAD:
			System.out.println("Canada");
			break;

		}
	}

}
