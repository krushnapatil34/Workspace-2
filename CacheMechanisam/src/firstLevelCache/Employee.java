package firstLevelCache;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int empid;
private int empName;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getEmpName() {
	return empName;
}
public void setEmpName(int empName) {
	this.empName = empName;
}

}
