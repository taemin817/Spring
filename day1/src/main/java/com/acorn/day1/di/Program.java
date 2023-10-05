package com.acorn.day1.di;

public class Program {
	
	// 의존성 dependency
	Calculator calculator;
	
	public Program() {}

	// 생성자주입 constructor injection
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	// 세터주입 setter injection
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public int addP(int a, int b) {
		int result;
		result = calculator.add(a, b);
		return result;
	}
}
