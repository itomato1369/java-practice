package com.yedam.java.chap0401;

public class BreakContinueExample {

	public static void main(String[] args) {
		// continue 다음으로 보낸다
//		for (int i = 1; i < 10; i++) {
//			if (i % 2 == 1) continue;
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, (i * j));
//			}
//			System.out.println("-----------------------");
//		}
//        
//		// 중첩 반복문에서 break문;
//		// 소문작 g일 경우 반복문 종료
//		for (char upper = 'A'; upper <= 'Z'; upper++) {
//			boolean isExited = false;
//			
//			for (char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if (lower == 'g') {
//					isExited = true;
//					break;
//				}
//			}
//			if (isExited) break;
//		}
//		
//		System.out.println("------------------------------");
//		// 레이블 
//		// for 문을 사용할 때만
//		Outter:for (char upper = 'A'; upper <= 'Z'; upper++) {
//			for (char lower = 'a'; lower <= 'z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if (lower == 'g') {
//					break Outter;
//				}
//			}
//		
//		}
//		
		
		// for문을 이용해서 1부터 100까지 정수중 3의 배수의 총합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
		  	if (i % 3 == 0) {
		  		sum += i;		  		
		  	}
		}
		System.out.println(sum);
		
		

		
	
		
	}
}
