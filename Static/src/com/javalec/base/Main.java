package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FirstSon first = new FirstSon();
		SecondSon second = new SecondSon();
		
		first.takeChoco();
		second.takeChoco();
		
		// static 은 모든 클라스에 정보를 공유하는거다! 
		// 로그인한 유저의ID나 이런걸 모든 클라스에 공유해야 하거나 할때.. 
		// 인터넷에서는 많이쓰면 안좋다고 하는데.. 이젠 하드웨어가 발달해서 그냥 써도 괜찮다!!
		// field 값도 메소드처럼 public되어있으면 .choco 처럼 쓸 수 있다.
		//
		
		
		
		
		

	}

}
