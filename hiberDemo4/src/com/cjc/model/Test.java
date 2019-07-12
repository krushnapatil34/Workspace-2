package com.cjc.model;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=Hibernateutil.getSessionFactory().openSession();
	Student stu=session.get(Student.class,5);
	System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAddr());
}
}
