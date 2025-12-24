package com.yedam.java.chap0501;

public class MultiArayExample {

	public static void main(String[] args) {
		// 다차원 배열: 참조타입매열
		String[] strAray = { "이재용", "잰슨황" };
	    for (String text : strAray) {
	    	System.out.println(text);
	    }
	    
	    // 2차원 배열
	    int[][] intAray = null;
	    intAray = new int[][]{{1, 2}, {3, 4, 5}, {6}};
	    
	    for (int i = 0; i < intAray.length; i++) {
	    	int[] currentAray = intAray[i];
	    	
	    	for (int j = 0; j < currentAray.length; j++) {
	    		int curVal = currentAray[j];
	    		System.out.printf("[%d][%d] : %d\n", i, j, curVal);
	    	}
	    }
	    
	    // 2차원배열의 크기지정 
	    // 반복문 2개가 필요
	    intAray = new int[2][];
	    intAray[0] = new int[] {1,2};
	    intAray[1] = new int[] {3,4,5};
	    
	    for (int i = 0; i < intAray.length; i++) {
	    	int[] currentAray = intAray[i];
	    	
	    	for (int j = 0; j < currentAray.length; j++) {
	    		int curVal = currentAray[j];
	    		System.out.printf("[%d][%d] : %d\n", i, j, curVal);
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
