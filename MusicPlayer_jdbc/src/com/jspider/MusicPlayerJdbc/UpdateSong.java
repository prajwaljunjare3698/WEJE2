package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

public class UpdateSong {

public static void updateSong() {
		
		try {
			RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
			RequriedResources.properties.load(RequriedResources.fileReader);
			Class.forName(RequriedResources.properties.getProperty("driverPath"));
			
			RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
			RequriedResources.statement = RequriedResources.connection.createStatement();
			
			//display all song
			System.out.println("present songs are...");
			DisplaySongList.displayListOfSong();
			
			System.out.println("select id of song to update");
			int id = RequriedResources.scanner.nextInt();
			int count = CountSong.countSongs();
			
			if(id<=count) {
				
				System.out.println("update followings\n1.name\n2.singer\n3.length\n");	
				int upd = RequriedResources.scanner.nextInt();
				
				if(upd<=3) {
					switch (upd) {
						case 1:
							System.out.println("enter new songName");
							String songName = RequriedResources.scanner.next();
							String query = "update musicplayer set name=? where id="+id;
							
							RequriedResources.preparedStatement = RequriedResources.connection.prepareStatement(query);
							RequriedResources.preparedStatement.setString(1, songName);						
							int result = RequriedResources.preparedStatement.executeUpdate();						
							
							System.out.println(result+" song update successfully...");						
							
							break;
							
						case 2:
							System.out.println("enter new singer");
							String singerName = RequriedResources.scanner.next();
							query = "update musicplayer set singer=? where id="+id+"";
							
							RequriedResources.preparedStatement = RequriedResources.connection.prepareStatement(query);
							RequriedResources.preparedStatement.setString(1, singerName);						
							result = RequriedResources.preparedStatement.executeUpdate();						
								
							
							System.out.println("song update successfully...");
							break;
							
						case 3:
							System.out.println("enter new songLength");
							String songLength = RequriedResources.scanner.next();
							query = "update musicplayer set length=? where id="+id+"";
							
							RequriedResources.preparedStatement = RequriedResources.connection.prepareStatement(query);
							RequriedResources.preparedStatement.setString(1, songLength);						
							result =RequriedResources.preparedStatement.executeUpdate();						
							
							
							System.out.println("song update successfully...");
							
							break;
		
						default:
							System.out.println("invalid input");
							UpdateSong.updateSong();
							break;
					}
					
				}
				else {
					System.out.println("invalid input");
					UpdateSong.updateSong();
				}
			}
			else {
				System.err.println("select proper id");
				UpdateSong.updateSong();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
}
