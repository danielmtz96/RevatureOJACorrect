package com.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloJBDC {
	
	Connection connection = null;
	try { 	// Step 1 - load/register the driver
		Class.forName("org.postgresql.Driver");
		System.out.println("Driver Loaded successfully!");
		String url = "jdbc:postgresql://localhost:5432/roc_revature"; // from edit driver
		String username = "postgres";
		String password = "postgres";
		// step2 - open Connection(url, username, password)
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful");
		
		//step 3 - create statement
		Statement statement = connection.createStatement();
		String sql = "select id, name, gender, teamName, contact_from_roc_revature.player";   // never use *, queries should be readable
		// possible issues: query typos
		System.out.println("Statement created: " + sql);
		
		
		// step 4 - execute query
		ResultSet rs = statement.executeQuery(sql);
		System.out.println("Query Executed Successfully");
		
		// step 5 - process results
		while(rs.next()) { // is there a next record?
			// point to first record
			// can use indices or column names
			System.out.print("Id = " + rs.getInt("id"));
			System.out.print("Name = " + rs.getString("name"));
			System.out.print("Gender = " + rs.getString("gender"));
			System.out.print("Team = " + rs.getString("teamName"));
			System.out.println("Contact = " + rs.getLong("contact"));
			// JDBC for 6 steps
		}
		System.out.println("Results processed");
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	} catch (SQLException e) {
		System.out.println(e);
	} finally {
		//Step 6: close connection (last step)
		try {
			connection.close();
			System.out.println("Connection closed");
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
}

