package com.anz.account.accountDetails.repository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.anz.account.accountDetails.model.Account;
import com.anz.account.accountDetails.model.Transaction;
import com.anz.account.accountDetails.utility.AccountUtils;

@Repository
public class AccountsRepository {
	
	public List<Account> createAccount() {
		return AccountUtils.getAccountList();
	}

	public List<Transaction> getTranscation(String accountId) {
		List<Transaction> trancastions = AccountUtils.getTransactionList().stream().filter(x->x.getAccountNumber().
				equals(accountId)).collect(Collectors.toList());
		return trancastions;
	}

}
