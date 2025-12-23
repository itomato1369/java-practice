package com.yedam.java.chp0202;

public class CharExample {

	public static void main(String[] args) {
		// char : 유니코드
		int val = 65;
		char c1 = 65;
		
		System.out.println(val);
		// 유니코드 65 대문자 A를 출력
		System.out.println(c1 + val);
		
		// char은 자동 타입 변환을 할 수 없음
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
		// int 내부에서 C가 아닌 숫자로 인식 출력은 숫자
		int v2 = 'C';
		// char은 똑같이 내부에서 숫자로 인식하지만 출력은 문자 char의 리터럴만 ''
		// 2글자를 저장할 수 없음 유니코드에 존재하지 않음
		// char은 글자 / 문자 하나
		char c3 = '가';
		System.out.println(v2);
		System.out.println(c3);
		
		// 문자열을 다룸 String 
		String str1 = "CA";
		System.out.println(str1);
		char[] cAry = str1.toCharArray();
		System.out.println(cAry[1]);
		
		// 실수는 double이 초기값 float은 뒤에 F
		
		// 논리타입 초기값 False
		
	}

}






