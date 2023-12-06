package com.acorn.aop.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringAOPEx {

	public static void main(String[] args) {

		// ApplicationContext ac = new
		// GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");

		// MyCalculator cal = (MyCalculator) ac.getBean("myCalculator");
		// cal.add(5, 3);
		// cal.sub(5, 3);
		// System.out.println(cal.test()); //3

		ApplicationContext ac = new GenericXmlApplicationContext(
				"file:src/main/webapp/WEB-INF/spring/**/root-context.xml");

		MyCalculator cal = (MyCalculator) ac.getBean("myCalculator");
		cal.add(5, 3);
		cal.sub(5, 3);

	}

}
