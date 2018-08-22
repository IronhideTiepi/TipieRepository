package com.baidu.fanxin;
package com.baidu.����;

import java.util.ArrayList;
import java.util.List;

import com.baidu.entity.Teacher;

public class Test {

	public static void main(String[] args) {
		List<Teacher> list = new ArrayList<Teacher>();
		Teacher teacher1 = new Teacher();
		teacher1.setAge(2);
		teacher1.setName("С��");
		Teacher teacher2 = new Teacher();
		teacher2.setAge(3);
		teacher2.setName("С��3");
		list.add(teacher1);
		list.add(teacher2);
		study(list);
	}

	private static <T> void study(List<T> t) {
	for (T t1 : t) {
		if(t1 instanceof Teacher) {
			int age = ((Teacher) t1).getAge();
			String name = ((Teacher) t1).getName();
			System.out.println(age);
			System.out.println(name);
		}
	}	
	}
}
