package org.muzir.book.solution.HoldingYourObjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise4 {

	public static void main(String args[]) {
		ArrayList arrayList = new ArrayList<String>();
		LinkedList linkedList = new LinkedList<String>();
		HashSet hashSet = new HashSet<String>();
		LinkedHashSet linkedHashSet = new LinkedHashSet<String>();
		TreeSet treeSet = new TreeSet<String>();
		CharacterGenerator generator = new CharacterGenerator();
		for (int i = 0; i < 10; i++) {
			String characterName = generator.next();
			arrayList.add(characterName);
			linkedList.add(characterName);
			hashSet.add(characterName);
			linkedHashSet.add(characterName);
			treeSet.add(characterName);
		}
		printCollection(arrayList);
		printCollection(linkedList);
		printCollection(hashSet);
		printCollection(linkedHashSet);
		printCollection(treeSet);
	}

	private static void printCollection(Collection<String> collection) {
		if (collection instanceof ArrayList) {
			System.out.println("*******Array List******");
		} else if (collection instanceof LinkedList) {
			System.out.println("*******Linked List******");
		} else if (collection instanceof HashSet) {
			System.out.println("*******Hash Set******");
		} else if (collection instanceof LinkedHashSet) {
			System.out.println("*******Linked Hash Set******");
		} else if (collection instanceof TreeSet) {
			System.out.println("*******Tree Set******");
		}
		for (String s : collection) {
			System.out.println(s);
		}
	}
}
