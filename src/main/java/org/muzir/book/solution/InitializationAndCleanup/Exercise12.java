package org.muzir.book.solution.InitializationAndCleanup;

class Tank {
	boolean _empty;

	public Tank() {
		_empty = false;
	}

	public Tank(boolean empty) {
		_empty = empty;
	}

	public boolean isEmpty() {
		return _empty;
	}

	public void setEmpty(boolean empty) {
		this._empty = empty;
	}

	@Override
	protected void finalize() {
		if (_empty) {
			System.err.println("Tank is not empty");
		}
	}

}

public class Exercise12 {
	public static void main(String[] args) {
		new Tank(true);
		System.gc();
	}
}
