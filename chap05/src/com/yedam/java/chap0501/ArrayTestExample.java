package com.yedam.java.chap0501;

public class ArrayTestExample {

	public static void main(String[] args) {
		//   1, 4, 9, 2, 5 중 최대값, 최소값 구하기
		int[] test = {1, 4, 9, 2, 5};
		
		int max = test[0]; 
		int min = test[0];
		
		// 최대 index 값 length -1  0을 뺌 
		for (int i = 0; i <= test.length-1; i++) {
			int current = test[i];
			if (current > max) {
				max = current;
			}
			if (current < min) {
				min = current;
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
        // 2차원  배열 		
		// 테이블 행이 2 열이 3
		int[][] scores = new int[2][3];
		// 1차원 배열이 2개야
		// 배열 복사 = 깊은 복사
		// 향상된 for문 for of
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
