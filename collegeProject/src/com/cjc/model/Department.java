package com.cjc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String dname;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Student> departmentSet = new HashSet<>();

	public Set<Student> getDepartmentSet() {
		return departmentSet;
	}

	public void setDepartmentSet(Set<Student> departmentSet) {
		this.departmentSet = departmentSet;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}
