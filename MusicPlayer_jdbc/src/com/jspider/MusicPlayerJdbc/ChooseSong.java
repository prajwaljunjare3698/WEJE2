package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class ChooseSong {

	public static void chooseSong() {
		
		try {
			DisplaySongList.displayListOfSong();
			
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));			
			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			
			System.out.println("enter id to play song");
			
			int id = RequriedResources.scanner.nextInt();
			int count = CountSong.countSongs();
			if(id<=count) {
				String query = "select name from musicplayer where id="+id;
				RequriedResources.resultSet = RequriedResources.statement.executeQuery(query);		
				
				while(RequriedResources.resultSet.next()) {
					System.out.println(RequriedResources.resultSet.getString(1)+" song playing");
					Thread.sleep(400);
				}				
			}
			else {
				System.err.println("enter proper id");
				ChooseSong.chooseSong();
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
