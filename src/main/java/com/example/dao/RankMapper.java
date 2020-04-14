package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.model.Match;
import com.example.model.Rank;

@Mapper
public interface RankMapper {
	
	/**
	 * 查询springrank表内容
	 */
	@Select("select * from springrank order by paiming")
	List<Rank> allRank();
	
	/**
	 * 查询match表内容
	 */
	@Select("SELECT * FROM `match` ORDER BY rank")
	List<Match> allMatch();
}
