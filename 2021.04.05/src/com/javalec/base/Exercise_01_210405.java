package com.javalec.base;

import java.util.Scanner;

public class Exercise_01_210405 {

	public static void main(String[] args) {
		// 
		
	int [] point = new int[10];
	Scanner scan = new Scanner(System.in);
	int i = 9;
	
	
	System.out.println("Input score : ");
	
	for(int n=0; n<10; n++) {
		System.out.print( n+1 +"의 score : ");
		point[n] = scan.nextInt();
		
	}
//	System.out.println("---------- Histogram ----------");

	while(i==0) {
		System.out.println((i*10) + " : ");
		
		for(int j = 0; j<10; j++) {
			if(point[j]>=(i*10)) {
				System.out.print("#");
			}else{System.out.println("");}
		i--;
	}
		
		System.out.println("");
		
		
		
	}
	
	
	
	
	
	
	}
}
