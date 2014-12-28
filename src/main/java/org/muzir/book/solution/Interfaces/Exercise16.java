package org.muzir.book.solution.Interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CharSequence implements Readable {
	private Random random = new Random();
	private int count;

	public CharSequence() {

	}

	public CharSequence(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}
		char result = (char) (random.nextInt(93) + 33);
		cb.append(result);
		return 1;
	}
}

public class Exercise16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(new CharSequence(60));
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		s.close();
	}

}
