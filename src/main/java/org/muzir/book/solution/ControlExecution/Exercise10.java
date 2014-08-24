package org.muzir.book.solution.ControlExecution;

import java.util.ArrayList;
import java.util.List;

/**
 * Vampire numbers
 * 
 * @author muzir
 *
 */
class VampireNumbers {
	public VampireNumbers() {
		vampireNumbers = new ArrayList<Integer>();
		multipliers = new ArrayList<String>();
		param = 0;
	}

	public void findVampireNumbers() {
		checkEachFourDigitNumber();
		multiplyNumbers();
	}

	private void multiplyNumbers() {
		label1: for (int i = 0; i < multipliers.size() - 1; i++) {
			String firstMultiplier = multipliers.get(i);
			for (int j = i + 1; j < multipliers.size(); j++) {
				String secondMultiplier = multipliers.get(j);
				 if (!checkEachDigitDiffer(firstMultiplier, secondMultiplier))
				 {
				int result = Integer.parseInt(firstMultiplier)
						* Integer.parseInt(secondMultiplier);
				if (result == param) {
					vampireNumbers.add(result);
					System.out.println("M1 : " + firstMultiplier + " M2 : "
							+ secondMultiplier + "=" + result);
					break label1;
				}
				}
			}
		}
	}

	private boolean checkEachDigitDiffer(String firstMultiplier,
			String secondMultiplier) {
		String firstCharOfFirstMultiplier = firstMultiplier.substring(0, 1);
		String secondCharOfFirstMultiplier = firstMultiplier.substring(1);
		String firstCharOfSecondMultiplier = secondMultiplier.substring(0, 1);
		String secondCharOfSecondMultiplier = secondMultiplier.substring(1);

		if (firstCharOfFirstMultiplier.equals(secondCharOfFirstMultiplier)
				|| secondMultiplier.contains(firstCharOfFirstMultiplier)
				|| firstCharOfSecondMultiplier
						.equals(secondCharOfSecondMultiplier)
				|| secondMultiplier.contains(secondCharOfFirstMultiplier)) {
			return true;
		}
		return false;
	}

	private void cleanVampireClassFields() {
		param = 0;
		multipliers = new ArrayList<String>();

	}

	private void checkEachFourDigitNumber() {
		for (int i = 1000; i < 10000; i++) {
			findMultiplier(i);
		}
	}

	private void findMultiplier(Integer _param) {
		param = _param;
		String input = _param.toString();
		char[] inputChars = input.toCharArray();
		for (int i = 0; i < inputChars.length - 1; i++) {
			char c = inputChars[i];
			for (int j = i + 1; j < inputChars.length; j++) {
				char c2 = inputChars[j];
				String noZero = "";
				String oneZero = "";
				if (c != '0' && c2 != '0') {
					noZero = noZero + c;
					noZero = noZero + c2;
					multipliers.add(noZero);
					noZero = "";
					noZero = noZero + c2;
					noZero = noZero + c;
					multipliers.add(noZero);
				} else if (c == '0' && c2 != '0') {
					oneZero = oneZero + c2;
					oneZero = oneZero + c;
					multipliers.add(oneZero);
				} else if (c != '0' && c2 == '0') {
					oneZero = "";
					oneZero = oneZero + c;
					oneZero = oneZero + c2;
					multipliers.add(oneZero);
				} else {
					continue;
				}
			}
		}
		multiplyNumbers();
		cleanVampireClassFields();
	}

	@Override
	public String toString() {
		String toString = "";
		for (Integer i : vampireNumbers) {
			toString = toString + i + ",";
		}
		return toString;
	}

	public int size() {
		return vampireNumbers.size();
	}

	private int param;
	private List<String> multipliers;
	private List<Integer> vampireNumbers;

}

public class Exercise10 {

	public static void main(String[] args) {
		VampireNumbers vampireNumbers = new VampireNumbers();
		vampireNumbers.findVampireNumbers();
		System.out.println(vampireNumbers.toString());
		System.out.println(vampireNumbers.size());
	}

}
