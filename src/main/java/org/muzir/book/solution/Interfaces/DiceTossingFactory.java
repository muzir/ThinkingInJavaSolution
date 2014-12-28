package org.muzir.book.solution.Interfaces;

public class DiceTossingFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new DiceTossing();
	}

}
