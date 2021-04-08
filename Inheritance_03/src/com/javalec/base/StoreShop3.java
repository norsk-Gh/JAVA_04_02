package com.javalec.base;

public class StoreShop3 extends StoreHQ {

	//Field
		
	//Constructor
	 	public StoreShop3() {
	 	}	
	
	//Method
	 	
	 	public void menuList3() {
	 		System.out.println("Shop3 -------------------");
	 		System.out.println("김치찌개 :  6,000원");
	 		System.out.println("부대찌개 :  7,000원");
	 		System.out.println("비빔밥 : 7,000원");
	 		System.out.println("순대국 : 6,000원");
	 		super.orderKong();
	 		
	 	}
	 	
	 	
		@Override 
		public void orderKIM() {
			System.out.println("김치찌개 :  6,000원");
		}
		
		@Override 
		public void orderBU() {
			System.out.println("부대찌개 :  7,000원");
		}
	
		@Override
		public void orderBi() {
			System.out.println("비빔밥 : 7,000원");
		}

		@Override
		public void orderSoon() {
			System.out.println("순대국 : 6,000원");
		}

		@Override
		public void orderKong() {
			super.orderKong();
		}
	
}
