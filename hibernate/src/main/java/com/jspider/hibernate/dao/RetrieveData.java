package com.jspider.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.dto.StudentDTO;

public class RetrieveData {
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
				//e.printStackTrace();
				System.out.println("transaction committed...");
			}
		}
		public static void main(String[] args) {
			try {
				openConnection();
				transaction.begin();
                 
				StudentDTO st = manager.find(StudentDTO.class, 1);
				//System.out.println(st);	select
		        
				//st.setContact(23424);		update
				
				//st.
									
			} finally {
				closeConnection();
			}
		}
}
