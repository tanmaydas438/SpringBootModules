package com.iiitb.hibernate.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
			Session session=factory.getCurrentSession();
			Student s=new Student("paul","das","tanmay@gmail.com");
			session.beginTransaction();
			session.save(s);
			session.getTransaction().commit();
			
			session=factory.getCurrentSession();
			session.beginTransaction();
			Student st=session.get(Student.class, s.getId());
			session.getTransaction().commit();
			System.out.println(st);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
