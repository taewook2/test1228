package com.shop.item;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shop.dto.Item;
import com.shop.service.ItemService;

@SpringBootTest
class SearchTests {

	
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		List<Item> items = null;
		try {
			items= service.searchItem("바");
			for(Item c:items) {
				System.out.println(c);
			}
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println("Fail");
		}
		
	}

}
