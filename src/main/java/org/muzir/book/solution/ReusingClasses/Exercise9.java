package org.muzir.book.solution.ReusingClasses;

public class Exercise9 {

	public static void main(String[] args) {
		Stem stem = new Stem(10);
		stem.dispose();
	}

}

class Root {
	public Root(int i) {
		System.out.println("Default Root Constructor:" + i);
	}

	public void dispose() {
		System.out.println("Root dispose");
	}

	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
}

class Component1 {
	public Component1(int i) {
		System.out.println("Default Component1 Constructor:" + i);
	}

	public void dispose() {
		System.out.println("Component1 dispose");
	}
}

class Component2 {
	public Component2(int i) {
		System.out.println("Default Component2 Constructor" + i);
	}

	public void dispose() {
		System.out.println("Component2 dispose");
	}
}

class Component3 {
	public Component3(int i) {
		System.out.println("Default Component3 Constructor" + i);
	}

	public void dispose() {
		System.out.println("Component3 dispose");
	}
}

class Stem extends Root {
	public Stem(int i) {
		super(i);
		System.out.println("Default Stem Constructor:" + i);
	}

	public void dispose() {
		super.dispose();
		System.out.println("Stem dispose");
	}

	Component1 component1 = new Component1(1);
	Component2 component2 = new Component2(2);
	Component3 component3 = new Component3(3);
}