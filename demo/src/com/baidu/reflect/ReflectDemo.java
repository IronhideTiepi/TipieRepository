package com.baidu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import com.baidu.entity.Student;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		
		Class<? extends Student> class1 = Student.class;
		Constructor<? extends Student> constructor = class1.getDeclaredConstructor(String.class,String.class,String.class);
		Student student = constructor.newInstance("–°∫Ï","22","∆Ø¡¡");
		Field[] declaredFields = class1.getDeclaredFields();
		for (Field field : declaredFields) {
			field.setAccessible(true);
			Object object = field.get(student);
			String name = field.getName();
			System.out.println(name);
			
			System.out.println(object);
		}
	}
}
