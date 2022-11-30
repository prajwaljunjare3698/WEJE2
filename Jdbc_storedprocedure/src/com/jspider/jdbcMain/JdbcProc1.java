package com.jspider.jdbcMain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcProc1 {
	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static FileReader fileReader;
	private static Properties properties = new Properties();
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader("C:\\Users\\kisho\\eclipse-workspace\\Jdbc_storedprocedure\\resources\\df_info.properties");
			properties.load(fileReader);
		
			Class.forName(properties.getProperty("driverpath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			
			query = "call pro1()";
			//call_pro1() is save permanently in database
			//if procedure contains many select clause it will give output of
			//only one select (thats drawback)
			
//			preparedStatement = connection.prepareStatement(query);
//			resultSet = preparedStatement.executeQuery();
			
			callableStatement = connection.prepareCall(query);
			resultSet = callableStatement.executeQuery();
			
			//by callableStatement and preparedStatement both i can get result
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(callableStatement != null) {
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}		
	}
}
