package com.shop.adm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.service.AdmService;

@SpringBootTest
class InsertTest {

	
	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		Adm adm =new Adm("1234","pwd1204",123);
		try {
			service.register(adm);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
