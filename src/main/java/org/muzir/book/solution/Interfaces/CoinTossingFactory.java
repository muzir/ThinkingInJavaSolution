package org.muzir.book.solution.Interfaces;

public class CoinTossingFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new CoinTossing();
	}

}
