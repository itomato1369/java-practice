package com.yedam.java.chap0401;

public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// switch 문
		// Math.random()                     0 <= x < 1
		// Math.random() * 4                 0 <= x < 4 
		// (int) 실수는 무한대니까 정수로 타입변환
		// (int)(Math.random() * 4) + 8      8 <= x < 12;
		int time = (int)(Math.random() * 4) + 8;   
	    System.out.println("[현재시간 : " + time + " 시]");
	    
	    // 변수를 가짐
	    // {}이 없어서 못 빠져나감
	    // break;
	    // ctrl + f11
	    switch (time) {
	    case 8:
	    	System.out.println("출근합니다.");
	    	break;
	    case 9:
	    	System.out.println("아침회의 시작.");
	    	break;
	    case 10:
	    	System.out.println("업무시작.");
	    	break;
	    default :
	    	System.out.println("외근나감.");
	    }
	    
	    char grade = 'b';
	    switch (grade) {
	    case 'A':
	    case 'a':
	    	System.out.println("90점 이상");
	    	break;
	    case 'B':
	    case 'b':
	    	System.out.println("80점 이상");
	    	break;
	    default:
	    	System.out.println("C");
	    }
	    
	    int score = 101;
	    switch(score) {
	    case 100: 
	    case 99:
	    case 98:
	    case 97:
	    case 96:
	    case 95:
	    case 94:
	    case 93:
	    case 92:
	    case 91:
	    case 90:
	    	System.out.println("A등급");
	    	break;
	    case 89:
	    case 88:
	    case 87:
	    case 86:
	    case 85:
	    case 84:
	    case 83:
	    case 82:
	    case 81:
	    case 80:
	    	System.out.println("B등급");
	    	break;
	    case 79:
	    case 78:
	    case 77:
	    case 76:
	    case 75:
	    case 74:
	    case 73:
	    case 72:
	    case 71:
	    case 70:
	    	System.out.println("C등급");
	    	break;
	    case 69:
	    case 68:
	    case 67:
	    case 66:
	    case 65:
	    case 64:
	    case 63:
	    case 62:
	    case 61:
	    case 60:
	    	System.out.println("D등급");
	    	break;
	    default:
	    	System.out.println("재수강");
	    }
	    
	    /*
	     * for 증강 식에 대한 연산식이 들어감 무한루프에 안빠짐
	     * for (i = 0, i < 10, i++) {
	     *   
	     * };
	     * 	      
	     * while 조건에 만족하는 경우 계속 반복
	     * 값이 변경되는 코드가 꼭 필요
	     * 
	     * */
	    
	    
	    
	    
	    
	    
	    
	}

}
