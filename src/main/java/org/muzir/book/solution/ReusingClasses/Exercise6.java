package org.muzir.book.solution.ReusingClasses;

public class Exercise6 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Chess chess = new Chess();

	}

}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}

class Chess extends BoardGame {
	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
} /*
 * Output: Game constructor BoardGame constructor Chess constructor
 */// :~
