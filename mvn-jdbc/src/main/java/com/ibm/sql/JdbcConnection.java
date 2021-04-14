package com.ibm.sql;

import java.sql.DatabaseMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcConnection {
	
	private JdbcConnection() {
		
	}
	
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/test";
		Connection conn = null;
		
		Driver driver = new Driver(); //Instantiating driver object
		DriverManager.registerDriver(driver); 	//Registering driver with driver manager
		
		conn = DriverManager.getConnection(url, "root", "pass@word1");
		return conn;
		
	}
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		Connection conn = null;
		
		try {
			Driver driver = new Driver(); //Instantiating driver object
			DriverManager.registerDriver(driver); 	//Registering driver with driver manager
			
			//Requesting connection from driver manager
			conn = DriverManager.getConnection(url, "root", "pass@word1");
			
			System.out.println("Connected Succefully");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDatabaseProductVersion());
			System.out.println(meta.getDriverName());
			System.out.println(meta.getDriverVersion());
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
