package Hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session =Hibernateutil.getSessionFactory().openSession();
	 Query query=session.createQuery("from Student",Student.class);
	 List<Student> list=query.getResultList();
	 for(Student stu:list)
	 {
		 System.out.println(stu.getRollno());
		 System.out.println(stu.getName());
		 System.out.println(stu.getAddress());
		 
	 }
			 
}
}
