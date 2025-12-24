package com.yedam.java.chap0501;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 배열복사
		int[] first = {1, 2, 3};
		// 얕은 복사 / 공유
		int[] second = first;
		second[1] = 10;
		System.out.println(first[1]);
		
		// 깊은 복사
		// 객체를 분리
		int[] third = new int[3];
		for (int i = 0; i < first.length; i++) {
			third[i] = first[i];
		}
//		third[1] = 1234;
//		System.out.println(first[1]);
		System.out.println(third[1]);
         
		int[] copyAry = new int[10];
		// 원본 배열, 몇 번째 인덱스 부터 복사, 복사본, 5번째 인덱스 부터 채우겠다, 맨뒤가 length 개수  
		System.arraycopy(first, 0, copyAry, 5, 2);
		
		// 향상된 for문
		// of 대신 :
		for (int val : copyAry) {
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
