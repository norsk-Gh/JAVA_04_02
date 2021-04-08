package com.javalec.base;

public class FirstSon {

	//field
	
	//constructor
	
	public FirstSon() {
	}
	
	//Method
	
	public void takeChoco() {
//		Mamabag mamabag = new Mamabag();
//		mamabag.choco  = mamabag.choco - 1;		
		
		
		
		
		//->Static 쓰니까 이렇게 매소드처럼 써진다?
		Mamabag.choco = Mamabag.choco - 1;    // static으로 마마백 필드에 해줬고! 다시 작성하니 
											// 이태릭체로 choco 로 바
		if(Mamabag.choco < 0) { 
			System.out.println("첫째는 초코파이 먹고 싶어요!");
		}else{
			System.out.println("첫째는 맛있게 먹었어요..");
		}
		
	}
	
	
}
