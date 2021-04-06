package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);

	
while(true) {	
	System.out.println("1 : 가위 , 2 : 바위 , 3 : 보");
	System.out.println("가위 ~ 바위 ~ 보! 어떤걸 내겠습니까? : ");	
		
	int user = scan.nextInt();
	
	Random random = new Random();
	int i = random.nextInt(3);
		i ++;
	
		if(user == 1) {//--------------------------------"가위" 를 냈을 경우
			switch(user - i){
			case -2 :
				System.out.println("이겼습니다!");break;
			case -1 :
				System.out.println("졌습니다 ㅠㅠ");break;
			case 0 : 
				System.out.println("비겼습니다!");break;
			}
		}//if
		if(user == 2) {//--------------------------------"바위" 를 냈을 경우
			switch(user - i){
			case 1 :
				System.out.println("이겼습니다!");break;
			case -1 :
				System.out.println("졌습니다 ㅠㅠ");break;
			case 0 : 
				System.out.println("비겼습니다!");break;
			}
		}//if
		if(user == 3) {//--------------------------------"보" 를 냈을 경우
			switch(user - i){
			case 1 :
				System.out.println("이겼습니다!");break;
			case 2 :
				System.out.println("졌습니다 ㅠㅠ");break;
			case 0 : 
				System.out.println("비겼습니다!");break;
			}
		}//if
	}//while	
}//main
}
