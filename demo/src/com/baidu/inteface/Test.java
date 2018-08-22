package com.baidu.inteface;

import java.util.List;

import com.baidu.entity.Teacher;

public class Test {
public static void main(String[] args) throws Exception {
	Teacher teacher = new Teacher();
	teacher.setAge(18);
	teacher.setName("ะกร๗");
	List<ColumnData> analysis = IntefaceUtils.analysis(teacher);
	for (ColumnData columnData : analysis) {
		System.out.println(columnData);
	}
}
}
