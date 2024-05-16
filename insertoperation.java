package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "7892658610";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (empname, empid, location, email) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "suresh");
		    statement.setString(2, "suresh123");
		    statement.setString(3, "hyd");
		    statement.setString(4, "suresh@microsoft.com");
		    statement.setString(1, "sai");
		    statement.setString(2, "sai234");
		    statement.setString(3, "khammam");
		    statement.setString(4, "sai@microsoft.com");
		    statement.setString(1, "ram");
		    statement.setString(2, "ram03");
		    statement.setString(3, "RR");
		    statement.setString(4, "ram@microsoft.com");
		    
		    
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new employee was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
