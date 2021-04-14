package com.ibm.sql;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class TestJdbcUtil {


		JdbcUtil jdu;
		
		@Test
		public void testConnection() throws SQLException {
			assertNotNull(jdu.getConnection());
		}

}
