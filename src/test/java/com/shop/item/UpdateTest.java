package com.shop.item;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class UpdateTest {

	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		Item item = new Item(1,"2",2,"2",new Date());
		try {
			service.modify(item);
			System.out.println("OK");			
		} catch (Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

}
