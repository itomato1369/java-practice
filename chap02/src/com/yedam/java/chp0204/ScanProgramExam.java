package com.yedam.java.chp0204;

import java.util.Scanner;

public class ScanProgramExam {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		String inputData = null;
		
		
		// while 무한 루프
		while (true) {
			inputData = scanner1.nextLine();
			System.out.printf("입력된 문자열 : %s \n", inputData);
			
			if (inputData.equals("q")) {
				// 소문자 q가 입력되는 경우 중단
				// while을 빠져나옴 break
				break;
			}
		}
		scanner1.close();
		
		double value = 2e-3;
		System.out.println(value);
		
		boolean stop = false;
		if (stop) {
		  System.out.println("멈춥니다");
		} else {
		  System.out.println("출발합니다");
		}
		
//		byte byteValue = 10;
//		char charValue = 'A';
//		
//		int intValue = byteValue;
//		int intValue1 = charValue;
//		short shortValue = charValue;
//		double doubleValue = byteValue;
		
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		
//		double var = (double)intValue;
//		byte var1 = (byte)intValue;
//		int var2 = (int)doubleValue;
//		char var3 = (char)strValue;
		
//		byte byteValue = 10;
//		float floatValue = 2.5F;
//		double doubleValue = 2.5;
//		
//		byte result = byteValue + byteValue;
//		
		
//		short s1 = 1;
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		short result = (short)(s1 + s2);
		
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result = (int)(var1 + var2);
//		System.out.println(result);
//		
//		char c1 = 'a';
//		char c2 = 'a' + 1;
//		System.out.println(c2);
//		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		// double에 맞춰서 자동 타입변환
		String var4 = "3.9";
		int result = (int)(var1 + var2 + var3) + (int)Float.parseFloat(var4);
		int result1 = (int)(var1 + var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		System.out.println(result1);

	}

}
