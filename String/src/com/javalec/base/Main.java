package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Hello";
		
		String str1 = new String("Hello");    //->String 이건 class    // 객체선언형 스타일이라고 함
			// 객체선	      //-> 생성자 constructor
		// 이런 형태를 객체형이라고 함
	
		// 원래 이렇게 쓰는데 .. 위처럼 편하게 쓰라고 만든게 API라고 한다.
		
		Scanner scan = new Scanner(System.in);
//		scanner.  //-> 이후에 나오는걸 메소드(API)라고합니다!!
		
			String str2 = "abcdefg";
			String str3 = "HIJKLMN";
			String str4 = "opqrstu";
			String str5 = "abc def ghi";
			
			System.out.println(str1.concat(str2));    // -> 문자열 연결해주는 녀석이다!
			System.out.println(str1.substring(3));    // -> str1 3번쨰 자리에서부터 빼내는거다!! (배열처럼 3번째면.. 0, 1, 2, 3)
			System.out.println(str1.substring(3, 5));    // -> str1 3번쨰 자리에서부터 5번 전까지!! == 3, 4번쨰 자리만 빼내는거다!! (배열처럼 3번째면.. 0, 1, 2, 3)
			System.out.println(str1.length());    // -> 글자수가 몇개인지 확인 할 수 있다!.  -> 자소서???
			System.out.println(str1.toUpperCase());    // -> 소문자를 대문자로 만들어주는거임!
			System.out.println(str1.charAt(3));    // -> 3번배열쨰 글자 하나만 가져올떄 쓴다.
			
			
			// str2 알벳을 하나씩 출력하기 위해서는?
			for(int i=0; i<str2.length(); i++)
				System.out.println(str2.charAt(i));
			

			System.out.println(str2.indexOf('c'));    // -> c라는 글자가 몇번쨰에 있는지 확인하겠다!!
			System.out.println(str2.equals(str3));    // -> 
//$$$$//	System.out.println(str5.trim());    // -> 빈칸을 싹빼고 넣어준다!! 이거 많이 씁니다..// 이건 기본적으로 들어간다.. 왜냐하면 사람들이 빈칸 띄고서 많이 쓰기 때문!!
			
			System.out.println(str2.replace('a', 'z'));    // -> str2번 중에서 a가 들어간건 z로 바꿔주겠다!!
															// 프린트는 그냥 한번 출력해본거임!
			//--> 이거 바꾸려면.. str2 = str2.replace('a', 'z') 이런식으로 해야함
			
			System.out.println(str2.replaceAll("abc", "ZZZZZ"));    // -> 이건 string급 변경해줄떄!!
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
