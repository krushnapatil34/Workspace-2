package com.cjc;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="karvenagar")
public class cjcKarvenagar extends Cjc {
private String regular;

public String getRegular() {
	return regular;
}

public void setRegular(String regular) {
	this.regular = regular;
}

}
