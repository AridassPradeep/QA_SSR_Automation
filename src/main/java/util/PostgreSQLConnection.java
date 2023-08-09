package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLConnection {
	public static void main(String[] args) {

		String url = "jdbc:postgresql://34.93.219.164:5432/batua";

		String username = "postgres";
		String password = "";

		Connection connection = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected to the PostgreSQL database!");

		} catch (ClassNotFoundException e) {
			System.out.println("PostgreSQL JDBC driver not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection to the database failed!");
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
					System.out.println("Connection closed.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
