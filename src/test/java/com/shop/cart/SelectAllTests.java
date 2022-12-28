package com.shop.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Cart;
import com.shop.service.CartService;

@SpringBootTest
class SelectAllTests {

	
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<Cart> ojb = null;
		try {
			ojb= service.get();
			for(Cart c:ojb) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
