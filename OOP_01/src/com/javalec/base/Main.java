package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1~10까지의 합을 구하여 출력하고 그 합이 짝수인지 홀수인지 판단하기
		
		
		
		
		

		System.out.println("1부터 10까지의 숫자 합계 더하기!");
		int total = 0;
		
		

		for(int i = 1 ; i<=10; i++) {
			total += i;
		}
		
		System.out.println("총 합계는 : " + total);
		System.out.println(total%2==0 ? "짝수입니다." : "홀수입니다.");
	
	
	}
		
	
}

//Scanner scan = new Scanner(System.in);
//System.out.print("1부터 몇까지의 숫자를 더한 합계를 구할까요? : ");
//int input = scan.nextInt();
//int total = 0;
//for(int i = 1 ; i<=input; i++) {      // 원하는 숫자 입력해서 거기까지 합구하기
//	total += i;