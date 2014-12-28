package org.muzir.book.solution.Interfaces;

public class Exercise19 {
	static CoinTossingFactory coinTossingFactory = new CoinTossingFactory();
	static DiceTossingFactory diceTossingFactory = new DiceTossingFactory();

	public static void main(String[] args) {
		Game coinGame = coinTossingFactory.getGame();
		Game diceGame = diceTossingFactory.getGame();
		coinGame.play();
		diceGame.play();
	}
}
