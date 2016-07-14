package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Exercise5 {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> naturalNumbers = new ArrayList<Integer>(7);
		for(int i=0;i<7;i++){
			naturalNumbers.add(new Integer(i));
		}
		System.out.println("1: " + naturalNumbers);
		Integer h = new Integer(1);
		naturalNumbers.add(h); // Automatically resizes
		System.out.println("2: " + naturalNumbers);
		System.out.println("3: " + naturalNumbers.contains(h));
		naturalNumbers.remove(h); // Remove by object
		Integer p = naturalNumbers.get(2);
		System.out.println("4: " + p + " " + naturalNumbers.indexOf(p));
		Integer cymric = new Integer(2);
		System.out.println("5: " + naturalNumbers.indexOf(cymric));
		System.out.println("6: " + naturalNumbers.remove(cymric));
		// Must be the exact object:
		System.out.println("7: " + naturalNumbers.remove(p));
		System.out.println("8: " + naturalNumbers);
		naturalNumbers.add(3, new Integer(3)); // Insert at an index
		System.out.println("9: " + naturalNumbers);
		List<Integer> sub = naturalNumbers.subList(1, 4);
		System.out.println("subList: " + sub);
		System.out.println("10: " + naturalNumbers.containsAll(sub));
		Collections.sort(sub); // In-place sort
		System.out.println("sorted subList: " + sub);
		// Order is not important in containsAll():
		System.out.println("11: " + naturalNumbers.containsAll(sub));
		Collections.shuffle(sub, rand); // Mix it up
		System.out.println("shuffled subList: " + sub);
		System.out.println("12: " + naturalNumbers.containsAll(sub));
		List<Integer> copy = new ArrayList<Integer>(naturalNumbers);
		sub = Arrays.asList(naturalNumbers.get(1), naturalNumbers.get(4));
		System.out.println("sub: " + sub);
		copy.retainAll(sub);
		System.out.println("13: " + copy);
		copy = new ArrayList<Integer>(naturalNumbers); // Get a fresh copy
		copy.remove(2); // Remove by index
		System.out.println("14: " + copy);
		copy.removeAll(sub); // Only removes exact objects
		System.out.println("15: " + copy);
		copy.set(1, new Integer(4)); // Replace an element
		System.out.println("16: " + copy);
		copy.addAll(2, sub); // Insert a list in the middle
		System.out.println("17: " + copy);
		System.out.println("18: " + naturalNumbers.isEmpty());
		naturalNumbers.clear(); // Remove all elements
		System.out.println("19: " + naturalNumbers);
		System.out.println("20: " + naturalNumbers.isEmpty());
		naturalNumbers.addAll(new ArrayList<Integer>(4));
		for(int i=0;i<4;i++){
			naturalNumbers.add(new Integer(i));
		}
		System.out.println("21: " + naturalNumbers);
		Object[] o = naturalNumbers.toArray();
		System.out.println("22: " + o[3]);
		Integer[] pa = naturalNumbers.toArray(new Integer[0]);
		System.out.println("23: " + pa[3]);
	}
}