package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class SelectTests {

	
	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		Marker obj = null;
		try {
			obj = service.get(1414);
			System.out.println(obj);
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
