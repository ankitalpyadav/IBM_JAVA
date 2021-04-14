package com.ibm.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultDemo {
	public static void main(String[] args) {
		Connection conn = null;
		String sql = "select * from emp";
		
		try {
			conn = JdbcConnection.getConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			
			ResultSetMetaData meta = rs.getMetaData();
			for(int c=1; c<=meta.getColumnCount(); c++)
				System.out.print(meta.getColumnName(c) + "\t");
			System.out.println();
			
			while(rs.next()) 
				System.out.printf("%5d\t%-5s\t%5s\n",rs.getInt(1),rs.getString("ename"),rs.getString(3));
			
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
