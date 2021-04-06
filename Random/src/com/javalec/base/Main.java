package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random
		
//		double d = Math.random();        //--> random 자체가 더블로 나오기 떄문에 앞에도 더블로 해줘야한다!!
//		int a = (int)(d*3) + 1;
//		System.out.println(a);
//		
//		
//		
//		for (int i=1; i<=6; i++) {
//			double d = Math.random();
//			int a = (int)(d*3) + 1 ; 
//			System.out.println(a);
			
			
//		}
		// ---> ㄷㄷ 이거 가위바위보 할 떄 쓰는거임...

		
		Random random = new Random();
		int i = random.nextInt(3);
		System.out.println(i+1);
		
		
		
		
		

	}

}
