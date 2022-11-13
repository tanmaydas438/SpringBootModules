package com.iiitb.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	public static void main(String args[])
	{
		
		String url="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String uname="hbstudent";
		String pass="hbstudent";
		try {
			Connection con=DriverManager.getConnection(url,uname,pass);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
