package com.anz.account.accountDetails.utility;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.anz.account.accountDetails.model.Account;
import com.anz.account.accountDetails.model.Transaction;

public class AccountUtils {
	
	private static List<Account> accountList= new ArrayList<>();
	private static List<Transaction> transactionList= new ArrayList<>();
	
	public static List<Account> getAccountList() {
		Account account1 = new Account("585309209", "SGDSavings726","Savings", new Date(), "SGD", new BigDecimal(84327.51));
		Account account2 = new Account("791066619", "AUSavings933","Savings", new Date(), "AUD", new BigDecimal(88005.93));
		Account account3 = new Account("321143048", "AUCurrent433","Current", new Date(), "AUD", new BigDecimal(33010.62));
		Account account4 = new Account("347786244", "AUSavings933","Savings", new Date(), "AUD", new BigDecimal(88005.93));
		accountList.add(account1);
		accountList.add(account2);
		accountList.add(account3);
		accountList.add(account4);
		return accountList;
		
	}
	
	public static List<Transaction> getTransactionList() {
		
		Transaction transaction1= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(95403.98), "Credit", null);
		Transaction transaction2= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(7497.82), "Credit", null);
		Transaction transaction3= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(5564.97), "Credit", null);
		Transaction transaction4= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(8136.18), "Credit", null);
		Transaction transaction5= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(9442.46), "Credit", null);
		Transaction transaction6= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(7614.45), "Credit", null);
		Transaction transaction7= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(3311.55), "Credit", null);
		Transaction transaction8= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(9186.09), "Credit", null);
		Transaction transaction9= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(1905.86), "Credit", null);
		Transaction transaction10= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(197.78), "Credit", null);
		Transaction transaction11= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(8403.49), "Credit", null);
		Transaction transaction12= new Transaction("585309209", "Current Account", new Date(), "SGD", null, new BigDecimal(8.33), "Credit", null);
		transactionList.add(transaction1);
		transactionList.add(transaction2);
		transactionList.add(transaction3);
		transactionList.add(transaction4);
		transactionList.add(transaction5);
		transactionList.add(transaction6);
		transactionList.add(transaction7);
		transactionList.add(transaction8);
		transactionList.add(transaction9);
		transactionList.add(transaction10);
		transactionList.add(transaction11);
		transactionList.add(transaction12);
		return transactionList;
	}

}
