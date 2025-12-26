package com.yedam.java.chap0604;

public class Calculator {
/*     Method 
	   Type  Method name( [parameter...] ) {}
	   void는 return type이 없을 때선언
	   여기서 void type으로 선언되었으면 
	   main 안에서 타입을 가질 수 없음
                                               */ 
	
	 // 1. 전원 켜는 기능 
	    void powerOn() {
	    	System.out.println("전원을 켭니다");
	    }
	 // 2. 전원 끄는 기능
	    void powerOff() {
	    	System.out.println("전원을 끕니다");
	    }
	 // 3. 더하기
	    int plus (int x, int y) {
	    	int result = x + y;
	    	// return해주는 게 있으면 무조건 return
	    	// void 제외하고 무조건 return Method는 return 값을 기대함
	    	return result;
	    }
	    
	    // 배열은 for문이 필요
	    int plus (int[] values) {
	    	int result = 0;
	    	// 향상된 for
	    	for (int val : values) {
	    		result = result + val;
	    	}
	    	return result;
	    	
	    }
	    
	    // ... 가변 parameter       JavaScript의 rest parameter
	    int minus (int ... values) {
	    	int result = 0;
	    	for (int val : values) {
	    		result += val;
	    	}
	    	return result;
	    }
	    
	 // 4. 나누기
	    double divide (int x, int y) {
	    	double result = (double)x/(double)y;
	    	return result;
	    }
	    
	    
	 
    
	
	
	
	
	
	
	
	
	
	
	
	

}
