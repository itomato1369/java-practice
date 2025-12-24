package com.yedam.java.chap0501;
// package 이름

public class ReferenceCommonExample {
// public class 클래스 이름
	
	public static void main(String[] args) {
		// main 함수 
		/* SELECT COLUMN NAME FROM TABLE NAME */
		
		String msg = "Good, Morning";
		// 함수 사용시 이텔릭체로 된다
		boolean result = firstMethod();
		
		System.out.println(msg);
		System.out.println("result : " + result);
		

	}
	
	public static boolean firstMethod() {
		char v1 = 'A';
		
		if (v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		boolean v4 = true;
		return v4;
	}
	
	

}
