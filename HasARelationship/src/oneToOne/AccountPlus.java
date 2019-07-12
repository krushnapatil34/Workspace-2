package oneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountPlus {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int acpid;
private int amt;
private String name;

public int getAcpid() {
	return acpid;
}
public void setAcpid(int acpid) {
	this.acpid = acpid;
}
public int getAmt() {
	return amt;
}
public void setAmt(int amt) {
	this.amt = amt;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
