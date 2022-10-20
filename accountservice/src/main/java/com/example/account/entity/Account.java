package com.example.account.entity;


import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;




@Entity
public class Account {
	
	public static final String SAVINGS="SB";
	public static final String CURRENT="CA";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	private String  acountType;
	private double balance;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdatedDate;
	private boolean active;
	
	
	@ManyToMany(targetEntity=Customer.class,cascade={CascadeType.MERGE,CascadeType.PERSIST})
	@JoinTable(name="customer_account",joinColumns=@JoinColumn(name="account_id",referencedColumnName="id"),
	inverseJoinColumns=@JoinColumn(name="customer_id",referencedColumnName="id"))
	private Set<Customer> customers;
	
	
	
	
	
	public Account() {
	
	}


	public Account(long id, String acountType, double balance, LocalDateTime creationDate, LocalDateTime lastUpdatedDate,
			boolean active) {
		super();
		this.id = id;
		this.acountType = acountType;
		this.balance = balance;
		this.creationDate = creationDate;
		this.lastUpdatedDate = lastUpdatedDate;
		this.active = active;
	}

	

	public Account( String acountType, double balance)
			 {
		super();
		
		this.acountType = acountType;
		this.balance = balance;
		this.creationDate = creationDate.now();
		this.lastUpdatedDate = lastUpdatedDate.now();
		this.active = false;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", acountType=" + acountType + ", balance=" + balance + ", creationDate="
				+ creationDate + ", lastUpdatedDate=" + lastUpdatedDate + ", active=" + active + "]";
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAcountType() {
		return acountType;
	}


	public void setAcountType(String acountType) {
		this.acountType = acountType;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public LocalDateTime getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}


	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}


	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	
	public Set<Customer> getCustomers() {
		return customers;
	}

}
