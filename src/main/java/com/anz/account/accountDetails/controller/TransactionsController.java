package com.anz.account.accountDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.account.accountDetails.exception.AccountDetailsNotFound;
import com.anz.account.accountDetails.model.Transaction;
import com.anz.account.accountDetails.service.AccountsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class TransactionsController {
	
	private AccountsService accountsService;

	@Autowired
	public TransactionsController(AccountsService accountsService) {
		this.accountsService = accountsService;
	}
	
	@GetMapping(path = "/transcation/{accountId}")
	public ResponseEntity<List<Transaction>> getTranscation(@PathVariable String accountId) {
		List<Transaction> transcationList= null;
		try {
			transcationList= accountsService.getTranscation(accountId);
			
		} catch (Exception e) {
			throw new AccountDetailsNotFound(e.getMessage());
		}

		return ResponseEntity.ok(transcationList);
	}

}
