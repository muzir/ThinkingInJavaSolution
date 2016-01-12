package org.muzir.book.solution.InnerClasses;

/**
 * @author erhun.baycelik
 *
 */
public class Exercise7 {
	private String name;

	private void foo() {
		System.out.println("name:" + name);
	}

	private class Inner {
		public void changeOuterObject() {
			name = "NameChanged";
			foo();
		}
	}
	public void callback() {
		Inner inner = new Inner();
		inner.changeOuterObject();
		foo();
	}
	
	public static void main(String[]args){
		Exercise7 exercise7=new Exercise7();
		exercise7.foo();
		exercise7.callback();
	}
}
