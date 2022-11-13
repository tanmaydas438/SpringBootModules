package com.iiitb.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Course;
import com.iiitb.hibernate.demo.entity.Instructor;
import com.iiitb.hibernate.demo.entity.InstructorDetail;
import com.iiitb.hibernate.demo.entity.Student;

public class GetInstructorCoursesDemo {

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
			int id=1;
			session.beginTransaction();
			
			Instructor ins=session.get(Instructor.class, id);
			List<Course> list=ins.getCourseList();
			for(Course c:list)
			System.out.println(c);
			
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

}





