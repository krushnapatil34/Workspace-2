package com.cjc.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

public class Operation {
	// Session session = Hibernateutil.getSessionFactory().openSession();
	Scanner sc = new Scanner(System.in);
	College c = new College();
	Student s = new Student();
	Department d = new Department();
	List<Department> dlist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();

	public void addstudent() {
		Session session = Hibernateutil.getSessionFactory().openSession();

		System.out.println("Add student rollno");
		int rollno = sc.nextInt();
		s.setRollno(rollno);

		System.out.println("Add Student Name");
		String Sname = sc.next();
		s.setsName(Sname);

		System.out.println("Add Student Address");
		String Sadd = sc.next();
		s.setsAddress(Sadd);

		slist.add(s);
		session.save(s);
		session.beginTransaction().commit();

	}

	public void viewstudent() {
		System.out.println("please provide id of student");
		int Stuinfo = sc.nextInt();
		Session session = Hibernateutil.getSessionFactory().openSession();
		Student s = session.get(Student.class, Stuinfo);
		System.out.println(s.getRollno());
		System.out.println(s.getsName());
		System.out.println(s.getsAddress());

	}

	public void deleteStudent() {
		System.out.println("Id of student you want to delete");

		int Stuinfo = sc.nextInt();
		Session session = Hibernateutil.getSessionFactory().openSession();
		Student s22 = session.get(Student.class, Stuinfo);

		if (s22.getRollno() == Stuinfo) {

			s.setRollno(0);
			slist.add(s);
			session.save(s);
			session.beginTransaction().commit();
			System.out.println("given rollno is deleted");

		}

	}

	public void UpadateStudent() {
		System.out.println("give rollno of Student u want to update");
		int Stuinfo = sc.nextInt();
		Session session = Hibernateutil.getSessionFactory().openSession();
		Student s22 = session.get(Student.class, Stuinfo);

		if (s22.getRollno() == Stuinfo) {
			{
				System.out.println("what you want to update about student \n 1. Name \n 2.Address \n 3.All Data");
				int n = sc.nextInt();
				if (n == 1) {
					System.out.println("Add New Name of Student ");
					String Sname = sc.next();
					s.setsName(Sname);
					slist.add(s);
				} else if (n == 2) {
					System.out.println("Add new Address of Student ");
					String Add = sc.next();
					s.setsAddress(Add);
					slist.add(s);
				} else {
					System.out.println("Add New Name of Student ");
					String Sname = sc.next();
					s.setsName(Sname);

					System.out.println("Add new Address of Student ");
					String Add = sc.next();
					s.setsAddress(Add);
					slist.add(s);
				}
				session.save(s);
				session.beginTransaction().commit();
			}
		}
	}

	public void SelectDept() {
		Session session = Hibernateutil.getSessionFactory().openSession();
		Department d1 = new Department();
		Department d2 = new Department();
		List<Department> deplist = new ArrayList<>();
		System.out.println(
				"Please Select one Departments from college \n 1.foreign Language \n 2.Research \n 3.Engineering \n ");
		d.setDid(1);
		d.setDname("Foreign Language");
		d1.setDid(2);
		d1.setDname("Research");
		d2.setDid(3);
		d2.setDname("Engineering");
		deplist.add(d);
		deplist.add(d1);
		deplist.add(d2);

		dlist.addAll(deplist);
		System.out.println("to which student u want to Assign a department");
		int seldep = sc.nextInt();
		Student s22 = session.get(Student.class, seldep);
		if (s22.getRollno() == seldep) {
			int n = sc.nextInt();
			if (n == 1) {
				System.out.println("you have selected foreign language department for Student ");
			} else if (n == 2) {
				System.out.println("you have selected Research Department");
			} else if (n == 3) {
				System.out.println("you have selected Engineering Department");
			} else {
System.out.println();
			}
			session.save(s);
			session.beginTransaction().commit();
		}

	}
}
