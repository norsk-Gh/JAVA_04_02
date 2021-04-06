package com.javalec.base;

import java.util.Scanner;

public class Quiz_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//선언문
		
	int selectNum = 0;	
	int customNum = 0;
	int money = 0;
	Scanner scan = new Scanner(System.in);
	
	// 배열 값들
	int [] customID = {1,2,3,4,5};                          //고객 배열
	int [] account = new int[customID.length];				//고객 잔고 배열

	
	
	//입금 ~ 종료 나오게 하기

	while(true)	{
		System.out.println("1. 입금");System.out.println("2. 출금");
		System.out.println("3. 현황");System.out.println("4. 종료");
		
	// 번호 선택
		System.out.print("번호를 선택하세요! ");
		selectNum = scan.nextInt();
		
	// 고객번호 입력시키기 + 금액 입력시키기	
			switch (selectNum) {
				
				// 입금 시스템
				case 1 :    
					
					System.out.print("고객번호 : ");
					customNum= scan.nextInt();
					
					System.out.print("금액 : ");
						money = scan.nextInt();
					
					for(int i =customNum; i<=customNum; i++) {
						account[i-1] = account[i-1] + money;
							System.out.print  ("입금 결과 : ");
							System.out.println("고객번호 : " + customNum + "  잔액 : " + account[i-1]);
					}
						break;
	
		
				// 출금 시스템
				case 2 : 
					System.out.print("고객번호 : ");
					customNum= scan.nextInt();
					
					System.out.print("금액 : ");
						money = scan.nextInt();

					int j=customNum-1;
						if(money>account[j]) {
							System.out.println("잔액이 부족합니다!");
							break;
						}else if(money<=account[j]){
							account[j] = account[j] - money;
							System.out.print  ("출금 결과 : ");
							System.out.println("고객번호 : " + customNum + "  잔액 : " + account[j]);
						}//if
						break;
				case 3 : 
					System.out.println("       고객명    잔액");
					System.out.println("       ----    ---");
					for(int i=0; i<=customID.length-1; i++) {
						System.out.println("\t" + customID[i] + "\t" + account[i]);
					}
					
					
		
				case 4 : break;										// 종료로 넘어가게 하기
				
				default :
					System.out.println("잘못 입력하셨습니다.");          // 사용자가 1~4 밖의 수 입력
	}//switch
	
	System.out.println("-----------------------------------");
	// >>땡큐 결과 나타내기<<	
	if(selectNum == 4) {
	System.out.println(" >>>> Thank you <<<< ");
	break;
	}	
//	}
	}//while	
//	System.out.println(" >>>> Thank you <<<< ");

		
		
	}

}
