package com.alyse.controller.Day8;
//calling a procedure

import java.sql.*;
import com.alyse.myql.jdbc.Drive;

public class Number3 {

	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstm = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			rs = cstm.executeQuery("select * from vehicles");
			cstm = setInt(1, 56);
			
			cstm = execute();

		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
