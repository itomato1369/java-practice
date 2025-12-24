package com.yedam.java.chap0501;

  public class StringExample {
	
    public static void main(String[] args) {
	  String str1 = "신용권";
	  String str2 = "신용권";
	
	  str2 = "이것이 자바다";
//	  System.out.println(str1);
//	  System.out.println(str2);
	
	  int[] first = {1, 2, 3};
	  int[] second = first;
	  second[1] = 10;
	  System.out.println(second[1]);
	
	  // null은 초기화가 아님
	  // 참조타입에서만 발생하는 에러
	  // 어디서 객체를 가져야하는지 
	  int[] third = null;
//	  System.out.println(third.length);
	
      	
 	  // new연산자가 반환하는 것은 객체
	  // 새롭게 객체를 생성
	  String strA = new String("신용권");
	  String strB = new String("신용권");
	
	  System.out.println(strA);
	  System.out.println(strB);
	
	  if (strA == "신용권") {
		  System.out.println("같은 값을 가지고 있다");
	  } else {
		  System.out.println("아니 사실은 달라");
	  }
	  
	  // 실제 데이터가 아닌 변수 객체의 메모리 주소
	  // 값이 같더라도 메모리 주소가 다르니까 == 이거 하면 다르다
	  // 문자를 비교할 때 사용하는 method = equals() || equalsIgnoreCase(대소문자 구분안함)
	  
	  // Java 에서는 배열을 한 번 생성하면 길이 늘리거나 줄일 수 없음 
	  // 배열 하면 그냥 반복문
	  
	  // 배열에 저장하고자 하는 타입
	  // 배열 선언      타입[] 변수 = { 값의 개수만큼 자동으로 배열의 크기 결정 }
      //                          new 타입[] 값을 안준다면 new연산자 배열의 사용 크기만 결정
	
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
  }
}
