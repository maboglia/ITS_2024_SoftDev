package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3307/java";
	private final String USER = "ITS_2024";
	private final String PASS = "bogliaccino";
	
	private Connection conn;

	public Connection getConn() {
		if (conn == null) connetti();
		return conn;
	}
	
	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("CONNESSO");
		} catch (SQLException e) {
			System.err.println("ERRORE: " + e.getMessage());
		}
	}


}
