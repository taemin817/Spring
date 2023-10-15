package com.acorn.exception;

public class Extest {
	public int add(int a, int b) throws Exception {
		if(a<0||b<0) {
			throw new Exception("0보다 커야함");
		}
		return a+b;
	}
	
	
	public static void main(String[] args) throws Exception {
		Extest ex = new Extest();
		try {
			int result = ex.add(4, -9);
			// int result = ex.add(3, 8);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("음수임");
			//e.printStackTrace();
			throw e;
		}
		System.out.println("정상 종료");
	}
}
