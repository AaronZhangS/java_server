package com.example.service;

import java.util.List;

import com.example.model.Rank;

public interface RankService {
	
	/**
	 * 查询springrank表内容
	 */
	List<Rank>	allRank();
}
