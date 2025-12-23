package com.yedam.java.chp0203;

public class StringPromotionExample {

	public static void main(String[] args) {
		// + 연산 문자열이 섞일 경우 기본타입을 문자열로 자동변환
		// String.valueOf(); 문자열로 변환
		String str1 = String.valueOf(1 + 2 + 3);
		str1 = 1 + 2 + 3 + "";       // "6"
		String str2 = 1 + 2 + "3";   // "33"
		String str3 = 1 + "2" + 3;   // "123"
		String str4 = "1" + 2 + 3;   // "123"
		String str5 = "1" + (2 + 3); // "15"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		// 강제타입변환 각 타입별 메서드 사용 
		// 정수byte, short, long, char, int 실수float, double 논리boolean
		// Java 는 타입별로 method
		int val1 = Integer.parseInt("1234");
		double val2 = Double.parseDouble("2.5");
		double result = val1 + val2;
		System.out.println(result);
		
		// system 실행되는 pc out 출력 in 입력
        // %d 정수 %.2f 실수 소수점이하 2자리 %s 문자열
	}

}
