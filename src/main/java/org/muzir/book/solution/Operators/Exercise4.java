package org.muzir.book.solution.Operators;

import java.security.SecureRandom;
//: operators/Exercise4.java
/**
 @author muzir
 Write a program that calculates velocity using a constant distance and a constant time
 */
import java.util.Random;

public class Exercise4 {
	private static float distance;
	private static float time;

	public static void main(String[] args) {
		Random random = new SecureRandom();
		distance = random.nextFloat() + 10.00f;
		time = random.nextFloat() + 10.00f;
		System.out.println("Distance:" + distance);
		System.out.println("Time:" + time);
		float velocity = distance / time;
		System.out.println("Velocity:" + velocity);
	}
}
