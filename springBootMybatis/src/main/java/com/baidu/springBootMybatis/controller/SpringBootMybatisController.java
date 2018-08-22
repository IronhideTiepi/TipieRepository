package com.baidu.springBootMybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baidu.springBootMybatis.Service.SpringBootMybatisService;
import com.baidu.springBootMybatis.domain.User;
@RestController
@RequestMapping("/demo")
public class SpringBootMybatisController {

	@Autowired

	private SpringBootMybatisService springBootMybatisService;
	@GetMapping("/hello")
	public String queryDemo() {
		String result = springBootMybatisService.queryDemo();
		return result;
	}
	@GetMapping("/queryUser")
	public List<User> queryUser() {
		return springBootMybatisService.queryUser();
	}
}
