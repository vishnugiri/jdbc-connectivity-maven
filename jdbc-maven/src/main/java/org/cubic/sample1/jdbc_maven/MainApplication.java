package org.cubic.sample1.jdbc_maven;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.cubic.helper.DBConnectivity;



public class MainApplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DBConnectivity.createConnection();
	/*	String create = "create table Customers(Id int primary key auto_increment, "
				+ "CustomerName varchar(70), Phone bigint)";
		
		
		String createOrder = "create table Orders(orderId int, "
				+ "OrderNumber int, CustomerID int, Foreign Key (CustomerID) References Customers(ID))";
				
		
		
		
		String insertCustomers = "insert into Customers(CustomerName,phone) "
				+ "values('Vishnu',2403905961),('Kanchan',2403905968),"
				+ "('Abinash',2408579684)";
		
		String insertOrder = "insert into Orders values(1,111,2),(2,123,2),"
				+ "(3,101,1),(4,100,2)";
		
		//String LeftJoin = "Select * from Orders Left Join Customers on Orders.CustomerID=Customers.ID";
		
		String Update = "Update Customers set phone=2408994050 where ID=2";
		*/
		Statement st = null;
		
		
			 st = c.createStatement();
		/*	st.execute(create);
			st.execute(createOrder);
			st.execute(insertCustomers);
			st.execute(insertOrder);
			st.executeUpdate(Update);
			*/
					
			/*	//SELECT STATEMENT
		String select = "Select * from Customers";
		
			ResultSet rs = st.executeQuery(select);
			while(rs.next()) {
				int id = rs.getInt("ID");
				String CName = rs.getString("CustomerName");
				long ph = rs.getLong("phone");
				System.out.println("ID:" + id);
				System.out.println("CustomerName" + CName);
				System.out.println("phone number" + ph);
		
		
		*/
		String join="Select Orders.OrderNumber, Customers.CustomerName From Orders Right Join Customers on Orders.CustomerID=Customers.ID";
		ResultSet r;
			r = st.executeQuery(join);
			while(r.next()) {
				int num = r.getInt("OrderNumber");
				String Name = r.getString("CustomerName");
				System.out.println("OrderNumber"+" "+ num);
				System.out.println("CustomerName"+" "+ Name);
			}
		c.close();		
	}

}
