package com.javalec.function;

public class SumEvenOdd2 {

	
	
//Field , Property
	int num = 0;     // 이거를 쓰는 이유가.. 썸칼에서 이미 평균을 구했다! 근데 다른 메소드에서
					 // 평규 값을 구하는게 필요할떄.. 아니면 연동될떄 또 평균을 구할 필요가 없으니까..
					  // 이렇게 위에다가 선언처럼 빼서 쓰는게 필드값이다.	
						// 전언변수이기때문이다!!
	
	// Constructor
	
	public SumEvenOdd2() {
		
	};
	
	
	// Method (함수)
	public void sumCalc(int num1, int num2) {      // 여기 void는 밑에서 return을 할 필요가 없다는 뜻이다.
		int sum = 0;
		for (int i=num1; i<=num2; i++) {
			sum += i;
			}
		num = sum;
		System.out.println(num1 + " ~ " + num2 + "의 합은" + sum + "입니다.");
		}

	
	public void evenOdd(){   // 메인이랑 여기 있는 변수는 아~~무 상관 없음 뭐로하든
		int i = num;
		String Odd = "";
		if(i % 2 == 0){
		   Odd = "짝수";
		}else {
		   Odd = "홀수";
		}//else
		System.out.println(Odd + "입니다.");
		}//public

	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



