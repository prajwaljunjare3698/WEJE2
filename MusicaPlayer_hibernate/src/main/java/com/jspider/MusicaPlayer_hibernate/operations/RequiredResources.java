package com.jspider.MusicaPlayer_hibernate.operations;

import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RequiredResources {

	
	protected static ArrayList<Integer> list = new ArrayList<Integer>();
		
	protected static EntityManagerFactory factory;
	protected static EntityManager manager;
	protected static EntityTransaction transaction;	
	protected static Scanner scanner = new Scanner(System.in);
	
	protected static void openConnection() {
		factory = Persistence.createEntityManagerFactory("musicplayer");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	protected static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction!=null) {
			try {
				transaction.rollback();				
			} catch (Exception e) {
				System.out.println("transaction is committed..");
			}
		}
	}
}