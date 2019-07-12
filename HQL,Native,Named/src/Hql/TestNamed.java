package Hql;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

public class TestNamed {
	public static void main(String[] args) {
		Session session =Hibernateutil.getSessionFactory().openSession();
		Query query=session.createNamedQuery("allStudent",Student.class);
		 List<Student> list=session.createNamedQuery("allStudent").setParameter("id",1).getResultList();
		 for(Student stu:list)
		 {
			 System.out.println(stu.getRollno());
			 System.out.println(stu.getName());
			 System.out.println(stu.getAddress());
			 
		 }
				 
	}

}
