package com.javalec.base;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		
		System.out.println(hashSet);  // 이러면.. 중복된건 안들어감!!
										// 잘 안쓰인다고 합니다잉 데이터베이스를 쓰니까!!
		
		
		
	}

}
