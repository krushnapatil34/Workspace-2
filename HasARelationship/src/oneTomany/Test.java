package oneTomany;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Department department = new Department();
		// department.setDid(101);
		department.setName("comp");

		Employee e1 = new Employee();
		e1.setName("ana");
		// e1.setEmpid(112);
		e1.setAddress("newyork");
		e1.setDepartment(department);

		Employee e2 = new Employee();
		// e2.setEmpid(221);
		e2.setName("ron");
		e2.setAddress("sidney");
		e2.setDepartment(department);

		department.getDepartmentset().add(e1);
		department.getDepartmentset().add(e2);
		Session session = Hibernateutil.getSessionFactory().openSession();
		session.save(e1);
		session.save(e2);
		session.beginTransaction().commit();

	}
}
