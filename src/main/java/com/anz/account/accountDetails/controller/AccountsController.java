package com.anz.account.accountDetails.controller;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.anz.account.accountDetails.exception.AccountDetailsNotFound;
import com.anz.account.accountDetails.exception.ExceptionResponse;
import com.anz.account.accountDetails.model.Account;
import com.anz.account.accountDetails.model.Transaction;
import com.anz.account.accountDetails.service.AccountsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class AccountsController {
	
	private AccountsService accountsService;

	@Autowired
	public AccountsController(AccountsService accountsService) {
		this.accountsService = accountsService;
	}

	@GetMapping(path = "/accounts")
	public ResponseEntity<List<Account>> createAccount() {
		List<Account> accountList= null;
		try {
			accountList= accountsService.createAccount();
			
		} catch (Exception e) {
			throw new AccountDetailsNotFound(e.getMessage());
		}

		return ResponseEntity.ok(accountList);
	}
	
	@ExceptionHandler(AccountDetailsNotFound.class)
	public ResponseEntity<ExceptionResponse> accountDetailsNotFound(WebRequest we, Exception e){
		ExceptionResponse exceptionResponse =  new ExceptionResponse(e.getMessage() , new Date(), we.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

}
