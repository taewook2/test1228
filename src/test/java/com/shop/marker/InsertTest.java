package com.shop.marker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class InsertTest {

	
	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		Marker marker =new Marker(1414,"aaaa","bbb", 3.14f,5.4f,"eee",'a');
		try {
			service.register(marker);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
