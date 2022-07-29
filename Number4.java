package com.alyse.controller.Day8;
//result set metadata and database metadata

import java.sql.*;

public class Number4 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			
			DatabaseMetaData dData = conn.getMetaData();
			
			System.out.println(dData.getDatabaseProductName());
			System.out.println(dData.getDatabaseMajorVersion());
			System.out.println(dData.getDriverName());
			System.out.println(dData.getSchemas());
			
			pstm = conn.prepareStatement("select * form vehicles where id = 567");
			ResultSet rs = pstm.executeQuery();
			
			while(rs.next()) {
				ResultSetMetaData rsData = rs.getMetaData();
				System.out.println(rsData.getColumnCount());
				System.out.println(rsData.getColumnName(1) + " " + rsData.getColumnTypeName(1));
				System.out.println(rsData.getColumnName(2) + " " + rsData.getColumnTypeName(2));
			}

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
