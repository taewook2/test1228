package com.shop.marker;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Marker;
import com.shop.service.MarkerService;

@SpringBootTest
class SelectAllTests {

	
	@Autowired
	MarkerService service;
	
	@Test
	void contextLoads() {
		List<Marker> obj = null;
		try {
			obj= service.get();
			for(Marker c:obj) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
