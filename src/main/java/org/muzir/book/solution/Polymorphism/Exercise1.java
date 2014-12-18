package org.muzir.book.solution.Polymorphism;

enum ShapeType {
	SPHERE, ELLIPSIS, CONE;
}

class Shape {

	protected int shapeId = 0;

	public Shape(ShapeType type) {
		cycleType = type;
	}

	private ShapeType cycleType;

	public void ride() {
		System.out.println("Cycle type:" + cycleType.name() + " shapeId : "
				+ shapeId);
	}

	public int getShapeId() {
		return shapeId;
	}
}

class Sphere extends Shape {
	public Sphere() {
		super(ShapeType.SPHERE);
		shapeId = 1;
	}
}

class Ellipsis extends Shape {

	public Ellipsis() {
		super(ShapeType.ELLIPSIS);
		shapeId = 2;
	}
}

class Cone extends Shape {

	public Cone() {
		super(ShapeType.CONE);
		shapeId = 3;
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
