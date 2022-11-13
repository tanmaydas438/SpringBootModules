package com.iiitb.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		//List<Student> slist=session.createQuery("from Student").getResultList();
		List<Student> slist=session.createQuery("from Student s where s.firstName='tanmay' or s.lastName='das'").getResultList();
		for(Student s:slist)
			System.out.println(s);
		
	}

}
