package com.jspider.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetriveData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=tiger");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
			System.out.println("data fetched successfully...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
