package com.acorn.day1.di;

public class ProgramTest1 {

	public static void main(String[] args) {
		
		Calculator c = new ACalculator();
		Program p = new Program();
		// setter를 통해 구현
		p.setCalculator(c);

		int result = p.addP(2, 5);
		System.out.println(result);

	}

}
