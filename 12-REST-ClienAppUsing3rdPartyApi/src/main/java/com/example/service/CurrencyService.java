package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyService {
	
	public String getCurrencyCost(String from,String to) {
		
		RestTemplate rt=new RestTemplate();
		String endPointUrl="3rd party will provide url in notebook teakLead for currency";
		ResponseEntity<String> response=
				rt.getForEntity(endPointUrl, String.class);
		
		if(response!=null && response.getStatusCode().value()==200) {
		    return response.getBody();
		}
		
		return null;
	}

}
