package com.baidu.springBootMybatis.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.springBootMybatis.domain.User;
import com.baidu.springBootMybatis.mapper.UserMapper;

@Service
public class SpringBootMybatisService {

	@Autowired
	private UserMapper userMapper;
	public String queryDemo() {
		
		return "hello,world";
	}

	public List<User> queryUser() {
		List<User> user = userMapper.queryUser();
		System.out.println("返回数据");
		return user;
	}

}
