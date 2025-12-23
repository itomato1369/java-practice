package com.yedam.java.chp0203;

public class OpeartionExample {

	public static void main(String[] args) {
		int x = 5;
		int y = 2;
		// x/y = 
		// 하나라도 실수로 타입변환
		// 실수를 표현하고 싶으면 값 하나라도 실수 타입
		double z = (double)x/y;
		System.out.println(x/y + "," + z );
		
		// 실수 연산 float double
		// 같은 타입일 경우 해당 타입으로 계산
		float a = 0.12F;
		float b = 0.1F;
		float c = a + b;
		System.out.println(c);
		// double이 포함될 경우 모두 double
	    float d = 0.3F;
	    double e = 0.44;
	    double f = d + e;
		
	}

}
