package com.javalec.base;

public class Company_01 extends Cafe_Menu {

	//field
	
	//constructor
	public Company_01(int americano, int cafe_latte, int cafe_mocha, int orange_juice) {
		super(americano, cafe_latte, cafe_mocha, orange_juice);
		// TODO Auto-generated constructor stub
	}
	//method
	@Override
	public int calc() {
		return (americano*2) + cafe_latte;
	}

}

