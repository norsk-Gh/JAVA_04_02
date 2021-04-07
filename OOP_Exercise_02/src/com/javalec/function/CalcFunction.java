package com.javalec.function;

public class CalcFunction {

// Field -----//
	int i, j;
	
	
// Constructor //
	
public CalcFunction(int i, int j) {
	super();
	this.i = i;
	this.j = j;
}

// Method -----//

	// Addition Method -------//
	public void AddAction () {
		int AddResult = i + j;
		System.out.println("덧셈 : " + AddResult);
	}
		
	// Subtraction Method ----//
	public void SubAction () {
		int SubResult = i - j;
		System.out.println("뺄셈 : " + SubResult);
	}
		
	// Multiply Method ------//
	public void MultiplyAction () {
		int MultiplyResult = i * j;
		System.out.println("곱셈 : " + MultiplyResult);
	}
	
	// Division Method ------//
	public void DivAction() {
		
		if (j==0.0) {
			System.out.println("잘못된 값입니다.");
		}else {
			double DivResult = (double)i / (double)j;
			System.out.println("나눗셈 : " + String.format("%.1f", DivResult));
		}
		
	}
	
	
	
	
}
