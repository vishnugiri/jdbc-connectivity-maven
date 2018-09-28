package org.cubic.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.cubic.helpers.DatabaseConnection;

public class MainApplication {

	public static void main(String[] args) {
		Connection c=DatabaseConnection.createConnection();

		//insert a record into table
		String s= "insert into department values(6,'HR')";
		try {
			
			Statement st=c.createStatement();
			st.executeUpdate(s);
			c.close();
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
//	finally {
//			try {
//			c.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
		
	}


