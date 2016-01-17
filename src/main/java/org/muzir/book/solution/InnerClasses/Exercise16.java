package org.muzir.book.solution.InnerClasses;

import org.muzir.book.solution.Interfaces.Cycle;

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	private Unicycle() {
	}

	public void draw() {
		System.out.println("Unicycle");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle();
		}
	};
}

class Bicycle implements Cycle {
	private Bicycle() {
	}

	public void draw() {
		System.out.println("Bicycle");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle();
		}
	};

}

class TriCycle implements Cycle {
	private TriCycle() {
	}

	public void draw() {
		System.out.println("TriCycle");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new TriCycle();
		}
	};
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise16 {
	public static void drawCycle(CycleFactory cycleFactory) {
		Cycle cycle = cycleFactory.getCycle();
		cycle.draw();
	}

	public static void main(String[] args) {
		drawCycle(Unicycle.factory);
		drawCycle(Bicycle.factory);
		drawCycle(TriCycle.factory);
	}
}
