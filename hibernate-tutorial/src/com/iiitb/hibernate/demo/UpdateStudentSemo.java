package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class UpdateStudentSemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		int id=5;
		Student s=session.get(Student.class, id);
		s.setFirstName("Hello");
		session.getTransaction().commit();
	}

}
