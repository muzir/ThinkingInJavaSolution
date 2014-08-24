package org.muzir.book.solution.InitializationAndCleanup;

/**
 * @author muzir
 *
 */
class Instance {
	String field;

	public Instance() {
		field = "test";
		System.out.println("Set instance test field");
	}

	@Override
	public String toString() {
		return "Instance [field=" + field + "]";
	}
}

class InstanceInitialization {
	Instance instance;
	{
		instance = new Instance();
	}

	@Override
	public String toString() {
		return "InstanceInitialization [instance=" + instance + "]";
	}

}

public class Exercise15 {

	public static void main(String[] args) {
		InstanceInitialization instanceInitialization = new InstanceInitialization();
		System.out.println(instanceInitialization.toString());
	}

}
