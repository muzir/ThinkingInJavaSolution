package org.muzir.book.solution.AccessControl;

import org.muzir.book.solution.AccessControl.Connections.ConnectionManager;
import org.muzir.book.solution.AccessControl.Connections.ConnectionType;

public class Exercise8 {
	public static void main(String[] args) {
		System.out.println(ConnectionManager
				.getConnection(ConnectionType.CLUSTER));
		System.out.println(ConnectionManager.getConnection(ConnectionType.URL));
		System.out
				.println(ConnectionManager.getConnection(ConnectionType.PATH));
	}
}
