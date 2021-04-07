package com.javalec.Function;
public class SumFunction {
	//-----덧셈-SubClass-----//
	//Field
	int num1, num2;
	
	
	//Constructor
	public SumFunction() { 
	}
	
	
	public SumFunction(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}


	//Method
	public int SumNormal(int num1, int num2) {
		int sum = num1 + num2;
		return sum;		
	}
	public int SumNormal2() {
		int sum = num1 + num2;
		return sum;		
	}
	
	
}
