package com.tka.service;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	double amount;
	
	public Account() {
		
	}
	
	
	public void deposit() {
		System.out.println("Amount is Deposited");
	}
	
	
	public void withdraw() {
		System.out.println("Amount is withdraw");
	}
	
	

	public Account(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	

}
