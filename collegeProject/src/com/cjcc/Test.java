package com.cjcc;

import org.hibernate.Session;
import com.cjc.model.*;


public class Test {
public static void main(String[] args) {
	Student student=new Student();
	student.setsName("john");
	student.setsAddress("sidney");
	
	Student student1=new Student();
	student1.setsName("ron");
	student1.setsAddress("newyork");
	
	Student student2=new Student();
	student2.setsName("harry");
	student2.setsAddress("paris");
	
	
	Department department=new Department();
	department.setDname("Information Tech");
	department.getDepartmentSet().add(student);
	department.getDepartmentSet().add(student1);
	
	
	Department department2=new Department();
	department2.setDname("CSE");

	department2.getDepartmentSet().add(student2);
	
	College college=new College();
	college.setCname("BitsPilani");
	college.setcAddress("Rajastan");
	college.getCollegeSet().add(department);
	college.getCollegeSet().add(department2);
	
	Session session = Hibernateutil.getSessionFactory().openSession();
	//session.save(student);
	//session.save(department);
	session.save(college);
	session.beginTransaction().commit();
	
	
	
	
	

	
	

}
}
