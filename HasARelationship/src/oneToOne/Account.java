package oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int AccNo;
private String name;
private String addr;

@OneToOne(cascade=CascadeType.ALL)
private AccountPlus acp;

public AccountPlus getAcp() {
	return acp;
}
public void setAcp(AccountPlus acp) {
	this.acp = acp;
}
public int getAccNo() {
	return AccNo;
}
public void setAccNo(int accNo) {
	AccNo = accNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}

}
