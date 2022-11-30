package com.jspider.MusicaPlayer_hibernate.operations;

import com.jspider.MusicaPlayer_hibernate.dto.MusicPlayerDTO;

public class AddSong {

	public static void addSong() {

		System.out.println("Enter song id:");			
		int id = RequiredResources.scanner.nextInt();
				
		System.out.println("Enter song name:");			
		String songName = RequiredResources.scanner.next();
		
		System.out.println("Enter singer name:");			
		String singerName = RequiredResources.scanner.next();
		
		System.out.println("Enter song length:");			
		double songLength = RequiredResources.scanner.nextDouble();
		
		MusicPlayerDTO music = new MusicPlayerDTO();
		music.setId(id);
		music.setName(songName);
		music.setSinger(singerName);
		music.setLength(songLength);
		RequiredResources.manager.persist(music);
		
		System.out.println("song added successfully");	
		
	
	}

}
