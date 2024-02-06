package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.CurrencyService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(Application.class, args);
		CurrencyService service = cntxt.getBean(CurrencyService.class);
		String currencyCost = service.getCurrencyCost("USD", "INR");
		System.out.println(currencyCost );
	}

}
