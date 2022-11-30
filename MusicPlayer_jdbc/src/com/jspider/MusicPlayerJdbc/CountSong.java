package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class CountSong {

	public static int countSongs() {
		int count=0;
		try {
			
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));			
			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			
			String query = "select id from musicplayer";
			
			RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);
			
			while(RequriedResources.resultSet.next()) {
				RequriedResources.list.add(RequriedResources.resultSet.getInt(1));
				count++;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return count;
		
	}
	
	
}
