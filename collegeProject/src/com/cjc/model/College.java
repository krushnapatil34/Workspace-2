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
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cd;
	private String cname;
	private String cAddress;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Department> collegeSet = new HashSet<>();

	public Set<Department> getCollegeSet() {
		return collegeSet;
	}

	public void setCollegeSet(Set<Department> collegeSet) {
		this.collegeSet = collegeSet;
	}

	public int getCd() {
		return cd;
	}

	public void setCd(int cd) {
		this.cd = cd;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

}
