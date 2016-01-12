package org.muzir.book.solution.InnerClasses;

import java.math.BigDecimal;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise8 {
	private interface Window {
		void isCheap();
	}

	private Window firatPen = new Window() {
		private BigDecimal price = new BigDecimal(150);

		public void isCheap() {
			if (price.compareTo(new BigDecimal(300)) < 0) {
				System.out.println("Window is cheap");
			} else {
				System.out.println("Window is not cheap");
			}
		}
	};

	public static void main(String... args) {
		Exercise8 exercise8 = new Exercise8();
		exercise8.firatPen.isCheap();
	}
}
