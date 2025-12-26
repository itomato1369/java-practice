package com.yedam.java.chap0601;

public class MainExample {
	// 실행을 위한 클래스
    
	public static void main(String[] args) {
		// 실제 카드를 발급한 상황 
		// 클래스 생성자 초기값을 줌
		// 하나의 클래스에서 시작되었지만 
		// 독립된 인스턴스 각자가 행동한건 각자가 
		// 실제 사용
		// 필드를 사용하기 위해 new로 다시 객체 생성
		Card hong = new Card("12345678", "30/12", 777, "Hong");
		Card lee = new Card("98767651", "29/05", 555, "Lee");
		
		// hong . 필드 사용
		hong.transport("버스");
		hong.payment(15000);
		hong.payment(4500);
		System.out.println("hong > ");
		System.out.println("hong결제대금" + hong.amount);
		System.out.println("hong교통대금" + hong.transportAmount);
		System.out.println("hong카드번호" + hong.cardNo);
		
		// lee
		lee.transport("지하철");
		lee.payment(32000);
		System.out.println("lee > ");
		System.out.println("lee결제대금" + lee.amount);
		System.out.println("lee교통대금" + lee.transportAmount);	
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
