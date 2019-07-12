package com.model;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Address adr = new Address();
		adr.setCityname("munbai");
		adr.setAreaname("md");

		Address adr1 = new Address();
		adr1.setCityname("amtr");
		adr1.setAreaname("wakad");

		Student stu = new Student();
		stu.setRollno(1);
		stu.setName("anu");
		stu.getSddr().add(adr);
		stu.getSddr().add(adr1);

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.save(stu);
		session.beginTransaction().commit();

	}
}
