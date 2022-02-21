package com.anz.account.accountDetails.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class Transaction {
	
	private String accountNumber;
	private String accountName;
	private Date valueDate;
	private String currency;
	private BigDecimal debitAmount;
	private BigDecimal creditAccount;
	private String debitOrCredit;
	private String transcationNarrative;
	
	public Transaction(String accountNumber, String accountName, Date valueDate, String currency,
			BigDecimal debitAmount, BigDecimal creditAccount, String debitOrCredit, String transcationNarrative) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAccount = creditAccount;
		this.debitOrCredit = debitOrCredit;
		this.transcationNarrative = transcationNarrative;
	}
	
	

}
