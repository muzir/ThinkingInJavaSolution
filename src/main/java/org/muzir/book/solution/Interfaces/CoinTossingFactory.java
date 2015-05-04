package org.muzir.book.solution.Interfaces;

public class CoinTossingFactory implements GameFactory {

	public Game getGame() {
		return new CoinTossing();
	}

}
