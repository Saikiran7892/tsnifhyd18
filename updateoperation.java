package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class updateoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "7892658610";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET empid=?, location=?, email=? WHERE empname=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "123");
		    statement.setString(2, "khammam");
		    statement.setString(3, "bill.gates@microsoft.com");
		    statement.setString(4, "suresh");
		     
		    int rowsUpdated = statement.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing employee was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
