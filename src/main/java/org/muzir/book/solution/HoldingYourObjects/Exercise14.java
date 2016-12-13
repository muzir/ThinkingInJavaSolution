package org.muzir.book.solution.HoldingYourObjects;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercise14 {
	public static void main(String[] args) {
		List<Integer> integers = new LinkedList<Integer>();
		addMiddle(new Integer(1), integers);
		addMiddle(new Integer(2), integers);
		addMiddle(new Integer(3), integers);
		addMiddle(new Integer(4), integers);
	}

	static void addMiddle(Integer i, List<Integer> integers) {
		ListIterator<Integer> listIterator = integers.listIterator(integers.size() / 2);
		listIterator.add(i);
		System.out.println("***************");
		integers.forEach(j -> System.out.println(j));
		System.out.println("***************");
	}
}
