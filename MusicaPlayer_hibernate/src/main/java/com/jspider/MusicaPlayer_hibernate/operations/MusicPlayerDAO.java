package com.jspider.MusicaPlayer_hibernate.operations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class MusicPlayerDAO {
	
	public static EntityManagerFactory factory;
	public static EntityManager manager;
	public static EntityTransaction transaction;
	
	
	public static void main(String[] args) {
		try {
			
			RequiredResources.openConnection();
			RequiredResources.transaction.begin();
			
			MusicPlayer.musicMenu();			
						
		} finally {
			RequiredResources.closeConnection();
		}
	}
	
}
