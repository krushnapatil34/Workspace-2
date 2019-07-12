package Hql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
	
	@NamedQuery(name="allStudent",query="from Student where rollno=:id")
	//@NamedQuery(name="Alls",query="from Student")

//@NamedQuery(name="allStudent",query="from Student")
public class Student {
	@Id
private int rollno;
private String name ;
private String address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
