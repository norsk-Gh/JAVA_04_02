package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child child = new Child();
		System.out.print("아버님 성명 : ");
		child.getFather();     //<---- child 컨스트럭터를 써도... parent의 메소드를 다 쓸수있다!!!
		System.out.print("어머님 성명 : ");
		child.getMather();
		
	}

}



// 자바에서의 상속은 하나밖에 안된다??