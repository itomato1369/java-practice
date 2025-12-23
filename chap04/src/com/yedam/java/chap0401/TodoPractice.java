package com.yedam.java.chap0401;

import java.util.Scanner;

public class TodoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		// 알고리즘 = 문제를 접근하는 방식
		// 증감폭이 일정하다 그러면 for 아니다 while
		// boolean run = true;
		// int balance = 0;
		// Scanner scanner = new Scanner(System.in);
		
		// while (run) {
		// 	System.out.println("----------------");
		// 	System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		// 	System.out.println("----------------");
		// 	System.out.println("선택> ");
			
			
		//     String inputData = null;
		//     inputData = scanner.nextLine();
		    
		//     if (inputData.equals("1")) {
		//     	System.out.println("선택> 1");
		//     	System.out.println("예금액> 10000");
		//     } else if (inputData.equals("2")) {
		//     	System.out.println("선택> 2");
		//     	System.out.println("출금액> 2000");
		//     } else if (inputData.equals("3")) {
		//     	System.out.println("선택> 3");
		//     	System.out.println("잔고> 8000");
		//     } else {
		//     	System.out.println("선택> 4");
		//     	run = false;
		//     }
		// }
		//   System.out.println("프로그램 종1료");
          
		
		
// 		boolean run = true;
// 		int balance = 0;
// 		Scanner scanner = new Scanner(System.in);
	
// 		while(run) {
// 			 System.out.println("--------");
// 			 System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
// 			 System.out.println("--------");
// 			 System.out.println("선택> ");
			 
// 			 // next 단어 입력 method
//  		     String inputData = scanner.nextLine();
// //  		     
// 			 int value = Integer.parseInt(inputData);
//			 
//			 if (value == 1) {
//				 System.out.println("선택> 1");
//				 System.out.println("입금금액 입력 : 현재 통장 잔고 =>" + balance);
//				 inputData = scanner.nextLine();
//				 balance += Integer.parseInt(inputData);
//			 }	 
//  		     
//			 
//			 
//			 
 		//      switch (inputData) {
 		//      case "1":
 		//     	System.out.println("예금액> ");
 		//     	int result = Integer.parseInt(scanner.nextLine());
 		//     	balance += result;
 		//     	System.out.println(result + "원 입금");
 		//         break;
 		//      case "2":
 		//     	System.out.println("출금액> ");
 		//     	result = Integer.parseInt(scanner.nextLine());
 		//     	if (balance > result) {
 		//     		balance -= result;  		    		
 		//     	} else {
 		//     		System.out.println("잔고를 넘어선 출금금액");
 		//     	}
 		//     	break;
 		//      case "3":
 		//      	System.out.printf("잔고> %d\n", balance);
 		//     	 break;
 		//      case "4":
 		//     	 run = false;
 		//     	 break;
 		//      default:
 		//     	 System.out.println("메뉴를 잘못 입력했습니다");	 
 		//      }
 		     
		
		// }
		//   System.out.println("프로그램 종료");
		//   scanner.close();
		  
		  //3
		  /*
		   * while문과 Math.random() method 이용해서 2개 주사위 던졌을 때 나오는
		   * 눈의 합 (눈1, 눈2) 2개의 합이 5가 아니면 계속 주사위 던짐 5면 멈춤
		   * */
		  // Math.random(); = 0.0 <= x < 1.0;

		  boolean rollDice = true;
		  
		  while (rollDice) {
			  int x = (int)(Math.random() * 10);
			  int y = (int)(Math.random() * 10);
			  int sum = x + y;

			if (sum == 5) {
				rollDice = false;
			}

			// System.out.println(sum);
		  }

		  
		  
		  //4
		  int rows = 4;
		  for (int i = 1; i < rows; i++) {
				String star = "*";
				System.out.println(star);
			}
		}
		
		  
		  
		  //5
		  
		  
		  //6
		
		
		
		
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
