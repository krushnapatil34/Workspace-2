package com.cjc.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Test2 {

	public static void main(String[] args) {
		StandardServiceRegistry registri=new StandardServiceRegistryBuilder().configure().build();
		MetadataSources mds=new MetadataSources(registri);
		Metadata md=mds.getMetadataBuilder().build();
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		Session session=sf.openSession();
		Employee emp=new Employee();
		emp.setId(143);
		emp.setName("krushna patil");
		emp.setAddress("amravati");
		session.save(emp);
		session.beginTransaction().commit();
		
	}

}
