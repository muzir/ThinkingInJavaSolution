package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Rodent {
	protected void nibble() {
		isWho();
	}

	protected void isWho() {
		System.out.println("Rodents nibble");
	}

	@Override
	public String toString() {
		return "Rodent [toString()=" + super.toString() + "]";
	}

}

class Mouse extends Rodent implements Comparable{
	@Override
	protected void isWho() {
		System.out.println("Mouse nibble");
	}

	@Override
	public String toString() {
		return "Mouse [toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Gerbil extends Rodent implements Comparable {
	@Override
	protected void isWho() {
		System.out.println("Gerbil nibble");
	}

	@Override
	public String toString() {
		return "Gerbil [toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Hamster extends Rodent implements Comparable{
	@Override
	protected void isWho() {
		System.out.println("Hamster nibble");
	}

	@Override
	public String toString() {
		return "Hamster []";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class Exercise10 {
	public static void main(String[] args) {
		List<Rodent> rodents = Arrays.asList(new Mouse(), new Gerbil(), new Hamster());
		Iterator<Rodent> iterator = rodents.iterator();
		while (iterator.hasNext()) {
			iterator.next().nibble();
		}
	}

}
