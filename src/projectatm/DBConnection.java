package projectatm;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection connection() {
		Connection c = null;

		try {
//			Class.forName("org.sqlite.JDBC");
//			c = (Connection) DriverManager.getConnection("jdbc:sqlite:users.db");
			
			 // Load MySQL JDBC driver
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to MySQL database
            // Modify the URL, username, and password as per your database configuration
            String url = "jdbc:mysql://localhost:3306/mydatabase";  // JDBC URL format for MySQL
            String username = "root";  // Replace with your MySQL username
            String password = "root";  // Replace with your MySQL password

            c = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println(e);
		}
		return c;
	}
}