package com.javalec.base;

import java.util.Scanner;

public class Quiz_03 {
	
	// ----------< Exercises >----------- //
	// 입력할 숫자의 갯수? : 4
	// 4개의 숫자를 입력하세요! :
	// 1의 숫자 : 11
	// 2의 숫자 : 22
	// 3의 숫자 : 33
	// 4의 숫자 : 44
	// 검색할 숫자는? : 33
	// 33의 위치는 3번쨰 입니다.
	
	// ++ 검색할 숫자는? : 55 -> 55는 존재하지 않습니다 나오게 하기
	
	//------------------------------------//
	

	public static void main(String[] args) {
		
		// 선언문
		Scanner scan = new Scanner(System.in);

		
		//입력 하고 싶은 만큼의 수 입력시키기---//
		System.out.print("입력할 숫자의 갯수? : ");
		int input = scan.nextInt();
		int [] Num = new int[input];

		
		System.out.println(input + "개의 숫자를 입력하세요! : ");
	
		// 숫자 반복 입력시키기 ------------//
		for(int i=1; i<=input; i++) {
			System.out.print(i + "의 숫자 : ");
			Num[i-1] = scan.nextInt();
		}//for
		
		// 검색할 숫자는 입력시키기   -------//
		System.out.print("검색할 숫자는? : ");
		int searchNum = scan.nextInt();  // 찾고자 하는 숫자 입력시키기

		// 배열 값중 맞는거 있는 검증키기 ----//
		String error = "에러";
		
		for(int j=0; j<Num.length; j++) {
		
			if(Num[j] == searchNum) {  // 찾는값과 기존 입력시킨값 대입해보기
				error = "통과";
				System.out.println(searchNum + "의 위치는 " + (j+1) + "번째 입니다.");
			}//if
		}//for
		
		// 값이 없으면 에러 표기하기 -------//
		if(error == "에러") {
			System.out.println(searchNum + "는 존재하지 않습니다.");
		}//if
		
	}

}
