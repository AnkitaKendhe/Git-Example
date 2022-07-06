package com.java;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		// insert data into database
		Student student = new Student();
		//student.setId(101);
		student.setFirstName("ankita");
		student.setLastName("kendhe");
		session.save(student);
		t.commit();
		session.close();
		System.out.println("Record saved successfully");
		
		
		
		

	}

}
