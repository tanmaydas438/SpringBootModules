package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Course;
import com.iiitb.hibernate.demo.entity.Instructor;
import com.iiitb.hibernate.demo.entity.InstructorDetail;
import com.iiitb.hibernate.demo.entity.Review;
import com.iiitb.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

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
			
			
			
			session.beginTransaction();
			Course c=new Course("Physics");
			
			session.save(c);
			
			Student s1=new Student("Modi","Das","tanmay@gmail.com");
			Student s2=new Student("Amit","Das","Rahul@gmail.com");
			Student s3=new Student("Yogi","Das","Chinmoy@gmail.com");
			
			c.addStudent(s1);
			c.addStudent(s2);
			c.addStudent(s3);
			
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





