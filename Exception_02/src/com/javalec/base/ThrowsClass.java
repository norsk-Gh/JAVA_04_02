package com.javalec.base;

public class ThrowsClass {

	
	
	// Field
	
	
	
	
	
	// Constructor
	public ThrowsClass() {       //----> 아예 컨스트럭터 들어가면 메소드 자동으로 시작되게도 해준다! 메뉴만들때도 활용할 수 있었지.
		 doC();
	}
	
	// Method
	
		private void doA() throws Exception{  // --> 8버전에선.. 이거 쓰면 B에서 익셉션이 안뜸
			System.out.println("doA");     // 여기까지는 출력이 되었고..
			int []arr = {1,2,3,4};		// arr[4]는 없다! 그래서 오류가 날거임
			System.out.println(arr[4]);		// 여기서 에러가 났기때문에 출력이 되지않고 오류가 남
			System.out.println("endA");
		}
	
		private void doB() {
			System.out.println("doB");
			try {
				doA();       // --> 여기서 에러가 나면~~  밑에서 둘중에 하나 찍겠지!!
			}catch(Exception e) {
				System.out.println("Exception은 여기서");  //A 도중에 에러가 났기 때문에 여기서 두개가 출력이 된다.
				
				System.out.println(e.getMessage());
			}
			System.out.println("endB");
		}
		
		private void doC() {
			System.out.println("doC");
			doB();
			System.out.println("endC");
		}
	
	
	
}
