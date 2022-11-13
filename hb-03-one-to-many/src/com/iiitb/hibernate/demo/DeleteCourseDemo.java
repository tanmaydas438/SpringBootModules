package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Course;
import com.iiitb.hibernate.demo.entity.Instructor;
import com.iiitb.hibernate.demo.entity.InstructorDetail;
import com.iiitb.hibernate.demo.entity.Student;

public class DeleteCourseDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			int id=10;
			
			session.beginTransaction();
			
			Course c=session.get(Course.class, id);
			c.setInstructor(null);
			session.delete(c);
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





