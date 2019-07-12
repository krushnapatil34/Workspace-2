package com.model;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	Student stu=session.load(Student.class,15);
//	stu.setRollno(3);
//	stu.setName("krushn");
//	stu.setAddr("Amravat"); 
	//session.save(stu);
	
	//session.beginTransaction().commit();
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
}
}
