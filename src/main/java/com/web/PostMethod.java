package com.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PostMethod {
	public static void main(String[] args) {
		RestTemplate template=new RestTemplate();
		String url="http://localhost:2022/registration";
		TruckDriverDetails driver=new TruckDriverDetails();
		driver.setTruckDriverAddress("BPL");
		driver.setTruckDriverContact("952");
		driver.setTruckDriverName("rajeev");
		ResponseEntity<String> message=template.postForEntity(url, driver, String.class);
		String s=message.getBody();
		System.out.println(s);

	}

}
