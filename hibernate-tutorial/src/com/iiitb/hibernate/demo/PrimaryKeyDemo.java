package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		Student s1=new Student("tanmay","das","tanmay@gmail.com");
		Student s2=new Student("Rahul","das","tanmay@gmail.com");
		Student s3=new Student("Chinmoy","das","tanmay@gmail.com");
		try {
			session.beginTransaction();
			session.save(s1);
			session.save(s2);
			session.save(s3);
			session.getTransaction().commit();
	}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
