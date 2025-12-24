package com.yedam.java.chap0501;

public class ArrayCommonExample {

	public static void main(String[] args) {
		// 배열은 참조타입
		// 배열 선언 및 생성
		int [] intAray = null;
		
		intAray = new int[] {1, 3, 4}; // 값을 가지고 있는 배열 값이 있으니 배열 크기 지정 못함
		// 배열을 초기화 시킬 때 length 길이 변경 못 함
		System.out.println("길이:" + intAray.length);
		
		for (int i = 0; i < intAray.length; i++) {
			System.out.println(i + "=" +intAray[i]);
		}
		
		intAray = new int[5]; // 크기만 지정된 배열
		for (int i = 0; i < intAray.length; i++) {
			System.out.println(i + "=" +intAray[i]);	
		}
		
	
		for (int i = 0; i < intAray.length; i++) {
			intAray[i] = i * 10;
		}
		for (int i = 0; i < intAray.length; i++) {
			System.out.println(i + " " + intAray[i]);
			
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
