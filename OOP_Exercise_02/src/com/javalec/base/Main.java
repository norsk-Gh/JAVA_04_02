package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.CalcFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// 선언문 -------------//	
	Scanner scan = new Scanner(System.in);
	
	
	// 사용자 입력 받기 -----//
	System.out.print("첫번째 숫자를 입력하세요 : ");
	int inputNum1 = scan.nextInt();
	
	System.out.print("두번째 숫자를 입력하세요 : ");
	int inputNum2 = scan.nextInt();
	
	System.out.println(">>>>>> 결과 <<<<<<");
	// 계산하기 -----------//
	
	
	CalcFunction calc = new CalcFunction(inputNum1, inputNum2);
		calc.AddAction();
		calc.SubAction();
		calc.MultiplyAction();
		calc.DivAction();
	
	
	
	
	
	// 결과 나타내기 -------//
	

	}

}
