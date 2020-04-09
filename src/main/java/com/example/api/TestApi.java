package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Rank;
import com.example.service.RankService;
import com.example.serviceImpl.RankServiceImpl;

@RestController
public class TestApi {

	@Autowired
	private RankServiceImpl rankServiceImpl;
	
	@RequestMapping("/")
    public String index(){
        System.out.println("hello jenkins");
        return "hello jenkins";
    }
	@RequestMapping("/test")
    public String test(){
        System.out.println("基于Docker安装Jenkins实现自动化构建、部署、测试、监控项目");
        return "基于Docker安装Jenkins实现自动化构建、部署、测试、监控项目";
    }
	@RequestMapping("/rank")
	public List<Rank> rank(){
		return rankServiceImpl.allRank();
	}
	@RequestMapping("/webhook")
	public String webhook(){
		return "自动构建";
	}
}
