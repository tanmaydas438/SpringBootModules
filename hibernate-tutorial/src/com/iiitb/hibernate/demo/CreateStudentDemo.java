package com.iiitb.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=factory.getCurrentSession();
			Student s=new Student("tanmay","das","tanmay@gmail.com");
			System.out.println(s.toString());
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
