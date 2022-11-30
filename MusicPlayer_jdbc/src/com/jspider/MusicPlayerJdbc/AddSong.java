package com.jspider.MusicPlayerJdbc;

import java.io.FileReader;
import java.sql.DriverManager;

import com.jspider.song.operations.MusicPlayer;

public class AddSong {
	
	public static void addSong() {
		
		System.out.println("how many songs u want to add");
		int no = RequriedResources.scanner.nextInt();
		
		for (int i=1;i<=no;i++) {
			try {								
				RequriedResources.fileReader = new FileReader(RequriedResources.filePath);
				RequriedResources.properties.load(RequriedResources.fileReader);
				Class.forName(RequriedResources.properties.getProperty("driverPath"));
				
				RequriedResources.connection = DriverManager.getConnection(RequriedResources.properties.getProperty("db_url"),RequriedResources.properties);
				RequriedResources.statement = RequriedResources.connection.createStatement();
				
				System.out.println("Enter song id:");			
				int id = RequriedResources.scanner.nextInt();
				RequriedResources.list.add(id);
				
				System.out.println("Enter song name:");			
				String songName = RequriedResources.scanner.next();
				
				System.out.println("Enter singer name:");			
				String singerName = RequriedResources.scanner.next();
				
				System.out.println("Enter song length:");			
				double songLength = RequriedResources.scanner.nextDouble();
				
				String query = "insert into musicplayer values(?,?,?,?)";
				RequriedResources.preparedStatement = RequriedResources.connection.prepareStatement(query);
				
				RequriedResources.preparedStatement.setInt(1, id);
				RequriedResources.preparedStatement.setString(2, songName);
				RequriedResources.preparedStatement.setString(3, singerName);
				RequriedResources.preparedStatement.setDouble(4, songLength);
								
				int result = RequriedResources.preparedStatement.executeUpdate();
				
				System.out.println(result+" song added successfully");	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		MusicPlayer.musicMenu();
		
	}
}
