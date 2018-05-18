package com.web;

import org.springframework.web.client.RestTemplate;

public class DeleteMethod {
	public static void main(String[] args) {
		RestTemplate template=new RestTemplate();
		String url="http://localhost:2022/clear?driverId=4";
		template.delete(url);
	}

}
