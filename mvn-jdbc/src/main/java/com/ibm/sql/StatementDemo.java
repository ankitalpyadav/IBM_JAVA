package com.ibm.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	public static void main(String[] args) {
		String sql = "insert into emp values (4,'Sam',19000)";
		Connection conn = null;

		try {
			conn = JdbcConnection.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
