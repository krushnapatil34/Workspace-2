package com.cjc.model;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Address addr=new Address();
	addr.setCityname("pune");
	addr.setAreaname("karvenagar");
	
	Student stu=new Student();
	stu.setRollno(1);
	stu.setName("kru");
	stu.setAdr(addr);
	
	Session session=HibernateUtil.getSessionFactory().openSession();
	session.save(stu);
	session.beginTransaction().commit();
}
}
