package MultipleTable;

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
private Set<Employee> departmentset = new HashSet<>();
public Set<Employee> getDepartmentset() {
	return departmentset;
}
public void setDepartmentset(Set<Employee> departmentset) {
	this.departmentset = departmentset;
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
