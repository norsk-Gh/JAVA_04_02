package com.javalec.base;

public class Child1 extends LunchMenu {
	
	// constructor
	public Child1() {
	}
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {   // generate from superclass !!!!
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	//method
	@Override
	public int calc() {     // int 로 잡아서 리턴이 있다. 
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
