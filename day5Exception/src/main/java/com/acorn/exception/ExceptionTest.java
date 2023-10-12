package com.acorn.exception;

public class ExceptionTest {

	
	public static void main(String[] args) {
		ExceptionTest ext = new ExceptionTest();
		try {
			ext.method();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("나머지 처리");
		}
		System.out.println("정상 종료");
	}
	
	public void method() throws Exception {
		// 조건
		try {
			throw new Exception();	// 예외발생코드
		} catch (Exception ext) {
			System.out.println("예외 상황 인신하고 적절한 코드를 실행");
			throw ext;
		}
	}
}
