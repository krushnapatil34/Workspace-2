package firstLevelCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=Hibernateutil.getSessionFactory();
	Session session=sf.openSession();
	Employee e1=session.get(Employee.class,1);
	Employee e2=session.get(Employee.class,1);
	session.close();
	Session session1=sf.openSession();
	Employee e3=session1.get(Employee.class,1);
	
}
}
