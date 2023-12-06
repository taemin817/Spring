package com.acorn.aop.ex.실습;

import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Customer {
	
	String name;
	int point ;	
	
	//  public void upPoint(  Customner  this  ,int  up) {              
	public void upPoint(  int  up) {
		 this.point += up;
	}	
	
	
	
	public Customer( String name, int point) {
		this.name   =name;
		this.point  = point;		
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void dispPoint() {
		System.out.println( point);
	}
	

}



//인스턴스변수는  기본값 초기화 