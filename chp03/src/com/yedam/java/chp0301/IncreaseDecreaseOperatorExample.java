package com.yedam.java.chp0301;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감연산자
		int x = 10;
		int y = 10;
		int z = 0;
		System.out.println("-------------------");
		x++;
		++x;
		System.out.println("x =" + x);
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println("y =" + y);
		System.out.println("---------------------");
		z = x++;
		System.out.println("x =" + x);
		System.out.println("z =" + z);
		
		z = ++x + y++;
		// 1 증감 연산자가 우선
		// 2 x + y
		// 3 z = x + y
		// 4 y++
		System.out.println("---------------------");
		System.out.println("z =" + z);
		System.out.println("y =" + y);
		System.out.println("x =" + x);
		
		
		
		
		
		
	}

}
