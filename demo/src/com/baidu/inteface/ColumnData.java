package com.baidu.inteface;

public class ColumnData {
	private String ClassName;
	private String value;
	private String desc;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}
	
	public String getClassName() {
		return ClassName;
	}

	public void setClassName(String className) {
		ClassName = className;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "ColumnData [ClassName=" + ClassName + ", value=" + value + ", desc=" + desc + ", name=" + name + "]";
	}
	
	
}
