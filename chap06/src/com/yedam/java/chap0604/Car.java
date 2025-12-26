package com.yedam.java.chap0604;

public class Car {
	
	// Field
	int speed;
	
	// Constructor
	
	
	// Method
    int getSpeed() {
    	return this.speed;
    }
    
    void keyTurnOn() {
    	System.out.println("차키 돌린다");
    }
    
    void setSpeed(int speed) {
        if (speed > 0) {
        	this.speed += speed;
        }
    }
    
    void run() {
    	for (int i = 10; i <= 50; i+=10) {
    		// 내부에서 Method 호출할 때 this
    		// 외부에서는 변수명.Method();
    		this.setSpeed(i);
    		System.out.printf("달립니다 (시속: %d km/h)\n", getSpeed());
    	}
    }
    
    
    
    
    
    
    
}

