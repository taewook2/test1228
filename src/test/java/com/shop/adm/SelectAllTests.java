package com.shop.adm;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Adm;
import com.shop.service.AdmService;

@SpringBootTest
class SelectAllTests {

	
	@Autowired
	AdmService service;
	
	@Test
	void contextLoads() {
		List<Adm> ad = null;
		try {
			ad= service.get();
			for(Adm c:ad) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
