package org.muzir.book.solution.AccessControl.Connections;

class Connection {
	private String url;
	private String path;
	private String cluster;

	private Connection(ConnectionType type) {
		switch (type) {
		case PATH:
			path = "/usr/local/share/jdbc.properties";
			break;
		case URL:
			url = "https:\\github.muzir.com";
			break;
		case CLUSTER:
			cluster = "10.127.60.61,10.127.60.62";
		default:
			break;
		}
	}

	static Connection getConnection(ConnectionType type) {
		return new Connection(type);
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", path=" + path + ", cluster="
				+ cluster + "]";
	}

}

public class ConnectionManager {
	private static Connection[] connectionPool = new Connection[3];
	private static Connection currentConnection;

	static {
		int i = 0;
		for (ConnectionType type : ConnectionType.values()) {
			connectionPool[i] = Connection.getConnection(type);
			i = i + 1;
		}
	}

	public static Connection getConnection(ConnectionType type) {
		currentConnection = connectionPool[type.ordinal()];
		return currentConnection;
	}

	@Override
	public String toString() {
		return "ConnectionManager [toString()=" + currentConnection.toString()
				+ "]";
	}

}
