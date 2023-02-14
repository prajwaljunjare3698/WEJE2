package com.jspider.MusicPlayerJdbc;

public class RemoveSong {

public static void removeSong() {
		
		try {
			System.out.println("present songs are...");
			
			DisplaySongList.displayListOfSong();;
			
			System.out.println("enter id to delete song");
			int id = RequriedResources.scanner.nextInt();
			CountSong.countSongs();
			
			if(RequriedResources.list.contains(id)) {
				String query = "delete from musicplayer where id="+id;
				
				RequriedResources.statement = RequriedResources.connection.createStatement();
				int result = RequriedResources.statement.executeUpdate(query);				
				RequriedResources.list.remove(Integer.valueOf(id));
				
				System.out.println(result+" song deleted");
			}
			else {
				System.err.println("enter proper id");
				RemoveSong.removeSong();
			}
						
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
