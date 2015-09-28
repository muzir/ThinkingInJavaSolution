package org.muzir.book.solution.ControlExecution;

/**
 * @author muzir
 *
 */
public class Exercise6 {
	public static void main(String[] args) {
		System.out.println(test(0, 12, 5, 9));
	}

	static int test(int begin, int end, int testval, int target) {
		if (!(testval >= begin && testval <= end)) {
			throw new RuntimeException("testval is not in range");
		}
		if (testval > target) {
			return +1;
		} else if (testval < target) {
			return -1;
		}
		return 0;
	}
}
