package com.yedam.java.chap0601;

import java.util.Scanner;

public class ReviewChristmas {

	public static void main(String[] args) {
		  // 프로그램 실행 여부 
		  boolean run = true;
	      // 학생 수
	      int studentNum = 0;
	      // 점수 배열
	      int[] scores = null;
	      // 키보드로 입력하는 값을 받기 위함
	      Scanner scanner = new Scanner(System.in);

	      while (run) {
	        System.out.println("-----------");
	        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	        System.out.println("-----------");
	        System.out.println(" 선택 > ");
	        // 키보드로 입력하는 값을 int로 변환한다 
	        int selectNo = Integer.parseInt(scanner.nextLine());
	         
	          
	        if (selectNo == 1) {
	            System.out.println("선택 > 1");
	            System.out.println("학생 수를 입력");
	            // 학생 수는 3명으로 고정
	            // 3누르면 3명 입력한 수만큼 배열의 크기를 만든다
	            
	            studentNum = Integer.parseInt(scanner.nextLine());
	            // 다시 생성, 배열의 크기 지정
	            scores = new int[studentNum];
	            System.out.println(studentNum + "명 등록");
	        
	        } else if (selectNo == 2) {
	            // 점수를 입력하는데 
	            // 순서대로 입력하면 첫 번째 배열의 
	            // 인덱스 번호 0번 부터 들어가는건가????
	            // new 사용해서 새로운 배열 생성 여기에다 값을 어떻게 넣음??
	            // scores의 값 배열의 크기는 studnetNum과 같아야겠지??
	        	// 배열은 반복문 반복문 for 
	        	for (int i = 0; i < studentNum; i++) {
	        		// 인덱스 번호 i부터
	        		System.out.println("["+i+"]>번째 학생 점수 입력");
	        		scores[i] = Integer.parseInt(scanner.nextLine());	
	        	}
	        } else if (selectNo == 3) {
	            // 점수 목록 
	            System.out.println("선택 > 3");
	            System.out.println("학생들의 점수 목록");
	            System.out.println("돌아가려면 엔터를 누르세요");
	            for (int i = 0; i < studentNum; i++) {
	        		// 인덱스 번호 i부터
	        		System.out.println("["+i+"]번째> " + "점수" + scores[i]);
	            }
	            String goToBack = scanner.nextLine();
	        } else if (selectNo == 4) {
	            // MAX 값과 AVG값 구하기
	            System.out.println("선택 > 4");
	            // scores의 배열에서 가장 큰 값 가져와야 되는데
	            // 반복문 써서 하나 씩 다 비교해서 가져와야 하나?
	            int max = scores[0]; 
	            int sum = 0;
	            
	            for (int score : scores) {
	            	// 최고점
	            	if (score > max) {
	            		max = score;
	            	}
	            	// 총합
	            	sum += score; // sum = sum + score;
	            }
	            double average = (double) sum / scores.length;
	            System.out.println("최고 점수 : " + max);
	            System.out.printf("평균점수 : %.2f\n", average);
	            
	            String goToBack = scanner.nextLine();
	            

	        } else if (selectNo == 5) {
	            System.out.println("선택 > 5"); 
	            run = false;
	        } 
	      
	      }
	      // while문 종료
	      System.out.println("프로그램 종료!");

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
