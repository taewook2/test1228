package com.shop.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CustService;

@SpringBootTest
class CartSelectAllTests {

	
	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {
		List<Cart> obj =null;
		try {
			obj=service.myCart("100");
			for(Cart c:obj) {
				System.out.println("ok");
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
