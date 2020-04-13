package com.example.api;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Rank;
import com.example.serviceImpl.RankServiceImpl;

@RestController
@CrossOrigin
public class TestApi {

	@Autowired
	private RankServiceImpl rankServiceImpl;
	
	@RequestMapping("/")
	@CrossOrigin
    public String index(){
        System.out.println("hello jenkins");
        return "hello jenkins";
    }
	@RequestMapping("/test")
	@CrossOrigin
    public String test(){
        System.out.println("基于Docker安装Jenkins实现自动化构建、部署、测试、监控项目");
        return "基于Docker安装Jenkins实现自动化构建、部署、测试、监控项目";
    }
	@RequestMapping("/rank")
	@CrossOrigin
	public List<Rank> rank(){
		List<Rank> defultlist = rankServiceImpl.allRank();
		for(int i = 0;i < defultlist.size();i++) {
			for(int j = 0;j < defultlist.size()-i-1;j++) {
				if(Integer.parseInt(defultlist.get(j).getPaiming())>Integer.parseInt(defultlist.get(j+1).getPaiming())) {
					defultlist.set(j, defultlist.get(j+1));
					defultlist.set(j+1, defultlist.get(j));
				}
			}
		}
		for(int i = 0;i < defultlist.size();i++) {
			defultlist.get(i).setId(i+1);
		}
		return defultlist;
	}
	@RequestMapping("/webhook")
	@CrossOrigin
	public String webhook(){
		return "自动构建";
	}
}
