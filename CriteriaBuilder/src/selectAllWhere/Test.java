package selectAllWhere;

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
		
		CriteriaQuery<Employee> cQuery=builder.createQuery(Employee.class);
		
		Root<Employee> root=cQuery.from(Employee.class);
		
		cQuery.select(root).where(builder.equal(root.get("empid"), 1));
		
		//List<Employee> list =session.createQuery(cQuery).getResultList();
		
		Employee emp=session.createQuery(cQuery).getSingleResult();
		
			System.out.println(emp.getEmpid());
			System.out.println(emp.getName());
			System.out.println(emp.getAddress());
		}

}
