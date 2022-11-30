package com.jspider.standard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			statement = connection.createStatement();
			resultset = statement.executeQuery("select * from student");
			
			int row = 0;
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
				row++;
			}
			System.out.println("\n"+"\t"+row+" record fetched successfully");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
