package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Course;
import com.iiitb.hibernate.demo.entity.Instructor;
import com.iiitb.hibernate.demo.entity.InstructorDetail;
import com.iiitb.hibernate.demo.entity.Review;
import com.iiitb.hibernate.demo.entity.Student;

public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			
			
			session.beginTransaction();
			Course c=new Course("Software Testing");
			c.addReview(new Review("Hello"));
			c.addReview(new Review("Hiiiiii"));
			c.addReview(new Review("Heyyyyyyy"));
			session.save(c);
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





