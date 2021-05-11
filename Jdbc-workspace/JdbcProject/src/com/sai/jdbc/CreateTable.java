package com.sai.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// load the driver
		Class.forName("com.mysql.jdbc.Driver");
		// Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/saidb", "root", "");
		
		//create statement
		Statement stmt = con.createStatement();
		
		//execute the Queries
		String sql = "create table emp(id int, name varchar(20), address varchar(20))";
		stmt.executeUpdate(sql);
		
		//close the connection
		con.close();
		System.out.println("Table created successfully");
	}
}
