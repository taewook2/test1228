package com.shop.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	
	private int id;
	private String cust_id;
	private int item_id;
	private int cnt;
	private Date rdate;
	
	private String cust_name;
	private String item_name;
	private int item_price;
	private int total;
	private String imgname;
	
	
	public Cart(String cust_id, int item_id, int cnt) {
		this.cust_id = cust_id;
		this.item_id = item_id;
		this.cnt = cnt;
	}


	public Cart(int id, int cnt) {
		this.id = id;
		this.cnt = cnt;
	}
	
	
	
	

}
