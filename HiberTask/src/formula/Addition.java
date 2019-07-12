package formula;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Formula;

@Entity
public class Addition {
	@Id
private int a;
private int b;
@Formula("a+b")
private float c;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public float getC() {
	return c;
}
public void setC(float c) {
	this.c = c;
}


}
