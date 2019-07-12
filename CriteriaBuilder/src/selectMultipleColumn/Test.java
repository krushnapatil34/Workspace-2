package selectMultipleColumn;


import java.util.List;

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
		CriteriaQuery<Object[]> cQuery=builder.createQuery(Object[].class);
		Root<Employee> root=cQuery.from(Employee.class);
		
		cQuery.multiselect(root.get("name"),root.get("address"));
		List<Object[]> list =session.createQuery(cQuery).getResultList();
		
		for(Object[] obj :list)
		{
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		
		}
		
	}

}

