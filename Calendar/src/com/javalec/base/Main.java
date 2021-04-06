package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar calendar = Calendar.getInstance();   // --> 이건 생성자(new)는 안씀!!
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year + " : " + month + " : " + day);   //--> 먼스는 특이하게.. 0부터 시작해서 나옴 그래서 꼭 +1을 붙여줘야한다.
		System.out.println(hour + " : " + minute + " : " + second);   //--> 이렇게 API로 쓴다! 그런데 이건 클라스가 구성이 되어있어야한다.
		
		
		
		
		

	}

}
