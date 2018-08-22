package com.baidu.duotai;

import com.baidu.inteface.Test;

public abstract class TestDuotai {
	public  abstract void test();
}

class Propragram extends Test���� {

	@Override
	public void test() {
	System.out.println("�ô���ı�ʱ��");
		
	}
}
class Engineer extends Test����{

	@Override
	public void test() {
		System.out.println("�����ı�����");
	}
	
}
