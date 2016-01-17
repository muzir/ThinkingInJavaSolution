package org.muzir.book.solution.InnerClasses;

interface Game {
	void play();
}

interface GameFactory {
	Game getGame();
}

class CoinTossing implements Game {
	private CoinTossing() {
	}

	public void play() {
		System.out.println("Coin Tossing");

	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new CoinTossing();
		}
	};
}

class DiceTossing implements Game {
	private DiceTossing() {
	}

	public void play() {
		System.out.println("Dice Tossing");

	}

	public static GameFactory factory = new GameFactory() {
		public Game getGame() {
			return new DiceTossing();
		}
	};
}

/**
 * @author erhun.baycelik
 *
 */
public class Exercise17 {
	public static void playGame(GameFactory gameFactory) {
		Game game = gameFactory.getGame();
		game.play();
	}

	public static void main(String[] args) {
		playGame(DiceTossing.factory);
		playGame(CoinTossing.factory);
	}
}
