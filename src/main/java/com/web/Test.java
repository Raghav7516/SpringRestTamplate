package com.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test {
	public static void main(String[] args) {
		RestTemplate tamplate=new RestTemplate();
		String url="http://localhost:2022/";
		ResponseEntity<String> message=tamplate.getForEntity(url, String.class);
		String s=message.getBody();
		System.out.println(s);

		
	}

}
