package immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
public class Employee {
@Id
private int empid;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
private String name;
private String address;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
