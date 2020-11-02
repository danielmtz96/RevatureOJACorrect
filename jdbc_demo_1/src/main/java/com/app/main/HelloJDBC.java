package com.app.main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// connecting Java to a database using Maven drivers

public class HelloJDBC {
	public static void main(String[] args) {
		System.out.println("Hello Maven!");
		
	    Connection connection = null;  // want to use this in try, finally blocks
	    
		try {
			//Step 1- Load/register the Driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded successfully");
			
			// Step 2 - open connection(url, username, password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "usernamehere";
			String password = "passwordhere";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection successful.");
			
			// Step 3 - create Statement
			Statement statement = connection.createStatement();
			String sql = "select id, name, age, gender, teamName, contact from roc_revature.player";
			System.out.println("Statement created");
			
			// Step 4 - Execute Query
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("Query executed successfully");
			
			// Step 5 - Process results
			while(rs.next()) {
				System.out.print("Id = " + rs.getInt("id"));
				System.out.print(" Name = " + rs.getString("name"));
				System.out.print(" Gender = " + rs.getString("gender"));
				System.out.print(" Team name = " + rs.getString("teamname"));
				System.out.println(" Contact: " + rs.getLong("contact"));
			}
			System.out.println("Results processed.");
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);

		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			//step 6 - close connection
			try {
				connection.close();	
				System.out.println("Connection closed.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		 
	}
}
