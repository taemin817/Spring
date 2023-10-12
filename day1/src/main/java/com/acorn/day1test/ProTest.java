package com.acorn.day1test;

public class ProTest {

	public static void main(String[] args) {
		Cal c = new Acal();
		Pro p = new Pro();
		
		p.setCal(c);
		
		int result = p.addP(3, 2);
		System.out.println(result);
	}
}
