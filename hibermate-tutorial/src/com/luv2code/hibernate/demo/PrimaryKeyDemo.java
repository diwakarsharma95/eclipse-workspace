package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// create 3 student object
			System.out.println("Creating 3 student objects...");
			Student tempstudent1 = new Student("Diwakar", "Sharma","diwakarsharma95@gmail.com");
			Student tempstudent2 = new Student("Vidhi", "Sharma","vidhisharma95@gmail.com");
			Student tempstudent3 = new Student("James", "Sharma","jamessharma95@gmail.com");
			
			// start transaction
			session.beginTransaction();
			
			// save the student object
			System.out.println("Saving the students...");
			session.save(tempstudent1);
			session.save(tempstudent2);
			session.save(tempstudent3);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}

	}

}
