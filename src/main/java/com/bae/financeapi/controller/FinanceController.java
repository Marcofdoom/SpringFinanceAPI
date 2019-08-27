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

import com.bae.financeapi.domain.model.PeopleBankAccount;
import com.bae.financeapi.service.FinanceService;
import com.bae.financeapi.service.TransactionService;

@RestController
@RequestMapping("/finance")
public class FinanceController {

	private FinanceService financeService;

	private TransactionService transactionService;

	@Autowired
	public FinanceController(FinanceService financeService, TransactionService transactionService) {
		this.financeService = financeService;
		this.transactionService = transactionService;
	}

	@GetMapping("/find-all-accounts")
	public ResponseEntity<Object> findAllAccountsByIdentity(@RequestParam(value = "forenames") String forenames,
			@RequestParam(value = "surname") String surname, @RequestParam(value = "home-address") String homeAddress,
			@RequestParam(value = "date-of-birth") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfBirth) {

		PeopleBankAccount peopleBankAccount = new PeopleBankAccount();

		peopleBankAccount.setForenames(forenames);
		peopleBankAccount.setSurname(surname);
		peopleBankAccount.setHomeAddress(homeAddress);
		peopleBankAccount.setDateOfBirth(dateOfBirth);

		return new ResponseEntity<>(financeService.findAllAccountsByIdentity(peopleBankAccount), HttpStatus.OK);
	}

	@GetMapping("/find-all-transactions")
	public ResponseEntity<Object> findAllTransactionsByIdentity(
			@RequestParam(value = "account-number") String accountNumber) {
		return new ResponseEntity<>(transactionService.findAllTransactionsByIdentity(accountNumber), HttpStatus.OK);
	}
}