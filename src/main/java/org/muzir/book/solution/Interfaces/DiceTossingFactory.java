package org.muzir.book.solution.Interfaces;

public class DiceTossingFactory implements GameFactory {

	public Game getGame() {
		return new DiceTossing();
	}

}
