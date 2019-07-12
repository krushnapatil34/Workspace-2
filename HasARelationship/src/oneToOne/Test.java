package oneToOne;

import org.hibernate.Session;

import oneToOne.Hibernateutil;

public class Test {
public static void main(String[] args) {
	Account acount =new Account();
	//acount.setAccNo(1100);
	acount.setName("john");
	acount.setAddr("sidney");
	
	AccountPlus acplus=new AccountPlus();
	 //acplus.setAcpid(1200);
	acount.setAcp(acplus);
	 acplus.setAmt(1000);
	 acplus.setName("ana");
	 
	 Session session=Hibernateutil.getSessionFactory().openSession();
	 session.save(acount);
	 session.beginTransaction().commit();
	 
	
}
}
