package com.web;

import org.springframework.web.client.RestTemplate;

public class PutMethod {
	public static void main(String[] args) {
		
	RestTemplate template=new RestTemplate();
	String url="http://localhost:2022/edit";
	TruckDriverDetails driver=new TruckDriverDetails();
	driver.setTruckDriverId(7);
	driver.setTruckDriverAddress("JBL");
	driver.setTruckDriverContact("952");
	driver.setTruckDriverName("rajeev");
	template.put(url, driver);
	}
}
