package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap
		
		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(10,"str0");
		hashMap.put(11,"str1");
		hashMap.put(12,"str2");
		hashMap.put(13,"str3");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get(hashMap));    // hashmap은 순서가 없고 키값으로 구분된다.

		
		HashMap<String, String> hashMap2 = new HashMap<String, String>();
		
		hashMap2.put("a", "apple");
		hashMap2.put("b", "banana");
		hashMap2.put("c", "coke");
		
		
		System.out.println(hashMap2.get("c"));   //->이러면 coke 이 뜸
		
		hashMap2.remove("a");  //--> 내용이 지워짐
		
		
		// 찾을때는 이 방법이 ArrayList	보다 더 좋다
		// 검색형은 해쉬맵이 좋고..어레이는 작업을 쌓아놓고 할떄 더 좋다
		
		
		
		
		
		
		
		
	}

}
