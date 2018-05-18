package com.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GetMethod {
	public static void main(String[] args) {
		RestTemplate tamplate=new RestTemplate();
		String url="http://10.10.0.98:2022/truck/1";
		ResponseEntity<String> details=tamplate.getForEntity(url, String.class);
		String driver=details.getBody();
		System.out.println(driver);
	}

}
