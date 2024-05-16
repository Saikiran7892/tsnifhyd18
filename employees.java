package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "7892658610";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}

	}

}
