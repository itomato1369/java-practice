package com.yedam.java.chp0204;

public class PrintExample {

	public static void main(String[] args) {
		// System.out.print();
        System.out.print("I'm");
        System.out.print(", ");
        System.out.print("Free");
        System.out.print("!\n");
		
		// System.out.print(); + \n => System.out.println();
		System.out.println("to be whatever I");
         
		// System.out.printf(); 애도 계속 1줄임 줄바꿈 안됨
		System.out.printf("이름 : %s, 나이 : %d, 월급 : %.4f", "노엘", 32, 250.25);
	}

}
