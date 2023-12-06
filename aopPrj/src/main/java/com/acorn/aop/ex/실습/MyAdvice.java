package com.acorn.aop.ex.실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 위임객체 만들기
// 1.클래스 작성
public class MyAdvice {

	public Object invoke(Method method , Object obj, Object ...objects) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		System.out.println("hi");
		
		Object result = method.invoke(obj, objects);
		
		System.out.println("bye");
		return objects;
		
	}
}