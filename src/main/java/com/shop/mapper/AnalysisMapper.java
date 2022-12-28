package com.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.shop.dto.Analysis;

@Repository
@Mapper
public interface AnalysisMapper {
	public List<Analysis> getGsum() throws Exception;
	public List<Analysis> getMsum() throws Exception;
	public List<Analysis> getMGsum() throws Exception;

}
