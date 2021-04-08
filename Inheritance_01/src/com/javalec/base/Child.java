package com.javalec.base;

public class Child extends Parents {     // SuperClass 에서 Parents를 선택해서 오면 된다!
										// 상속받긴 했어도 얘도 클라스이기떄문에 밑에 필-컨-메 구성해줘야함
	
	
	//fields
	
	String cStr = "자식 Class";
	
	
	//constructor    --> 상속받아도 얘는 안오기떄문에 꼭 만들어줘야함
	
	public Child() { 
		
	}
	
	
	
	
	
	//Method      -->> Parents에서 가져오기떄문에 굳이 적지않는다!!
	
}
