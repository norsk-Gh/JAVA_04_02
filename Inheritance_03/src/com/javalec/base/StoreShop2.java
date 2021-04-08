package com.javalec.base;

public class StoreShop2 extends StoreHQ {

	//Field
	
	//Constructor
		public StoreShop2() {
		}
		
	//Method
		
		public void menuList2() {
			System.out.println("Shop2 -------------------");
			super.orderKIM();
			System.out.println("부대찌개 :  5,000원");
			System.out.println("비빔밥 : 5,000원");
			System.out.println("순대국 : 4,000원");
			System.out.println("공기밥 : 무료 입니다.");
			
		}
		
		@Override
		public void orderKIM() {
			super.orderKIM();
		}
	
		@Override 
		public void orderBU() {
			System.out.println("부대찌개 :  5,000원");
		}
	
		@Override
		public void orderBi() {
			System.out.println("비빔밥 : 5,000원");
		}

		@Override
		public void orderSoon() {
			System.out.println("순대국 : 4,000원");
		}
		
		@Override
		public void orderKong() {
			System.out.println("공기밥 : 무료 입니다.");
		}
		
}
