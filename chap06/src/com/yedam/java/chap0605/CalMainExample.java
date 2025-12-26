package com.yedam.java.chap0605;

public class CalMainExample {
         // 클래스 타입 변수명
	public static void main(String[] args) {
		// static 정적 멤버 로 선언하면 new 연산자 없어도 됨
		System.out.println("PI : " + Calculator.pi);
		int result = Calculator.plus(10, 5);
		System.out.println("+" + result);
		
		result = Calculator.minus(9, 4);
		System.out.println("- " + result);

		Calculator.pi = 3.1;
		System.out.println(Calculator.pi);
		
	}
}
