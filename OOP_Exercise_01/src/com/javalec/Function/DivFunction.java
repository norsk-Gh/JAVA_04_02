package com.javalec.Function;
public class DivFunction {

//-----나눗셈-SubClass-----//	
//Field
	
//Constructor	
public DivFunction(){
}
	
//Method
public void DivNormal(int num1, int num2) {
	if(num2==0) {
		System.out.println("0으로 나눴습니다.");

	}else {
	int div = num1/num2;
	System.out.println("두 숫자의 나눗셈 값은 : " + div);

	}
}	
 public String DivNormal2(int num1, int num2){
	if(num2 == 0){
		String error = "error";
		return error;
	}
  	int result = num1/num2;
		return Integer.toString(result);
				
// }
	
	
	
 }	
}
