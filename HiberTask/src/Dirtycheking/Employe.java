package Dirtycheking;

import javax.persistence.Entity;
import javax.persistence.Id;

	@Entity
	public class Employe {
	 @Id
		private int empid;
		private String address;
		private String name;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
}
