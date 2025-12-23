package com.yedam.java.chp0201;

public class VariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		   변수 선언 및 사용
		   int = 정수 값
		*/
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		
		
		/* 
		   변수 사용범위 scope 블록단위
		   
		*/
		int v1 = 15;
		if (v1 > 10) {
			int v2 = 0;
			v2 = v1 - 10;
		}
		int v2 = 1;
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
		
		/* 
		   기본타입 정수 = 0; 실수(소수점) = 0.0; 논리(True or False) = False;
		   byte    = 파일 읽고 통신하기 위함
		   char    = 글자를 저장하기 위해 음수가 될 수 없음 문자 유니코드(알파벳 이외) ASCII코드(알파벳)
		   int     = 숫자의 기본타입
		   long    = 매우 큰 숫자, 금융권 회계
		   
		   literal = 변수가 가지고 있는 값 직접 입력된 값 int a(변수) = 10(리터럴);
		   
		*/
		
		
	}

}
