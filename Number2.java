package com.alyse.controller.Day8;
//jdbc prepared statement insert, select, update

import java.sql.*;
import com.alyse.myql.jdbc.Drive;

public class Number2 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Driver d = new com.alyse.myql.jdbc.Driver();
			DriverManager.registerDriver(d);
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			
			//insert
			pstm = conn.prepareStatement("insert into training.vehicles values (?, ?)");
			
			pstm.setInt(1, 24);
			pstm.setString(3, "type4");
			
			System.out.println(pstm.executeUpdate());
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("type"));
			}
			
			//update
			int count = pstm.executeUpdate("Update vehicle type = 'type3' where id = 2;");
			System.out.println(count);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
