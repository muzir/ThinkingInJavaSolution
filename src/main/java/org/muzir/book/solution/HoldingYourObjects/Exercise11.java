package org.muzir.book.solution.HoldingYourObjects;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Exercise11<T> {

	public void printCollection(Collection<Object> collection) {
		Iterator it = collection.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	public static void main(String[] args) {
		Collection c1 = Arrays.asList(new Gerbil(), new Mouse(), new Hamster());
		Collection c2 = new HashSet<>();
		c2.add(new Gerbil());
		c2.add(new Mouse());
		c2.add(new Hamster());
		Collection c3 = new LinkedList<>();
		c3.add(new Gerbil());
		c3.add(new Mouse());
		c3.add(new Hamster());
		Collection c4 = new TreeSet<>();
		c4.add(new Gerbil());
		c4.add(new Mouse());
		c4.add(new Hamster());
		Collection c5 = new LinkedHashSet<>();
		c5.add(new Gerbil());
		c5.add(new Mouse());
		c5.add(new Hamster());

		Exercise11 exercise11 = new Exercise11<Rodent>();
		exercise11.printCollection(c1);
		System.out.println("********************");
		exercise11.printCollection(c2);
		System.out.println("********************");
		exercise11.printCollection(c3);
		System.out.println("********************");
		exercise11.printCollection(c4);
		System.out.println("********************");
		exercise11.printCollection(c5);
		System.out.println("********************");

	}

}
