package com.cjc;

//import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//import javax.persistence.MappedSuperclass;
//@DiscriminatorColumn(name="type")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Cjc {
	@Id
	private int id;
private String Sname;
private String Cname;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public String getCname() {
	return Cname;
}
public void setCname(String cname) {
	Cname = cname;
}

}
