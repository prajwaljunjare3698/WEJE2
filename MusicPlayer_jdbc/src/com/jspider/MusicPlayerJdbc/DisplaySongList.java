package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class DisplaySongList {

	public static void displayListOfSong() {		
		try {
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));
			
			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			
			String query = "select * from musicplayer";
			
			RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);
			while(RequriedResources.resultSet.next()) {
				System.out.println(RequriedResources.resultSet.getInt(1)+" "+RequriedResources.resultSet.getString(2));
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
