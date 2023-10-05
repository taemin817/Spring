package com.acorn.test;

import org.springframework.stereotype.Component;

@Component
public class Pro {
	
	Cal cal;
	
	public int addP(int a, int b) {
		int result;
		result = cal.add(a, b);
		return result;
	}
	
	public int subP(int a, int b) {
		int result;
		result = cal.sub(a, b);
		return result;
	}
	
	public int multipleP(int a, int b) {
		int result;
		result = cal.mutiple(a, b);
		return result;
	}
	public int divideP(int a, int b) {
		int result;
		result = cal.divide(a, b);
		return result;
	}
	
	public Pro() { }

	public Pro(Cal cal) {
		super();
		this.cal = cal;
	}

	public Cal getCal() {
		return cal;
	}

	public void setCal(Cal cal) {
		this.cal = cal;
	}
	
	
	
}
