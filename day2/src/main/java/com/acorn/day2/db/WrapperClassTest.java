package com.acorn.day2.db;

public class WrapperClassTest {

	public static void main(String[] args) {
	// 걍 수업 중에 질문나와서 만든거니까 신경쓰지마
		
	int a = 3;
	
	Integer i1 = a;		// 오토박싱,  기본형은 자동으로 만들어줌
	Integer i2 = new Integer(a);
	
	int result = i2.intValue();		// unboxing
	System.out.println(i1);
	System.out.println(i2.intValue());
	
	Integer i3 = 9;
	Integer i4 = 10;
	
	int result2 = i3 + i4;
	System.out.println(result2);
	
	}

}
