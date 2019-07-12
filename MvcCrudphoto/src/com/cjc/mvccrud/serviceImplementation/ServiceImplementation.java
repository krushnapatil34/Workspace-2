package com.cjc.mvccrud.serviceImplementation;

import java.util.List;

import com.cjc.mvccrud.dao.Daoi;
import com.cjc.mvccrud.daoImplementation.DaoImplementation;
import com.cjc.mvccrud.model.Student;
import com.cjc.mvccrud.service.Servicei;

public class ServiceImplementation implements Servicei{
Daoi di=new DaoImplementation();

	@Override
	public void addStudent(Student s) {
	
		di.addStudent(s);
	}

	@Override
	public List<Student> Checklogin(String username, String passward) {
		List<Student>list;
		
		if(username.equals("admin")&& passward.equals("admin"))
		{
			list=di.getAlldata();
		}
		else
		{
			list=di.Checklogin(username, passward);
			
		}
		return list;
	}

	@Override
	public void delete(int id) {
		
		di.delete(id);
	}

	@Override
	public List<Student> getAlldata() {
		List<Student>list=di.getAlldata();
		return list;
	}

	@Override
	public Student edit(int id) {
	Student sd=di.edit(id);
	return sd;
	
	}

	@Override
	public void update(Student c) {
		di.update(c);
	}

}
