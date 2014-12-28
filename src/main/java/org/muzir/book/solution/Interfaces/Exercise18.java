package org.muzir.book.solution.Interfaces;

public class Exercise18 {
	public static void main(String[] args) {
		UnicycleFactory unicycleFactory = new UnicycleFactory();
		BicycleFactory bicycleFactory = new BicycleFactory();
		TriCycleFactory triCycleFactory = new TriCycleFactory();
		Cycle uniCycle = unicycleFactory.getUniCycle();
		Cycle biCycle = bicycleFactory.getBicycle();
		Cycle triCycle = triCycleFactory.getTricycle();

		uniCycle.draw();
		biCycle.draw();
		triCycle.draw();
	}
}
