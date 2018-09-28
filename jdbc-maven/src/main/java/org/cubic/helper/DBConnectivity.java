package org.cubic.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectivity {

public static Connection createConnection() {
	Connection conn=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");//driver class
	} catch (ClassNotFoundException ce) {
		// TODO Auto-generated catch block
		System.out.println("Class not found");
	}
	
	try {
		conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank_database", 
				"root", "root"); // creating connection with database
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
			
	
}

}
