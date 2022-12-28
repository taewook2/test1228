package com.shop.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.service.AdmService;

@SpringBootTest
class UpdateTest {

	
	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		Adm ad = new Adm("1234","22222222",22222);
		try {
			service.modify(ad);
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
