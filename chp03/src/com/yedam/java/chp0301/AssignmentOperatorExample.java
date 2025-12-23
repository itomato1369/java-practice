package com.yedam.java.chp0301;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 복합대입연산자 중 산술연산자와 결합한 형태
		// +=, -=, *=, /=, %=　1 산술연산자 2 대입연산자 순서
		
//		int result = 10;
//		result += 10;
//		// 1 result + 10
//		// 2 result = 20
//		// result = result + 10;
//		System.out.println("result = " + result);
//		
//		result -= 5;
//		System.out.println("result = " + result);
//		
//		result *= 3;
//		System.out.println("result = " + result);
//		
//		result /= 5;
//		System.out.println("result = " + result);
//		
//		result %= 3;
//		System.out.println("result = " + result);
        
		
		// for 문 1반복횟수 2 무한루프에 빠지지 않음
		// 정수 1 ~ 10 까지 출력
		// 변수를 선언하는 부분만 다름
//		for (int i = 0; i < 10; i++) {}
		
		// 내림차순
//		for (int i = 10; i > 0; i--) {
//			System.out.println(i);
//		}
		
		// 실수 0.1 ~ 1.0까지 출력
		// 실수는 이렇게 못 맞춤
		for (float i = 0.1f; i < 1.0f; i+=0.1f) {
			System.out.println(i);
		}
		
	} 

}
