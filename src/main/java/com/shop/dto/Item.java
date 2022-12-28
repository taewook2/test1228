package com.shop.dto;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {

	private int id;
	private String name;
	private int price;
	private String imgname;
	private Date rdate;
	

}
