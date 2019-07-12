package immutable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {
public static void main(String[] args) {
	SessionFactory sf=Hibernateutil.getSessionFactory();
	Employee e=new Employee();
	e.setEmpid(3);
	e.setName("mini");
	e.setAddress("auran");
	Session session=sf.openSession();
	session.save(e);

	session.beginTransaction().commit();
}
}
