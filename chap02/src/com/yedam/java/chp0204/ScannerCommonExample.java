package com.yedam.java.chp0204;
// ctrl + shift + o
// 내장 모듈 JDK 내장 라이브러리
import java.util.Scanner;

public class ScannerCommonExample {

	public static void main(String[] args) {
		// 표준입력장치(System.in/키보드)를 통해 값을 읽어들이는 객체
		Scanner scanner1 = new Scanner(System.in);
		
		// nextLine(); 읽어들이는 method
		// 콘솔창에 값을 입력후 enter 누르기 전 까지 반응없음
		String inputData = scanner1.nextLine();
		System.out.println(inputData);
		
		System.out.println("프로그램종료");
		scanner1.close();
		
		
	}

}
