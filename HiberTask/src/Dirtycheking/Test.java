package Dirtycheking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=Hibernateutil.getSessionFactory();
	Session session=sf.openSession();
	Employe e=session.load(Employe.class,1);
	e.setName("VT");
	session.beginTransaction().commit();
	
}
}
