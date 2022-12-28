package com.shop.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class UpdateTest {

	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		Cart obj = new Cart(100,10);
		try {
			service.modify(obj);
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
