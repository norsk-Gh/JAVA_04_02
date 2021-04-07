package com.javalec.base;

public class AddCalc {

	
	
public AddCalc() {
	
}
	

public int[] sumCalc(int[] arr) {
	
	// 배열에 1씩 더해주고싶다!
	int [] incNum = new int[arr.length];    // 
	
	for(int i= 0; i<arr.length; i++) {
		incNum[i] = arr[i] + 1;
	
	}
	return incNum;   // <-- 배열의 합을 보내주는 역할임
}
	
	
	
}
// 배열의 총합 보내주기
//int tot = 0;    // 누적변수
//
//for(int i= 0; i<arr.length; i++) {
//	System.out.println(arr[i]);
//}
//return tot;   // <-- 배열의 합을 보내주는 역할임