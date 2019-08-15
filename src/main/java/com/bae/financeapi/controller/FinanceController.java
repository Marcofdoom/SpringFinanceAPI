package com.bae.financeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bae.financeapi.service.FinanceService;

@RestController
@RequestMapping("/Fiance")
public class FinanceController {

	private FinanceService service;

	public FinanceController() {

	}

	@Autowired
	public FinanceController(FinanceService service) {
		this.service = service;
	}
}