package com.alyse.controller.Day8;
//transaction management

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Number5 {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
		conn.setAutoCommit(false);
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			rs = cstm.executeQuery("select * from vehicles");
			cstm = setInt(1, 56);
			
			cstm = execute();
			
			conn.commit();

		} catch (SQLException e) {
			conn.rollback();
		}		
	}
}
