package com.baidu.reflect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.baidu.entity.Teacher;

public class Testjdk {
	public static void main(String[] args) {
	List<Teacher> list = new ArrayList<Teacher>();
	Random random = new Random();
	for (int i = 4; i >=0; i--) {
		Teacher teacher = new Teacher();
		int nextInt = random.nextInt(10);
		System.out.println(nextInt);
		teacher.setAge(nextInt);
		teacher.setName("Ãû×Ö"+i);
		list.add(teacher);
	}
	System.out.println("+++++++++++++");
	list.sort(Comparator.comparing(teacher -> teacher.getAge()));
	for (Teacher teacher1 : list) {
		System.out.println(teacher1.getAge());
	}
	}
}
