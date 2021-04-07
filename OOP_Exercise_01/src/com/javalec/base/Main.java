package com.javalec.base;

import java.util.Scanner;

import com.javalec.Function.DivFunction;
import com.javalec.Function.MultiFunction;
import com.javalec.Function.SubFunction;
import com.javalec.Function.SumFunction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);	
		
		
		System.out.println("두개의 숫자를 입력해주세요 : ");
		int inputNum1 = scan.nextInt();
		
		int inputNum2 = scan.nextInt();
		
	System.out.println("어떤 기능을 사용할까요? : ");	
	System.out.print("1. 덧셈" + "\n" + "2. 뺄셈" + "\n" + 
	                 "3. 곱셈" + "\n" + "4. 나눗셈" + "\n" +": ");	
	int wantFunc = scan.nextInt();
	
	switch(wantFunc) {
	
		case 1 : 
			// 더하기 기능 -----//
			SumFunction calc = new SumFunction(inputNum1, inputNum2);
			int sum = calc.SumNormal2();
			
			System.out.println("두 숫자의 합계는 : " + sum);
			//---------------//
			break;
		
		case 2 : 
			// 뺄셈 기능 ------//
			SubFunction subtrac = new SubFunction();
			int subt = subtrac.SubNormal(inputNum1, inputNum2);
			
			System.out.println("두 숫자의 뺄셈 값은 : " + subt);
			//--------------//
			break;
			
		case 3 :
			// 곱하기 기능 -----//
			MultiFunction multifly = new MultiFunction();
			int multi = multifly.MultiNormal(inputNum1, inputNum2);
			
			System.out.println("두 숫자의 곱셈 값은 : " + multi);
			//--------------//
			break;

		case 4 : 
			// 나누기 기능 -----//
			DivFunction division = new DivFunction();
			String result = division.DivNormal2(inputNum1, inputNum2);
			System.out.println(result);
			//--------------//
			break;
	}//switch
	
		
		
		
		
		
	}

}
