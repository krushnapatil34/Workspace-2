package noOfEmployeeCount;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import CriteriaApi.Employee;
import CriteriaApi.Hibernateutil;

public class Test {
	public static void main(String[] args) {
		Session session=Hibernateutil.getSessionFactory().openSession();
		CriteriaBuilder builder=session.getCriteriaBuilder();
		CriteriaQuery<Long> cQuery=builder.createQuery(Long.class);
		Root<Employee> root=cQuery.from(Employee.class);
		
		cQuery.select(builder.count(root));
		long ncount =session.createQuery(cQuery).getSingleResult();
		
			System.out.println(ncount);
	
		
	}

}

