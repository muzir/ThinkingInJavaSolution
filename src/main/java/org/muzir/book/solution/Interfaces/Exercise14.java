package org.muzir.book.solution.Interfaces;

class CarX extends Car implements XBrand {

	public void run() {

	}

	public void initialize() {

	}

	public void start() {

	}

	public void stop() {

	}

	public void horsePower() {

	}

	public void speed() {

	}

	public void brand() {

	}

}

public class Exercise14 {

	public static void isRunnable(Runnable r) {
		System.out.println("Is runnable : " + r.getClass());
	}

	public static void isEngine(Engine e) {

		System.out.println("Is engine : " + e.getClass());
	}

	public static void isXEngine(XEngine xEngine) {
		System.out.println("Is XEngine : " + xEngine.getClass());
	}

	public static void isXBrand(XBrand xBrand) {
		System.out.println("Is XBrand:" + xBrand.getClass());
	}

	public static void main(String[] args) {
		CarX carX = new CarX();
		isRunnable(carX);
		isEngine(carX);
		isXEngine(carX);
		isXBrand(carX);
	}
}
