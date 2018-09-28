package org.cubic.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {

public static Connection createConnection()
{
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver"); //driver class
	}
	catch(ClassNotFoundException ce) {
		System.out.println("cannot found the driver");
	}
	try {
		 conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bank_database", 
				"root", "root"); //establishing connection 
System.out.println("GHello");
	} catch (SQLException sqe) {
		System.out.println("could not create connection");
	}
	return conn;
}


}
