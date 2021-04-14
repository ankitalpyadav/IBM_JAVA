
package com.ibm.sql;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class JdbcUtil {
	public static Connection getConnection() throws SQLException {
		Connection conn = null;
		Properties p = new Properties();
		try {
			p.load(new FileReader("src/main/resorces/database.info"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
					
		try {
			Class.forName(p.getProperty("driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection(p.getProperty("url"), p.getProperty("user"), 
												p.getProperty("pass"));
		return conn;
	}
}
