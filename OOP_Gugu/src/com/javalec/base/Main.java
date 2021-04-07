package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

		
		System.out.print("구구단을 출력할 숫자를 입력하세요 : ");
		int inputGugu = scan.nextInt();
		
		Function gugu = new Function(inputGugu);
		gugu.GuguOutput();
		
		
	}

}
