package com.lauracarpaciu.entities.bankAccount;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
public class Payment extends Operation {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


}
