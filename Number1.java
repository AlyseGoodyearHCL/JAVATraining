package com.alyse.controller.Day8;
//jdbc statement insert, select, update

import java.sql.*;
import com.alyse.myql.jdbc.Drive;

public class Number1 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		try {
			Driver d = new com.alyse.myql.jdbc.Driver();
			DriverManager.registerDriver(d);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			//insert
			stm = conn.createStatement();
			
			//select
			rs = stm.executeQuery("select * from vehicles");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("type"));
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			//update
			int count = stm.executeUpdate("Update vehicle type = 'type3' where id = 2;");
			System.out.println(count);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			rs.close();
			stm.close();
			conn.close();
		}
	}
}
