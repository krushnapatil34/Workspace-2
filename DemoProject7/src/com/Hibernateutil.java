package com;

import java.util.HashMap;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class Hibernateutil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		try{
		if (sessionFactory == null) {
			Map<String, Object> Settings = new HashMap<>();
			Settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			Settings.put(Environment.URL, "jdbc:mysql://localhost:3306/test");
			Settings.put(Environment.USER, "root");
			Settings.put(Environment.PASS, "root");
			Settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			Settings.put(Environment.HBM2DDL_AUTO, "create");
			Settings.put(Environment.SHOW_SQL, "true");
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(Settings).build();
			MetadataSources mds = new MetadataSources(registry);
			mds.addAnnotatedClass(Student.class);
			Metadata md = mds.getMetadataBuilder().build();
			sessionFactory = md.getSessionFactoryBuilder().build();
		}}
		catch(Exception e){
			e.printStackTrace();
		}
		return sessionFactory;
	}
}
