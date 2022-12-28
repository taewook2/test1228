package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Marker {
	
	private int id;
	private String title;
	private String target;
	private float lat;
	private float lng;
	private String img;
	private char loc;
	
	public Marker(int id, String title, String target) {
		this.id = id;
		this.title = title;
		this.target = target;
	}
	
	
	
	
}
