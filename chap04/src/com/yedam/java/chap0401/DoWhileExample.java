package com.yedam.java.chap0401;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		
		do {
			inputData = scanner.nextLine();
			System.out.println("입력한 문자열 : " + inputData);
		} while(!inputData.equals("q"));
		
		scanner.close();
		
		
//		// while 무한 루프
//		while (true) {
//			inputData = scanner1.nextLine();
//			System.out.printf("입력된 문자열 : %s \n", inputData);
//			
//			if (inputData.equals("q")) {
//				// 소문자 q가 입력되는 경우 중단
//				// while을 빠져나옴 break
//				break;
//			}
//		}
//		scanner1.close();
		
		
		
		
		
		
	}

}
