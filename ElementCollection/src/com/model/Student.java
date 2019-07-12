package com.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	@ElementCollection
	@JoinTable(name = "address", joinColumns = { @JoinColumn(name = "rollno") })
	private Set<Address> sddr = new HashSet<>();

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getSddr() {
		return sddr;
	}

	public void setSddr(Set<Address> sddr) {
		this.sddr = sddr;
	}

}
