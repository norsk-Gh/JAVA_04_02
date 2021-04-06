package com.javalec.base;

import java.util.Scanner;

public class le_00 {

	public static void main(String[] args) {
		// 
		
	int [] point = new int[10];
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Input score : ");
	
	for(int n=0; n<10; n++) {
		System.out.print( n+1 +"의 score : ");
		int result = scan.nextInt();
		point[n] = result;
	}

	for(int i = 9; i<=0; i--){
		System.out.println((i*10) + " : ");
		
		for(int j = 0; j<10; j++) {
			if(point[j]>=(i*10)) {
				System.out.print("#");
			}
		System.out.println("");
		}
	
	
	
//	System.out.println("---------- Histogram ----------");
	
	}
	
	}
}
