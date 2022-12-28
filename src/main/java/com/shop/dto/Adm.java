package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Adm {
	
	private String id;
	private String pwd;
	private int lev;

}
