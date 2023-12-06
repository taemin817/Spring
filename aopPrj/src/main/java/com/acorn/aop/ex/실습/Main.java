package com.acorn.aop.ex.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Customer customer = new Customer("박태민", 500);

		customer.upPoint(1000); // 객체정보, // upPoint( customer, 1000) ;
		customer.dispPoint();

		Customer customer2 = new Customer("민지님", 5000);
		customer2.upPoint(5000);
		customer2.dispPoint();

		Class b = customer.getClass();
		Method[] methods = b.getDeclaredMethods();

		System.out.println("매서드 정보");
		for (Method method : methods) {
			System.out.println(method.getName());

			method.invoke(customer, 1000);

		}

	}

}
