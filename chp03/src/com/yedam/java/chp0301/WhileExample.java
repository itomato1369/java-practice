package com.yedam.java.chp0301;

public class WhileExample {

	public static void main(String[] args) {
		// 횟수 제한없이 조건에 따라 계속 반복, 무한루프 의도적 활용
		// 정수 1 ~ 10
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
//		
		// 의도적으로 무한루프 만들어 놓고 다시 의도적으로 빠져나오려고 할 때
		// 프로그램 제어할 때는 필요함
		
		int i = 1;
		while (true) {
			if (i > 10) break;
			System.out.println(i);
			i++;
		}
		
		// do while 조건을 만족하지 않아도 1번은 꼭 실행
		// continue 그냥 넘어감 다음 걸로
		

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
