package com.cjc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Test {
public static void main(String[] args) {
	StandardServiceRegistry registri=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources mds=new MetadataSources(registri);
	Metadata md=mds.getMetadataBuilder().build();
	SessionFactory sf=md.getSessionFactoryBuilder().build();
	Session session=sf.openSession();
	Student stu=new Student();
	stu.setRollno(1);
	stu.setName("krushna");
	stu.setAddress("amravati");
	session.save(stu);
	session.beginTransaction().commit();
	
}
}
