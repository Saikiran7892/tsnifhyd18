package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retriveoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "7892658610";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String empname = result.getString(2);
			    String empid = result.getString(3);
			    String location = result.getString("location");
			    String email = result.getString("email");
			 
			    String output = "employee #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, ++count, empname, empid, location, email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
