package org.muzir.book.solution.HoldingYourObjects;

// : holding/ListFeatures.java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercise6 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<String> strings = new ArrayList<String>(7);
		for (int i = 0; i < 7; i++) {
			String s = new String(String.valueOf(i));
			strings.add(s);
		}
		System.out.println("1: " + strings);
		String h = new String("1");
		strings.add(h); // Automatically resizes
		System.out.println("2: " + strings);
		System.out.println("3: " + strings.contains(h));
		strings.remove(h); // Remove by object
		String p = strings.get(2);
		System.out.println("4: " + p + " " + strings.indexOf(p));
		String cymric = new String("2");
		System.out.println("5: " + strings.indexOf(cymric));
		System.out.println("6: " + strings.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + strings.remove(p));
		System.out.println("8: " + strings);
		strings.add(3, new String("3")); // Insert at an index
		System.out.println("9: " + strings);
		List<String> sub = strings.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + strings.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + strings.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + strings.containsAll(sub));
		List<String> copy = new ArrayList<String>(strings);
		sub = Arrays.asList(strings.get(1), strings.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<String>(strings); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new String("4")); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + strings.isEmpty());
		strings.clear(); // Remove all elements
		System.out.println("19: " + strings);
		System.out.println("20: " + strings.isEmpty());
		List<String> newStrings = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			String s = new String(String.valueOf(i));
			newStrings.add(s);
		}
		strings.addAll(newStrings);
		System.out.println("21: " + strings);
		Object[] o = strings.toArray();
		System.out.println("22: " + o[3]);
		String[] pa = strings.toArray(new String[0]);
		System.out.println("23: " + pa[3]);
	}
} /*
	 * Output: 1: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug] 2: [Rat, Manx, Cymric, Mutt, Pug, Cymric, Pug, Hamster] 3:
	 * true 4: Cymric 2 5: -1 6: false 7: true 8: [Rat, Manx, Mutt, Pug, Cymric, Pug] 9: [Rat, Manx, Mutt, Mouse, Pug,
	 * Cymric, Pug] subList: [Manx, Mutt, Mouse] 10: true sorted subList: [Manx, Mouse, Mutt] 11: true shuffled subList:
	 * [Mouse, Manx, Mutt] 12: true sub: [Mouse, Pug] 13: [Mouse, Pug] 14: [Rat, Mouse, Mutt, Pug, Cymric, Pug] 15:
	 * [Rat, Mutt, Cymric, Pug] 16: [Rat, Mouse, Cymric, Pug] 17: [Rat, Mouse, Mouse, Pug, Cymric, Pug] 18: false 19: []
	 * 20: true 21: [Manx, Cymric, Rat, EgyptianMau] 22: EgyptianMau 23: 14
	 */// :~
