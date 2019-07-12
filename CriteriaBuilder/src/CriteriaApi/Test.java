package CriteriaApi;
//select * from Employee
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
public static void main(String[] args) {
	Session session=Hibernateutil.getSessionFactory().openSession();
	CriteriaBuilder builder=session.getCriteriaBuilder();
	CriteriaQuery<Employee> cQuery=builder.createQuery(Employee.class);
	Root<Employee> root=cQuery.from(Employee.class);
	cQuery.select(root);
	List<Employee> list =session.createQuery(cQuery).getResultList();
	
	for(Employee emp :list)
	{
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
	}
	
}
}
