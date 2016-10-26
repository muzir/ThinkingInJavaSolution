package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {

	public static void main(String[] args) {
		List<Integer> first = Arrays.asList(new Integer(0), new Integer(1), new Integer(2));
		ListIterator<Integer> firstLi = first.listIterator(first.size());
		List<Integer> second = new ArrayList<Integer>();
		while (firstLi.hasPrevious()) {
			second.add(firstLi.previous());
		}
		System.out.println(second.toString());
	}

}
