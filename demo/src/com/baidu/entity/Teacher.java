package com.baidu.entity;

import com.baidu.inteface.ClassName;
import com.baidu.inteface.PersonName;

@ClassName(desc = "���Ǽ������ϵ�����")
public class Teacher {
	@PersonName(desc = "���Ǽ����ֶ�name�ϵ�����")
	private String name;
	@PersonName(desc = "���Ǽ����ֶ�age�ϵ�����")
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
