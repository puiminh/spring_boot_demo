package com.example.payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication //meta-annotation that pulls in component scanning, autoconfiguration, and property support
public class PayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApplication.class, args);
	}

}
