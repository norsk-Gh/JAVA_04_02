package com.javalec.function;

public class SumEvenOdd {
	
	
	

	
	// Property   (초기값)
	
	
	
	
	
	
	// Constructor (생성자)         이클립스에서는 안만드는경우도 있는데 보통 만들어줘야함
	
	public SumEvenOdd() {
		
	};          // new 뒤에 있는게 생성자다! 팀장님이 쓰려면 new 쓰고서 써야한다.
	
	// Method (함수)
	public int sumCalc(int num1, int num2) {                // 	public 	으로 써야지 다른데서도 쓸 수 있음..private 으로 쓰면 이 클라스에서만 사용
		int sum = 0;
		for (int i=num1; i<=num2; i++) {
			sum += i;
			}
		return sum;      // 이거 의미가..sum 은 int 타입이라고 다시 돌려주는걸 뜻한다고 함 ?????????
		}

	
	public String evenOdd(int i){   // 메인이랑 여기 있는 변수는 아~~무 상관 없음 뭐로하든
		String Odd = "";
		if(i % 2 == 0){
		   Odd = "짝수";
		}else {
		   Odd = "홀수";
		}//else
		return Odd;
		}//public

	
	
	
	
	
	
	
}

