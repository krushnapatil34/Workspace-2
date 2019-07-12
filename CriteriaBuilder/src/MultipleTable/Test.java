package MultipleTable;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session = Hibernateutil.getSessionFactory().openSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Object[]> cQuery = builder.createQuery(Object[].class);

		Root<Employee> emroot = cQuery.from(Employee.class);
		Root<Department> dproot = cQuery.from(Department.class);
		cQuery.multiselect(emroot, dproot).where(builder.equal(emroot.get("department"), dproot.get("did")));

		List<Object[]> list = session.createQuery(cQuery).getResultList();

		for (Object[] obj : list) {
			Employee emp = (Employee) obj[0];

			System.out.println(emp.getEmpid());
			System.out.println(emp.getName());
			System.out.println(emp.getAddress());

			Department dpt = (Department) obj[1];

			System.out.println(dpt.getDid());
			System.out.println(dpt.getDname());

		}
	}
}
