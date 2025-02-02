package projectatm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {

	public static void register() {
		//String url = "jdbc:sqlite:users.db";
		String url = "jdbc:mysql://localhost:3306/mydatabase";  

		String sql = "CREATE TABLE IF NOT EXISTS users (\n" + "	id integer PRIMARY KEY,\n" + "	name text NOT NULL,\n"
				+ " cash text NOT NULL,\n" + "email text NOT NULL,\n" + "creditcard text NOT NULL,\n"
				+ "cnic text NOT NULL,\n" + "number text NOT NULL \n" + ");";

		try (Connection conn = DBConnection.connection(); Statement stmt = conn.createStatement()) {
			stmt.execute(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
