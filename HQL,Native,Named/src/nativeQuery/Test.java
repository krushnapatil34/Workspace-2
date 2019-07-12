package nativeQuery;

import java.util.List;
import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=Hibernateutil.getSessionFactory().openSession();
	List<Student> list=session.createNativeQuery("Select * from Student",Student.class).getResultList();
	
	for(Student stu:list)
	{
		System.out.println(stu.getRollno());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
	}
}
}
