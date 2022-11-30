package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class SongTable {

	public static void songTable() {
		try {
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));
			
			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			
			String query = "select * from musicplayer";
			
			RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);
			System.out.println("*id  *Name      *singer    *length");
			
			int value=0;
			while(RequriedResources.resultSet.next()) {
				System.out.println(RequriedResources.resultSet.getInt(1)+"    "+RequriedResources.resultSet.getString(2)+"    "+RequriedResources.resultSet.getString(3)+"    "+RequriedResources.resultSet.getString(4));
				value++;
			}
			if(value==0) {
				System.out.println("table is empty insert songs");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
