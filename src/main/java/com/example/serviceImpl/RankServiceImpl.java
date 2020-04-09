package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RankMapper;
import com.example.model.Rank;
import com.example.service.RankService;

@Service
public class RankServiceImpl implements RankService{
	@Autowired
	private RankMapper rankMapper;

	@Override
	public List<Rank> allRank() {
		return rankMapper.allRank();
	}

}
