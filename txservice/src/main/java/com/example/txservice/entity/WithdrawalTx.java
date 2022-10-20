package com.example.txservice.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("withdrawal")
public class WithdrawalTx extends Tx {

	private int accountNo;
	private String location;

	public WithdrawalTx() {

	}

	public WithdrawalTx(int accountNo, String location) {
		super();
		this.accountNo = accountNo;
		this.location = location;
	}

	@Override
	public String toString() {
		return "WithdrawalTx [accountNo=" + accountNo + ", location=" + location + "]";
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}