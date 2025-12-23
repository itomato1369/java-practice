package com.yedam.java.chap0401;

public class IfExample {

	public static void main(String[] args) {
		// if 문
		int score = 2;
		
		// if문 조건식이 참인 경우만 확인
		if (score >= 90) {
			System.out.println("점수가 90점 이상이면");
			System.out.println("A등급입니다");
		};
		
		// if ~ else 문 조건식이 참과 거짓 각각 확인
		if (score >= 60) {
			System.out.println("점수가 60점 이상이면");
			System.out.println("통과입니다");
		} else { // 위에 선언된 모든 조건식을 만족하지 않는 경우
			System.out.println("점수가 60점 미만이면");
			System.out.println("재수강입니다");
		};
		
        // if ~ else if ~ else 다중 조건문
		if (score >= 90) {
			System.out.println("과목 등급은 A입니다");
		} else if (score >= 80) {
			System.out.println("과목 등급은 B");
		} else if (score >= 70) {
			System.out.println("과목 등급은 C");
		} else if (score >= 60) {
			System.out.println("과목 등급은 D");
		} else {
			System.out.println("과목 등급은 E");
		};
		
		
		

		
		
		
	}
}
