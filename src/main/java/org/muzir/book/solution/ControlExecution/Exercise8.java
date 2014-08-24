package org.muzir.book.solution.ControlExecution;

/**
 * @author muzir
 *
 */
public class Exercise8 {

	public static void main(String[] args) {
		String helloWorld = "Hello World!";
		char[] helloWorldArray = helloWorld.toCharArray();
		for (char c : helloWorldArray) {
			switch (c) {
			case 'H':
				System.out.println("Character H");
				break;
			case 'e':
				System.out.println("Character e");
				break;
			case 'l':
				System.out.println("Character l");
				break;
			case 'o':
				System.out.println("Character o");
				break;
			case 'W':
				System.out.println("Character W");
				break;
			case 'r':
				System.out.println("Character r");
				break;
			case 'd':
				System.out.println("Character d");
				break;
			case '!':
				System.out.println("Character !");
				// break;
			default:
				System.out.println("Empty char");
			}
		}
	}
}
