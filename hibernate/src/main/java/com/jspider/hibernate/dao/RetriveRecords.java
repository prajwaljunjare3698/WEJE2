package com.jspider.hibernate.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.dto.StudentDTO;

public class RetriveRecords {
		
	public static void retrieve() {	
//	   Configuration config = new Configuration();
//	   config.addAnnotatedClass(StudentDTO.class);
//	   SessionFactory factory= config.configure().buildSessionFactory();
//	   Session session = factory.getCurrentSession();
//	   session.beginTransaction();
//	   Query queryResult = session.createQuery("from StudentDTO");
//	  
//	   List allUsers = queryResult.list();
//	   for (int i = 0; i < allUsers.size(); i++) {
//		   
//		   StudentDTO student = (StudentDTO) allUsers.get(i);
//	   }
//		  System.out.println("Database contents delivered..."); 
		
//		@joinnTable(name="tablenamefor_intermediate tble",
//				joinColumns=@JoinColumn(referenceColumnNmae="curently_talbe_name_id"),
//				inverseJoinColumn()
	}
	public static void main(String[] args) {
		retrieve();
	}
}