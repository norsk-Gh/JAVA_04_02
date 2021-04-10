package com.javalec.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ArrayList
		
		// 우선 배열 선언하는 것처럼 똑같이 해줘야함
		// < > 이렇게 생긴걸 제너릭 이라고 하는데.. 제너릭이 뭔지 물어보는 회사가 있다고 함. '타입' 을 정하는거임. 
		
		
		
		ArrayList<String> arrayList = new ArrayList<String>();   // String 타입의 어레이리스트를 만들겠다고 하는거임!
																 // String 처럼 대문자로 시작하는건 '객체형', '제너릭' 이라고 합니다.
		
		System.out.println("<<<< ArrayList >>>>");     
		arrayList.add("str1");    // 어레이 배열에 데이터를 넣었다! 음 ~ 
		arrayList.add("str2");    
		arrayList.add("str3");    
		arrayList.add("str4");    
		
		
		System.out.println(arrayList);   // 이렇게 하면 [str1] 처럼 배열 모양으로 나온다.
		System.out.println(arrayList.toString());
		
		// ArrayList 의 Data 불러오기
		String str1 = arrayList.get(3);    // 이런 .. 3번째꺼 자리에 있는거를 가져온다는거다.
		System.out.println("index : " + str1);
		
		// ArrayList의 특정 index의 data를 수정하기
		arrayList.set(1, "str2222");   // 이거 포문을 돌려서 다 바꿔버릴 수도 있고.. 다값을 볼 수도 있다!
		System.out.println(arrayList);
		
		// ArrayList의 크기 확인하기
		int size = arrayList.size();
		System.out.println("Size : " + size);    // for문을 돌릴떄크기를 알아야한다.
		
		// ArrayList 내용 지우기
		arrayList.remove(1);
		System.out.println(arrayList); // 이건 데이터의 번지 수를 알떄 지우는 방법이고..
		arrayList.remove("str4");
		System.out.println(arrayList);  // 이건 내용을 알때 지우는 방법이다.. 
		
		// ArrayList 의 내용 전부 초기화 하기
		arrayList.clear();
		System.out.println(arrayList);
		
		
		// CRUD ??  
		// create read(가져오는거) update(수정) delete  크루드 해봤어?
		// 주소록으로 크루드 해봤어요?
		
		// Linked List 
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println(" >>>>>> Linked List <<<<<<");
		linkedList.add("str1");
		linkedList.add("str2");      			// 이름만 다른 거임!
		linkedList.add("str3");
		linkedList.add("str4");
		
		
		// Vector
		Vector<String>	vector = new Vector<String>();
	//----->> 똑같은녀석임!!! 이게 오히려 구버전이고.. arraylist가 더 최신버전에 많이쓰임
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
	}

}
