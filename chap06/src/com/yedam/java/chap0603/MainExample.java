package com.yedam.java.chap0603;

public class MainExample {

	public static void main(String[] args) {
		
		/* class에 Constructor 가 있으면 이거 지원 안해줌
		Car hongCar = new Car(); */
		
		//   (String model, String color) 이니까 "" 로 들어가야 겠지??
		Car hongCar = new Car("캐스퍼", "베이지");
		System.out.println("hongCar제조사 : " + hongCar.company);
		System.out.println("hongCar모델 : " + hongCar.model);
		System.out.println("hongCar색상 : " + hongCar.color);
		System.out.println("speed : " + hongCar.maxSpeed);
		System.out.println("-------------");
		
		
		Car kimCar = new Car(" ", " ", " ");
		System.out.println("kimCar제조사 : " + kimCar.company);
		System.out.println("kimCar모델 : " + kimCar.model);
		System.out.println("kimCar색상 : " + kimCar.color);
		System.out.println("kimCar스피드 : " + kimCar.maxSpeed);
		System.out.println("-------------");
		
		Car leeCar = new Car("KIA", "레이", "Blue");
		System.out.println("lee제조사 : " + leeCar.company);
		System.out.println("lee모델 : " + leeCar.model);
		System.out.println("lee색상 : " + leeCar.color);
		System.out.println("-------------" + leeCar.maxSpeed);
		System.out.println("-------------" + leeCar.review);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
