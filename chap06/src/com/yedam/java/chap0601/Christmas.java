package com.yedam.java.chap0601;

import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
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
        // 키보드로 입력하는 값을 INT로 변환한다
        int selectNo = Integer.parseInt(scanner.nextLine());
         
        if (selectNo == 1) {
            System.out.println("선택 > 1");
            System.out.println("학생 수를 입력");
            // 학생 수는 3명으로 고정
            // 3누르면 3명 입력한 수만큼 배열의 크기를 만든다
            studentNum = Integer.parseInt(scanner.nextLine());
            System.out.println(studentNum + "명 등록");
        
        } else if (selectNo == 2) {
            // 점수를 입력하는데 
            // 순서대로 입력하면 첫 번째 배열의 
            // 인덱스 번호 0번 부터 들어가는건가????
            // new 사용해서 새로운 배열 생성 여기에다 값을 어떻게 넣음??
            // scores의 값 배열의 크기는 studnetNum과 같아야겠지??
            scores = new int[studentNum];
            scores = Integer.parseInt(scanner.nextLine());


        } else if (selectNo == 3) {
            // 점수 목록 
            System.out.println("선택 > 3");
            System.out.println("학생들의 점수 목록");
            System.out.println("돌아가려면 엔터를 누르세요");

            // * 출력하는 거나 구구단 출력하는 것 처럼 
            // 점수 목록 호출 scores의 배열의 개수를 기준으로 
            // 반복문
            for (int i = 0; i < scores.length; i++) {
                System.out.println(i + "번 학생 점수 : " + scores[i]);
            }

            String goToBack = scanner.nextLine();

        } else if (selectNo == 4) {
            // MAX 값과 AVG값 구하기
            System.out.println("선택 > 4");
            // scores의 배열에서 가장 큰 값 가져와야 되는데
            // 반복문 써서 하나 씩 다 비교해서 가져와야 하나?
            int max = scores[];

            int avg = scores[]의 값 다 더한다음 / scores.lenght;

            System.out.println("최고 점수: " + max);
            System.out.println("평균 점수" + avg);
            System.out.println("돌아가려면 엔터를 누르세요");
            
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
