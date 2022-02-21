package com.anz.account.accountDetails.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {
	
	private String message;
	private Date createDate;
	private String description;
	
	

}
