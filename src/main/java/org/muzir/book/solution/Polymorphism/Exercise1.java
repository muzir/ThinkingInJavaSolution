package org.muzir.book.solution.Polymorphism;

enum ShapeType {
	SPHERE, ELLIPSIS, CONE;
}

class Shape {
	public Shape(ShapeType type) {
		cycleType = type;
	}

	private ShapeType cycleType;

	public void ride() {
		System.out.println("Cycle type:" + cycleType.name());
	}
}

class Sphere extends Shape {
	public Sphere() {
		super(ShapeType.SPHERE);
	}
}

class Ellipsis extends Shape {

	public Ellipsis() {
		super(ShapeType.ELLIPSIS);
	}
}

class Cone extends Shape {

	public Cone() {
		super(ShapeType.CONE);
	}

}

public class Exercise1 {
	public static void main(String[] args) {
		Sphere sphere = new Sphere();
		Cone cone = new Cone();
		Ellipsis ellipsis = new Ellipsis();
		sphere.ride();
		cone.ride();
		ellipsis.ride();
	}

}
