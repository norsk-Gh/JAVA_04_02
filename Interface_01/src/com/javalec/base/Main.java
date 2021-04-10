package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		SmartPhone aPhone = new APhone();
		SmartPhone bPhone = new BPhone();
		SmartPhone cPhone = new CPhone();
		SmartPhone[] smartPhone = {aPhone, bPhone, cPhone};
		
		for(int i=0; i<smartPhone.length; i++) {    // 이런식으로 배열 쓰려면 꼭 위에 interface 던, abstract이던 앞을 같게 해줘야한다.
			smartPhone[i].callSenderReceiver();
			smartPhone[i].telMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("------------------");
		}//for
		
	}

}
