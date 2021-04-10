package com.javalec.base;

public class APhone implements SmartPhone {
   
	// interface 참고는 add 해서 꼭 받아아야한다.
	
	@Override
	public void callSenderReceiver() {
		System.out.println(" A phone : Possible");
		
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println(" A phone : 3G");

	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println(" A phone : Not Applied");

	}

}
