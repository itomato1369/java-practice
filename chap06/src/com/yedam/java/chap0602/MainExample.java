package com.yedam.java.chap0602;
// 실행 클래스 : main Method를 포함하는 실행 전용
public class MainExample {

	public static void main(String[] args) {
		/* 인스턴스(Instance)는 
		   객체 지향 프로그래밍(OOP)에서 클래스(설계도)를 기반으로 메모리에 생성된 실체화된 객체
		*/ 
		
		/* new 연산자로 가져와야함 안하면 뭔지 모른다 
		Unresolved compilation problem: 
		The local variable myCar may not have been initialized 
		
		클래스명 변수명 new 클래스명();   
		변수명.클래스 안에 있는 필드명
		Car myCar;
		System.out.println(myCar.company);
		
		*/
       
	    Car myCar = new Car();
	    System.out.println(myCar.company);
	    System.out.println(myCar.model);
	    System.out.println(myCar.color);
	    System.out.println(myCar.maxSpeed);
	    // 값을 안주면 타입의 초기값 자동 할당
	    System.out.println(myCar.currentSpeed);
	    System.out.println(myCar.review);
		
		// 필드값 변경
	    myCar.currentSpeed = 60;
	    System.out.println("변경된 currentSpeed " + myCar.currentSpeed);
		
		
		
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
