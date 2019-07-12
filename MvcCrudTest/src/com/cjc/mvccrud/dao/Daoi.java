package com.cjc.mvccrud.dao;

import java.util.List;

import com.cjc.mvccrud.model.Student;

public interface Daoi {
	public void addStudent(Student s);

	public List<Student> Checklogin(String username, String passward);

	public void delete(int id);

	public List<Student>getAlldata();

	public Student edit(int id);

	public void update(Student c);

}
