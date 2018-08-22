package com.baidu.springBootMybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baidu.springBootMybatis.domain.User;

@Mapper
public interface UserMapper {

	List<User> queryUser();

}
