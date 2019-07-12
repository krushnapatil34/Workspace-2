package formula;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf =Hibernateutil.getSessionFactory();
	Session session = sf.openSession();
	Addition add =session.get(Addition.class,1);
	System.out.println(add.getC());
}
}
