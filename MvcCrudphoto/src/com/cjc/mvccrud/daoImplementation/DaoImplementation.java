package com.cjc.mvccrud.daoImplementation;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cjc.mvccrud.dao.Daoi;
import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.utility.Hibernateutil;

public class DaoImplementation implements Daoi {
	Session session = Hibernateutil.getSessionFactory().openSession();

	@Override
	public void addStudent(Student s) {
		Transaction t = session.beginTransaction();
		session.save(s);
		t.commit();

	}

	@Override
	public List<Student> Checklogin(String username, String password) {
		String query = "from Student where username=:uname and password=:pw";
		Query q = session.createQuery("query");
		q.setParameter("uname", username);
		q.setParameter("pw", password);
		List<Student> list = q.getResultList();
		return list;
	}

	@Override
	public void delete(int id) {
		Student sd = new Student();
		sd.setId(id);
		Transaction t = session.beginTransaction();
		session.delete(sd);
		t.commit();
	}

	@Override
	public List<Student> getAlldata() {
		String query = "from Student";
		Query q = session.createQuery(query);
		List<Student> list = q.getResultList();
		return list;
		/*
		 * try { rs = (ResultSet) smt.executeQuery(sql); while(rs.next()) { S }
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * return list;
		 */
	}

	@Override
	public Student edit(int id) {
		Student s = session.get(Student.class, id);

		return s;
	}

	@Override
	public void update(Student s) {
		Transaction t = session.beginTransaction();
		session.update(s);
		t.commit();
	}

}
