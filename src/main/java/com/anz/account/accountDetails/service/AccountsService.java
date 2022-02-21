package com.anz.account.accountDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.account.accountDetails.model.Account;
import com.anz.account.accountDetails.model.Transaction;
import com.anz.account.accountDetails.repository.AccountsRepository;

import lombok.Getter;

@Service
public class AccountsService {
	
	@Getter
	private final AccountsRepository accountsRepository;

	@Autowired
	public AccountsService(AccountsRepository accountsRepository) {
		this.accountsRepository = accountsRepository;
	}

	public List<Account> createAccount() {
		return accountsRepository.createAccount();
	}

	public List<Transaction> getTranscation(String accountId) {
		return accountsRepository.getTranscation(accountId);
	}

}
