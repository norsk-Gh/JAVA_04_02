package com.javalec.base;

import java.util.Scanner;

public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	int [] score = new int[10];
	int [] histo = new int[10];
			
		System.out.println("input score : ");
		
	for( int i = 0; i<score.length; i++) {
		System.out.println((i+1) + "의 스코어");
		score[i] = scan.nextInt();
		histo[score[i]/10]++;
	}
System.out.println("--------histo-------");		

for(int i=(score.length-1); i>=0; i--) {
	System.out.print(String.format("%3d : ", i*10));
	for(int j=1; j<=histo[i]; j++) {
		System.out.print("#");
	}
	
	System.out.println();
}

	
		
		
	}

}
