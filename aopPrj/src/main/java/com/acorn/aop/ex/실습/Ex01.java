package com.acorn.aop.ex.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex01 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// Calculator calculator = new Calculator();
		Class clazz = Calculator.class;

		// int result = calculator.add(5, 3);
		// System.out.println(result);

		Method[] methods = clazz.getDeclaredMethods();
		Calculator c = (Calculator) clazz.newInstance();

		MyAdvice advice = new MyAdvice();

		for (Method m : methods) {
			// advice.invoke(m, c);
		}

	}
}
