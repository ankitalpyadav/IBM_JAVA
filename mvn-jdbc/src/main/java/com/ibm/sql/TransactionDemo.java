package com.ibm.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		Connection conn = null;
		
		String sql1 = "insert into emp values (7, 'Ankita', 90000)";
		String sql2 = "update emp set salary=30000 where emp_id=123";
		String sql3 = "delete from emp where emp_id=3";
		
		try {
			conn = JdbcConnection.getConnection();
			conn.setAutoCommit(false);
			
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction complete");
		} catch (SQLException e) {
			System.out.println("Transaction failed!!");
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
