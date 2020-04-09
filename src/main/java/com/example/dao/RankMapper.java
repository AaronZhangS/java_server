package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Rank;

@Mapper
public interface RankMapper {
	
	/**
	 * 查询springrank表内容
	 */
	@Select("select * from springrank")
	List<Rank> allRank();
}
