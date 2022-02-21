package com.anz.account.accountDetails.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Account {
	
	private String accountNumber;
	private String accountName;
	private String accountType;
	private Date balanceDate;
	private String currency;
	private BigDecimal availableBalance;
	public Account(String accountNumber, String accountName, String accountType, Date balanceDate, String currency,
			BigDecimal availableBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.availableBalance = availableBalance;
	}
	
	
	
	
	
	
	

}
