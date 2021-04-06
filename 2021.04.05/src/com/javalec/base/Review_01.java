package com.javalec.base;

import java.util.Scanner;

public class Review_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	
	// 입력시키기!
	System.out.print("입력한 숫자의 갯수? : ");
	int input = scan.nextInt();
	
	int [] inputNum = new int [100];
	
	
	System.out.println(input + "개의 숫자를 입력하세요! : ");
	
	for(int i = 1; i<=input; i++) {
		System.out.print(i + "의 숫자 : ");
		inputNum[i-1] = scan.nextInt();
		
	}
		
	
	System.out.print("숫자를 삽입하고자 하는 위치는? : ");
	int wantInputPlace = scan.nextInt();
	
	System.out.print("삽입하고자 하는 수는? : ");
	int wantInputNum = scan.nextInt();
	
	
	// 원하는 삽입위치와 삽입하고자 하는 수 입력시키기
	for(int j=input; j>=wantInputPlace; j--) {
		if(j>wantInputPlace) {
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	// 계산하기
	
	
	
	
	
	// 결과 보여주기
		
		
		
	}

}
