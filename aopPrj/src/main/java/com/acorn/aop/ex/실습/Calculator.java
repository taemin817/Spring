package com.acorn.aop.ex.실습;

public class Calculator {

	public void add(int num1, int num2) {
		
		// 시작 전
		//long start = System.currentTimeMillis();
		//int result = num1+num2;
		//long end = System.currentTimeMillis();
		
		//System.out.println("수행시간 : " + (end-start));
		//return result;
		
		System.out.println("add");
	}
	
	public void sub(int num1, int num2) {
		//int result = num1-num2;
		//return result;
		
		System.out.println("sub");
	}
	
	

}
