package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j =  3;
		
		System.out.println("Add : " + (i+j));
		System.out.println("Sub : " + (i-j));
		System.out.println("Mul : " + (i*j));
		
		
		try {
		System.out.println("Div : " + (i/j));     // 0같은거 넣었는데 자꾸 /by zero 같은거 나올떄..
		}catch(Exception e) {
			System.out.println(e.getMessage());  //  -->> 이건 개발자가 에러가 나지않고 에러 코드만 보여주는거
			System.out.println("숫자를 확인하세요~!");   //이건 보여주는건데 에러가 걸렸을떄 이걸 보여준다!
		}
			// 예외처리해서 한번 확인해바야한다.
		
			// 서버, DB, 인터넷 기타 등등 오류가 나도 다 여기서 나오기떄문에.. 내꺼에서 오류가 있는지 찾아내거나 하기 위해서
		
		
		
		
		
		
		
		
		
	}

}
