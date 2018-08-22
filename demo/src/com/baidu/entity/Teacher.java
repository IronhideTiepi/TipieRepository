package com.baidu.entity;

import com.baidu.inteface.ClassName;
import com.baidu.inteface.PersonName;

@ClassName(desc = "这是加在类上的描述")
public class Teacher {
	@PersonName(desc = "这是加在字段name上的描述")
	private String name;
	@PersonName(desc = "这是加在字段age上的描述")
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
