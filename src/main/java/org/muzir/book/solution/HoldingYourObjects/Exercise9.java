// : innerclasses/Sequence.java
// Holds a sequence of Objects.
package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author muzir
 *
 */
class Exercise9 {
	private List<Object> items;

	public Exercise9(int size) {
		items = new ArrayList<Object>(size);
	}

	public void add(Object x) {
		items.add(x);
	}

	private class Sequence {
		private int i = 0;

		public boolean end() {
			return i == items.size();
		}

		public Object current() {
			return items.get(i);
		}

		public void next() {
			Iterator<Object> iterator = items.iterator();
			if (iterator.hasNext())
				i++;
		}
	}

	public static void main(String[] args) {
		Exercise9 exercise9 = new Exercise9(10);
		for (int i = 0; i < 10; i++) {
			exercise9.add(Integer.toString(i));
		}
		Sequence sequence = exercise9.new Sequence();
		while (!sequence.end()) {
			System.out.print(sequence.current() + " ");
			sequence.next();
		}
	}
} /*
	 * Output: 0 1 2 3 4 5 6 7 8 9
	 */// :~
