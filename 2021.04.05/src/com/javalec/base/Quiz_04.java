package com.javalec.base;

import java.util.Scanner;

public class Quiz_04 {
public static void main(String[] args) {

// 선언
int [] Numbers = new int [100];
Scanner scan = new Scanner(System.in);
	

//원하는 숫자 입력시키기
System.out.print("입력할 숫자의 갯수? : ");
int input = scan.nextInt();

for(int i=1; i<=input; i++) {
	System.out.print(i + "의 숫자 : ");
	Numbers[i-1] = scan.nextInt();
}
// 숫자 삽입위치&숫자 물어보기
	System.out.print("숫자를 삽입하고자 하는 위치는 ? : ");
	int wantLocation = scan.nextInt();
	
	System.out.print("삽입하고자 하는 숫자는 ? : ");
	int wantNumber = scan.nextInt();
		
//	배열 이사시키고 집어넣기

	for(int j=input; j>=0; j--)
		if(j>=wantLocation) {
			Numbers[j+1] = Numbers[j];
		}
		Numbers[wantLocation] = wantNumber;
//출력
	System.out.println("----------결과---------");
	for(int k=0; k<=input; k++) {
		System.out.println(Numbers[k]);
	}



	
	
	
	
	
	
	
	
	
}
}
