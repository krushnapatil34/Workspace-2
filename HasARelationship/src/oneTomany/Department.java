package oneTomany;

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
	private String name;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private Set<Employee> departmentset = new HashSet<>();

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getDepartmentset() {
		return departmentset;
	}

	public void setDepartmentset(Set<Employee> departmentset) {
		this.departmentset = departmentset;
	}

}
