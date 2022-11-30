package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

import com.jspider.MusicPlayerJdbc.main.MusicPlayer;

public class PlayRandomSong {

	public static void PlayRandom() {		
		try {
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));			
			RequriedResources.	connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			
			String query = "select id from musicplayer";
			RequriedResources.statement =RequriedResources.connection.createStatement();
			RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);
						
							
			//to get arraylist call the countSong()
			CountSong.countSongs();
			
			//Math.random() * (max - min + 1) + min  
			double id = Math.random() * (RequriedResources.list.size());
			query = "select name from musicplayer where id="+RequriedResources.list.get((int)id);

			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);
			
			while(RequriedResources.resultSet.next()) {
				System.out.println(RequriedResources.resultSet.getString(1)+" is playing");
				Thread.sleep(400);
			}
			MusicPlayer.musicMenu();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
