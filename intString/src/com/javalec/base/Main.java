package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// MVC패턴??  model view controller      // 우리가 개발하는건 주로 컨트롤러 부분임
		
		int num1 = 123; 
		String str1 = "12345";    // 연산 못하는 문자열임!!
		String str2 = "abcde";

		//@@@@@@@ 중요 @@@@@@@//
		String str3 = Integer.toString(num1);    //-> 이러면.. 123이란 숫자는 문자열로 바뀐다.
		System.out.println(str3 + str1);
		// 계산이 아니라.. 그냥 뒤에다가 글 붙인거임
		
		//@@@@@@@ 중요 @@@@@@@//
		int num2 = Integer.parseInt(str1);    //-> 이거 "" 를 없앤다는 의미임!!
											// 이걸 많이 쓰는 이유는.. Swing 이나 앱에서도
											// 화면에 유저가 입력하는 숫자는 수가 아니라 "문자임"
											// 그래서 .. 입력된 값에다가 interger parse를 써서 숫자로 바꾼 후
											// 계산을 한 다음에 결과가 나와야합니다.
		
			// JAVA method = Swift Function
		
		
		System.out.println(num1 + num2);      // 이러면 계산이 됩니다. 
	}

}




// OOP (Object Oriented Program)=객체지향프로그램     Java의 특징이다! 뚜둔 자바 시작

// 