package com.cjc;

import org.hibernate.Session;

public class Test {
 public static void main(String[] args) {
	Session session=Hibernateutil.getSessionFactory().openSession();
	CjcAkurdi cjcAkurdi=new CjcAkurdi();
	cjcAkurdi.setId(101);
	cjcAkurdi.setCname("john");
	cjcAkurdi.setSname("wikjd");
	cjcAkurdi.setWeekend("week1");
	
	cjcKarvenagar cjcKarvenagar=new cjcKarvenagar();
	cjcKarvenagar.setId(201);
	cjcKarvenagar.setCname("rocky");
	cjcKarvenagar.setSname("oiuyt");
	cjcKarvenagar.setRegular("montofri");
	
	session.save(cjcKarvenagar);
	session.save(cjcAkurdi);
	session.beginTransaction().commit();
}
}
