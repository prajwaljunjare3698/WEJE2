package com.jspider.MusicaPlayer_hibernate.operations;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class UpdateSong {

	public static void updateSong() {

		MusicPlayerDTO music;
		
	
				//display all song
				System.out.println("present songs are...");
				DisplaySongList.displayListOfSong();
				
				System.out.println("select id of song to update");
				int id = RequiredResources.scanner.nextInt();
				
				int count = 10;
				
				if(id<=count) {
					
					System.out.println("update followings\n1.name\n2.singer\n3.length\n");	
					int upd = RequiredResources.scanner.nextInt();
					
					if(upd<=3) {
						switch (upd) {
							case 1:
								System.out.println("enter new songName");
								String songName = RequiredResources.scanner.next();
								music = RequiredResources.manager.find(MusicPlayerDTO.class, id);
								System.out.println("song update successfully...");						
								
								break;
								
							case 2:
								System.out.println("enter new singer");
								String singerName = RequiredResources.scanner.next();
								
								
								System.out.println("song update successfully...");
								break;
								
							case 3:
								System.out.println("enter new songLength");
								String songLength = RequiredResources.scanner.next();
																
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
	
	}

}
