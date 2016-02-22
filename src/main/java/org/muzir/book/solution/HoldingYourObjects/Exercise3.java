package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author erhun.baycelik
 *
 */
interface Selector {
	boolean end();

	Object current();

	void next();
}

/**
 * @author erhun.baycelik
 *
 */
class Sequence {
	@SuppressWarnings("rawtypes")
	private List items;

	public Sequence(int size) {
		items = new ArrayList<>();
	}

	@SuppressWarnings("unchecked")
	public void add(Object x) {
		items.add(x);
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		@SuppressWarnings("unused")
		public Sequence getSequence() {
			return Sequence.this;
		}

		public boolean end() {
			return i == items.size();
		}

		public Object current() {
			return items.get(i);
		}

		public void next() {
			if (i < items.size())
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}
}

public class Exercise3 {
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
