package com.baidu.inteface;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class IntefaceUtils {

	public static final List<ColumnData>  analysis(Object obj) throws IllegalArgumentException, IllegalAccessException, Exception {
		String ClassDesc = null;
		if(obj == null) {
			return null;
		}
		Class<? extends Object> class1 = obj.getClass();
		boolean annotationPresent = class1.isAnnotationPresent(ClassName.class);
		if(annotationPresent) {
			ClassName annotation = class1.getAnnotation(ClassName.class);
			String desc = annotation.desc();
			ClassDesc = desc;
		}
		Field[] fields = class1.getDeclaredFields();
		List<ColumnData> list = new ArrayList<>();
		for (Field field : fields) {
			ColumnData columnData = new ColumnData();
			boolean present = field.isAnnotationPresent(PersonName.class);
			if(present) {
				 PersonName annotation = field.getAnnotation(PersonName.class);
				 String desc = annotation.desc();
				 field.setAccessible(true);
				 String name = field.getName();
				  Object object = field.get(obj);
				  String valueOf = String.valueOf(object);
				 columnData.setClassName(ClassDesc);
				 columnData.setDesc(desc);
				 columnData.setValue(valueOf);
				 columnData.setName(name);
				 list.add(columnData);
			}
		}
		return list;	
	}
}
