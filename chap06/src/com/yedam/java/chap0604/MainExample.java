package com.yedam.java.chap0604;

public class MainExample {

	public static void main(String[] args) {
		
		// 매개변수 선언은 배열 타입
		// Method 는 new 연산자로 생성후 접근
		Calculator cal = new Calculator();
		// .(dot) : 객체 접근 연산자
		cal.powerOn();
		
		
		// 값을 받을 수 있는 변수가 필요함
		int result = cal.plus(1000000, 99999);
		System.out.println("result의 값 : " + result);
        
		// 타입 변환이 자동으로 이루어짐
	    byte x = 10;
	    short y = 4;
	    double result1 = cal.divide(x, y);
	    System.out.println(result1);
	    
	    /* 여러값 더하기
	       매개변수의 개수가 몇 개인지 알 수 없을 때 배열 생성
	       
	                                                 */
	    int[] datas = {1, 2, 3, 4, 5};
	    
	    int result3 = cal.plus(datas);
	    System.out.println("result3 : " + result3);
	    
	    datas = new int[] {1, 100, 5};
	    result3 = cal.plus(datas);
	    System.out.println("result3 : " + result3);
	    
	    
	   int result4 = cal.minus(10,2,2);
	   System.out.println("result3 : " + result4);
	    cal.powerOff();
	}

}
