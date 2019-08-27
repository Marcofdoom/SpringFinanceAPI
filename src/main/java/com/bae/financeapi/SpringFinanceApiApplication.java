package com.bae.financeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableEncryptableProperties
@SpringBootApplication
public class SpringFinanceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFinanceApiApplication.class, args);
	}
}