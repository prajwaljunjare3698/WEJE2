package com.jspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class StudentDAO {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	private static void openConnection() {
		
		factory = Persistence.createEntityManagerFactory("Student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	private static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		try {
			transaction.rollback();
		} catch (TransactionException e) {
			System.out.println("transaction committed..");
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			StudentDTO st = new StudentDTO();
			st.setId(3);
			st.setName("sanket");
			st.setEmail("sanket09@baner.com");
			st.setContact(231840);
			
			manager.persist(st);
			transaction.commit();
			
		}
		finally {
			closeConnection();
		}
	}
}
