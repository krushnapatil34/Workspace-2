package com.cjc;

import javax.persistence.Entity;

@Entity
public class CjcAkurdi extends Cjc{
private String weekend;

public String getWeekend() {
	return weekend;
}

public void setWeekend(String weekend) {
	this.weekend = weekend;
}

}
