package com.player.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlConnection {
	
	private static Connection connection;
	
	private PostgreSqlConnection() {
		
	}
	
	public static Connection getConnection()  throws ClassNotFoundException, SQLException {
		//Step 1- Load/register the Driver
		Class.forName(DbUtilProps.DRIVER);
		
		// Step 2 - open connection(url, username, password)
		String url = DbUtilProps.URL;
		String username = System.getenv("postgresUserName");
		String password = System.getenv("postgresPassword");
		connection = DriverManager.getConnection(url, username, password);

		return connection;
	}
	
}
// Single TON Java Class
