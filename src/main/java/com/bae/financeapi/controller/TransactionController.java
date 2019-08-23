package com.bae.financeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bae.financeapi.service.TransactionService;

@RestController
@RequestMapping("/Finance")
public class TransactionController {

	private TransactionService service;

	public TransactionController() {

	}

	@Autowired
	public TransactionController(TransactionService service) {
		this.service = service;

	}

	@GetMapping("/getTransactions")
	public ResponseEntity<Object> getTransactionsDTO(
			@RequestParam(value = "accountNumber", required = false) String accountNumber) {
		return new ResponseEntity<>(service.getTransactionsDTO(accountNumber), HttpStatus.OK);
	}
}