package com.javalec.base;

public abstract class Cafe_Menu {

	//field
	public int americano;
	public int cafe_latte;
	public int cafe_mocha;
	public int orange_juice;
	
	//constructor
public Cafe_Menu() {
}

public Cafe_Menu(int americano, int cafe_latte, int cafe_mocha, int orange_juice) {
	super();
	this.americano = americano;
	this.cafe_latte = cafe_latte;
	this.cafe_mocha = cafe_mocha;
	this.orange_juice = orange_juice;
}
	//method
public abstract int calc();

	
	
	
}
