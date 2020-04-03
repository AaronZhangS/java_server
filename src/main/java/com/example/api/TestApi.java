package com.example.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {

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
}
