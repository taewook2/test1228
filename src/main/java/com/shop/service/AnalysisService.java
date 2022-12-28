package com.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.dto.Analysis;
import com.shop.mapper.AnalysisMapper;

@Service
public class AnalysisService {
	@Autowired
	AnalysisMapper mapper;
	
	public List<Analysis> getGsum() throws Exception{
		return mapper.getGsum();
	}
	public List<Analysis> getMsum() throws Exception{
	 	return mapper.getMsum();
	}
	public List<Analysis> getMGsum() throws Exception{
		return mapper.getMGsum();
	}
	
	

}
