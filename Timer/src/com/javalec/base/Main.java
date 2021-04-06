package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// String 과 StringBuilder의 측정
		
		
	String str1 = "a";
	
	long startTime1 = System.currentTimeMillis();
	for(int i=1; 1<=50000; i++) {
		str1 += "a";
	}
//	long endTime1 = System.currentTimeMillis();
//	System.out.println("Term1 : " + (endTime1 - startTime1));

	}

}

//------->> 이런거로 코딩짠거 누가 더 좋은지 판단 할 수도 있음!!