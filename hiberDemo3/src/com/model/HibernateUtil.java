package com.model;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
private static SessionFactory sessionFactory;
public static SessionFactory getSessionFactory()
{
	
if(sessionFactory==null)
{
	StandardServiceRegistry registry=new StandardServiceRegistryBuilder().configure().build();
	MetadataSources mds=new MetadataSources(registry);
	Metadata md =mds.getMetadataBuilder().build();
	sessionFactory  = md.getSessionFactoryBuilder().build();
	
}
return sessionFactory;
}
}
