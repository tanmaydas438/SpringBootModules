package com.iiitb.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.iiitb.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		int id=2;
		//Student s=session.get(Student.class, id);
		
		//session.delete(s);
		
		session.createQuery("delete from Student s where s.id=7").executeUpdate();
		session.getTransaction().commit();
	}

}
