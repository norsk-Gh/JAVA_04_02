package com.javalec.base;

import java.util.Scanner;

public class Quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num = 1;
		
		
		System.out.println("몇단으로 할까요? : ");
		int input = scan.nextInt();
		
				
		int x = 1;
		for(int j=1; j<=input; j++) {
			
			for(int i=1; i<=x; i++) {
				System.out.print(num + "\t");
				num++;
				
			}
			x++;
			System.out.println();
		}
		
		

	}

}
