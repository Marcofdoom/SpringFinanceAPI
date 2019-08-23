package com.bae.financeapi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bae.financeapi.model.PeopleBankAccount;
import com.bae.financeapi.service.FinanceService;
import com.bae.financeapi.service.TransactionService;

@RestController
@RequestMapping("/Finance")
public class FinanceController {

	private FinanceService service;

	private TransactionService transactionService;

	public FinanceController() {

	}

	@Autowired
	public FinanceController(FinanceService service, TransactionService transactionService) {
		this.service = service;
		this.transactionService = transactionService;

	}

	@GetMapping("/getFinance")
	public ResponseEntity<Object> getFinance(@RequestParam(value = "forenames", required = false) String forenames,
			@RequestParam(value = "surname", required = false) String surname,
			@RequestParam(value = "homeAddress", required = false) String homeAddress,
			@RequestParam(value = "dateOfBirth", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth) {

		PeopleBankAccount peopleBankAccountEntity = new PeopleBankAccount();

		peopleBankAccountEntity.setForenames(forenames);
		peopleBankAccountEntity.setSurname(surname);
		peopleBankAccountEntity.setHomeAddress(homeAddress);
		peopleBankAccountEntity.setDateOfBirth(dateOfBirth);

		return new ResponseEntity<>(service.getFinance(peopleBankAccountEntity), HttpStatus.OK);
	}

	@GetMapping("/getTransactions")
	public ResponseEntity<Object> getTransactionsDTO(
			@RequestParam(value = "accountNumber", required = false) String accountNumber) {
		return new ResponseEntity<>(transactionService.getTransactionsDTO(accountNumber), HttpStatus.OK);
	}
}