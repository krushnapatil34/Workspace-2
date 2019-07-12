package selectName;

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
		CriteriaQuery<String> cQuery=builder.createQuery(String.class);
		Root<Employee> root=cQuery.from(Employee.class);
		
		cQuery.select(root.get("name"));
		List<String> list =session.createQuery(cQuery).getResultList();
		
		for(String nm :list)
		{
			System.out.println(nm);
		
		}
		
	}

}
