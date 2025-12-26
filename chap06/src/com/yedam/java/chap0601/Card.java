package com.yedam.java.chap0601;

  public class Card {
     // 라이브러리 클래스
	 // 실제 기능을 하는 부분
	    
	 // Card가 가지는 속성 필드
	  // 필드 field 
	 // 카드종류 : 국내용 해외용
	 // 타입명  필드명 
	 String type;
	 // 카드사
	 String company;
	 // 카드번호 (식별가능한지) 
	 String cardNo;
	 // 유효기간  
	 String period;
	 // cvc 번호
	 int cvc; 
	 // 사용자 이름 영문명 
	 String userName;
	 // 결제대금
	 int amount = 0;
	 // 교통대금
	 int transportAmount = 0;
	 
	 
	 // method 동작 
	 // 결제
     void payment(int price) {
    	 // this 자기 자신
    	 this.amount += price;
     }
	 
     // 지급 청구
     void bill() {
    	 this.amount = 0;
     }
     
	 // 교통카드
	 void transport(String type) {
		 if (type.equals("버스")) {
			this.transportAmount += 1500; 
		 } else {
			 this.transportAmount += 2000;
		 }
		 
	 }
	
	  // 생성자
	 // constructor
	 // MainExample.java 에서 new 연산자를 이용할 때
	 
	 Card (String cardNo, String period, int cvc, String userName) {
		 this.type = "비자";
		 this.company = "현대";
		 this.cardNo = cardNo;
		 this.period = period;
		 this.cvc = cvc;
		 this.userName = userName;
	 }
	
	
	
	
	


	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
