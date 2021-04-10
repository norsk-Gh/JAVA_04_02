package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arrayList = new ArrayList<Student>();  //() 이거 까먹지 말기
		arrayList.add(new Student("James", 100));
		arrayList.add(new Student("Roberts", 90));
		arrayList.add(new Student("Cathy", 95));
		
		System.out.println(arrayList.get(0));  // 오잉.. 이렇게만 하면 암호화 되서 나옴
		System.out.println(arrayList.get(0).getName());  // 오잉.. 이렇게만 하면 암호화 되서 나옴
				// -> 이게 0번 리스트의 이름만 가져온다는건데.. 
				// 이게 Java Bean 스타일이다!! 
		
		// 지금 한 줄에..두개의 데이터가 들어갔는데도 암호화되서 나오기때문에 다 표현하려면 
		// 두줄로 .getName + getScore	가 있어야합니다.
		// 자바빈은 딱 필드 컨스트럭터 게터세터만 구성되어있다.. 이게ArrayList에 넣고 쓰는 방식이 많다!!
		// 이형식 밖에 쓰고싶으면 클라스를 하나 새로 만드는 수밖에 없다.
		
		
		
		//  짜란~ 이게 모두 나타내는 방법이다!! 
		for(int i=0; i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i).getName() + "\t\t");
			System.out.println(arrayList.get(i).getScore());
			
		}
		
		
		arrayList.set(0, new Student("James",90));
		System.out.println(arrayList.get(0).getName());
		System.out.println(arrayList.get(0).getScore());
	}

}
