package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
		RestTemplate rt=new RestTemplate();
		
		String url="http://localhost:8082/welcomeMsg";
	
		//Using getForEntity  
		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);
		
		int statusCode = responseEntity.getStatusCode().value();
		
		if(statusCode==200) {
			System.out.println(responseEntity.getBody());
		}
		// Using getForObject
		String string = rt.getForObject(url, String.class);
		System.out.println(string);
	}

	
	
	
}
