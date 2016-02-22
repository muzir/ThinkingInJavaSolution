package org.muzir.book.solution.HoldingYourObjects;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise2 {
	public static void main(String args[]) {
		Collection<Integer> c = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		c.forEach(i -> System.out.println(i));
	}
}
