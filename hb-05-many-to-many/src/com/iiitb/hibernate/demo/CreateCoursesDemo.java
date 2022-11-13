package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Course;
import com.iiitb.hibernate.demo.entity.Instructor;
import com.iiitb.hibernate.demo.entity.InstructorDetail;
import com.iiitb.hibernate.demo.entity.Review;
import com.iiitb.hibernate.demo.entity.Student;

public class CreateCoursesDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {			
			
			
			int id=7;
			
			session.beginTransaction();
			
			Student s=session.get(Student.class, id);
			Course c1=new Course("Cyber");
			Course c2=new Course("Algo");
			s.addCourse(c1);
			s.addCourse(c2);
			session.save(s);
			session.save(c1);
			session.save(c2);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





