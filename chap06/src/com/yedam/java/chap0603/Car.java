package com.yedam.java.chap0603;

public class Car {
	
        // 필드	
	    // Instance가 가지는 정보
	    String company = "HYUNDAI";
	    String model = "Pony";
	    String color = "Blue";
	    int maxSpeed = 180;
	    int currentSpeed;
	    String review;
	
	    /* Constructor 클래스명을 사용    얘는 고유이름이 없어
	                 매개변수 필드와 매개변수 이름이 동일한 경우 this 
	                 Constructor는 여러개일 수 있다
	                 Constructor Overloading
	                 같은 클래스 이름이라도 매개변수 타입의 순서가 바뀌면 여러번 가능
	                 
	                 Default Constructor 클래스 내부에 Constructor가 하나도 없을 때 추가
	                  
	                 
	                 */
	    public Car (String model, String color) {
//	    	this.company = "현대자동차";
//	    	this.model = model;
//	    	this.color = color;
	    	// 나머지는 여기에 this. 뭐 없으니 
	    	// Constructor 안에서 새로운 this(); Constructor 생성
	    	this ("현대자동차", model, color);
	    }
	    
	    public Car (String company, String model, String color) {
	    	this.company = company;
	    	this.model = model;
	    	this.color = color;
	    }
	    
	    public Car (String model, String color, int maxSpeed) {
	    	this ("현대자동차", model, color);
	    	this.maxSpeed = maxSpeed;
	    }
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	

}
