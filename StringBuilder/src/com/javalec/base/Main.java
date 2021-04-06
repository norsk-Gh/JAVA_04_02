package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// String의 문제점을 해결하기 위해 나온 문자열 선언자들
		
		String string = new String("abcdef");
		
		
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		stringBuilder.append("hijklmn");      //--> 현재 있는곳 '뒤쪽에'붙이는거다!!
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz"); //--> 이건 덧붙이는거다!!
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);   //-> 이건 3번쨰부터..args 6번 배열 '전'까지 지워주는거다.
		System.out.println(stringBuilder);
		
				
		
		StringBuffer stringBuffer= new StringBuffer("abcdef");
		stringBuffer.append("hijklmn");      //--> 현재 있는곳 '뒤쪽에'붙이는거다!!
		System.out.println(stringBuilder);
		
		stringBuffer.insert(3, "zzz"); //--> 이건 덧붙이는거다!!
		System.out.println(stringBuilder);
		
		stringBuffer.delete(3, 6);   //-> 이건 3번쨰부터..args 6번 배열 '전'까지 지워주는거다.
		System.out.println(stringBuilder);
		

	}

}
