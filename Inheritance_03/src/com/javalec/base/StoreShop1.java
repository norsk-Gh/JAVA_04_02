package com.javalec.base;

public class StoreShop1 extends StoreHQ {

	//Field
	
	//Constructor
		public StoreShop1() {
		}
	
	//Method
		
		public void menuList1() {
			System.out.println("Shop1 -------------------");
			System.out.println("김치찌개 :  4,500원");
			System.out.println("부대찌개 :  5,000원");
			super.orderBi();
			System.out.println("순대국 : 판매하지 않습니다.");
			super.orderKong();
			
		}
		
		
		
		@Override 
		public void orderKIM() {
			System.out.println("김치찌개 :  4,500원");
		}
		
		@Override 
		public void orderBU() {
			System.out.println("부대찌개 :  5,000원");
		}
	
		@Override
		public void orderBi() {
			super.orderBi();
		}
		
		@Override
		public void orderSoon() {
			System.out.println("순대국 : 판매하지 않습니다.");
		}
		
		@Override
		public void orderKong() {
			super.orderKong();
		}
		
}
