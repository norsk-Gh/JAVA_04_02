package com.javalec.base;

import com.javalec.function.SumEvenOdd;     // 어디 클라스에서 가져다 쓴건지 여기에 적히는건다.
import com.javalec.function.SumEvenOdd2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumEvenOdd sumEvenOdd = new SumEvenOdd();   // 새롭게 생성해서 가져와서 쓴다 .. 여기서 sumEvenOdd = object
													// 항상 new 를 써서 사용하고.. ()가 없는게 클라스고 이건 생성자이다.
		SumEvenOdd2 sumEO2 = new SumEvenOdd2();
		
		
		int i=1, j=10;
		// 결국 이제 클라이언트가 숫자를 바꾸고 싶다고하면.. 이거만 바꾸면 끝나는거임 ! 펑션에서 미리 만들어두고 여기서는 쉽게숫자만 바꾸면 된다.
		// 메인클라스는 무조건 하나이다!! 프로젝트당
		// 메인에는 수식이나 이런거 잘 안쓴다.. 
		// **** 결국은 다른데서 복잡한거 다 만들어 두고 여기선 가져다만 쓴다는거임!!!!!!!! *********
		// 이거 코딩할떄.. 클라스 내용 보면서 (옆에 띄우면서) 하는게 정상임
	
//		
//		
//		int sum = sumEvenOdd.sumCalc(i, j);   //<------ 이거 펑션 패키지에서 만들었던게 이렇게 쓸 수 있게 만들어져 온거다.. 그러면 아예 클라스를 새롭게 만든다는건데?
//					//클라스   //메소드
//		System.out.println(i + " ~ " + j + "의 합은" + sum + "입니다.");
//		
		
		sumEO2.sumCalc(i, j);
		sumEO2.evenOdd();
	
		
		
	}

}
