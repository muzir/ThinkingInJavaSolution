package org.muzir.book.solution.InitializationAndCleanup;

import java.util.Random;

/**
 * @author muzir
 *
 */
public class Exercise16 {

	public static void main(String[] args) {
		Random random = new Random();
		String[] array = new String[random.nextInt(20)];
		for (int i = 0; i < array.length; i++) {
			array[i] = "" + i;
		}
		for (String str : array) {
			System.out.println(str);
		}
	}

}
