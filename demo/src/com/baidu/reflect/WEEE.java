package com.baidu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import com.baidu.entity.Teacher;

public class WEEE {

	public static void main(String[] args) throws Exception {
		Teacher teacher = new Teacher();
		Teacher query = query(teacher);
		System.out.println(query.getName());
	}
	private static <T> T query(T t) throws  Exception {
		Class<? extends Object> class1 = t.getClass();
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			Type type = field.getGenericType();
		}
		return t;	
	}
}
