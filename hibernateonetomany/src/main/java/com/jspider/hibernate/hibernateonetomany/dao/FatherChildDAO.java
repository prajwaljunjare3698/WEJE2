package com.jspider.hibernate.hibernateonetomany.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.hibernate.hibernateonetomany.dto.ChildDTO;
import com.jspider.hibernate.hibernateonetomany.dto.FatherDTO;

public class FatherChildDAO {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
		
	public static void openConnection() {
		factory = Persistence.createEntityManagerFactory("OneToMany");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction!=null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction is committed..");
			}			
		}
	}
	
	public static void main(String[] args) {
		
		try {
			openConnection();
			transaction.begin();
			
			FatherDTO father = new FatherDTO();
			father.setId(1);
			father.setName("Pogo");
			
			ChildDTO child1 = new ChildDTO();
			child1.setId(1);
			child1.setName("bheem");
			manager.persist(child1);
			
			ChildDTO child2 = new ChildDTO();
			child2.setId(2);
			child2.setName("chutki");
			manager.persist(child2);
			
			ChildDTO child3 = new ChildDTO();
			child3.setId(3);
			child3.setName("rahul");
			manager.persist(child3);
			
			List<ChildDTO>children = Arrays.asList(child1,child2,child3);
					
			father.setChildren(children);
			
			manager.persist(father);
			transaction.commit();
		} 
		finally {
			closeConnection();
		}
				
	}
}
