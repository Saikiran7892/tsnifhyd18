package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "7892658610";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE empname=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "suresh");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A employee was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
