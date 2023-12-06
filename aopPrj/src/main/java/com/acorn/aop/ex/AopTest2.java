package com.acorn.aop.ex;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class MyClass2{
	  public void aaa() {		  
		  System.out.println( "aaa");		 
	  }
	  
	  public void aab() {
		//  System.out.println("hi");
		  System.out.println( "aab");
		//  System.out.println("bye");
	  }
	  
	  public void bbb() {
		  System.out.println( "bbb");
	  }	  
}


class MyAdvice2{
	 
	Pattern p = Pattern.compile("a.*");
	
	public boolean matches( Method m) {
		 Matcher matcher  = p.matcher(m.getName());
		 return matcher.matches();
	}	
	
	
	 public Object invoke( Method m  ,  Object obj ,  Object...args ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		 //
		 if(matches(m))
		   System.out.println("before hi");
		 
		 Object result  = m.invoke(obj, args);
		 //
		 if( matches(m))
			 System.out.println("after bye");
		 
		 return result;		 
	 }
	
	
}


public class AopTest2 {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 
		  MyClass2  my = new MyClass2();
		
		  my.aaa();
		  my.aab();
		  my.bbb(); 
		  
		
		  // 매서드를 직접 호출하는것이 아니라 
		  // advice에게 위임한다
		  // 매서드를 호출하기 전 후에 부가기능의 코드를 추가 할 수 있다.
		  
		  
		  Class clazz  = MyClass2.class;
		  Method[] methods = clazz.getDeclaredMethods();
		  MyClass2 obj =(MyClass2) clazz.newInstance();		  
		  
		  MyAdvice2 advice = new MyAdvice2();
		  for( Method m : methods) {
			  advice.invoke(m, obj); 
		  }
		  
		  
		   

	}

}
