package com.shop.analysis;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Analysis;
import com.shop.service.AnalysisService;

@SpringBootTest
class InsertTest {

	
	@Autowired
	AnalysisService service;
	
	@Test
	void contextLoads() {
		List<Analysis> obj =null;
		try {
			System.out.println("OK");
			obj=service.getGsum();
			System.out.println("gsum");
			for(Analysis a:obj) {
				System.out.println(a);
			}
			obj=service.getMsum();
			System.out.println("msum");
			for(Analysis a:obj) {
				System.out.println(a);
			}
			obj=service.getMGsum();
			System.out.println("mgsum");
			for(Analysis a:obj) {
				System.out.println(a);
			}
			
			
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
