package org.muzir.book.solution.InnerClasses;

class OuterClass {
	@SuppressWarnings("unused")
	private class MatrushkaOuter {
		private class MatrushkaInner {
		}
	}
}

class NestedOuterClass {
	@SuppressWarnings("unused")
	private static class MatrushkaNestedOuter {
		private static class MatrushkaNestedInner {
		}
	}
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise19 {
	public static void main(String... strings) {
		System.out.println("Hello Matrushka");
	}
}
