package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class UpdateTest {

	
	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		Marker obj = new Marker(1414,"3333","3333");
		try {
			service.modify(obj);
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
