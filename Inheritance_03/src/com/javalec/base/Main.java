package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] store = {"HQ", "Shop1","Shop2", "Shop3"};
	
		
		
		// 가게 이름 명시해주기
		
		
		// 가게 메뉴 나타내주기
		StoreHQ hq = new StoreHQ();
		StoreShop1 st1 = new StoreShop1();
		StoreShop2 st2 = new StoreShop2();
		StoreShop3 st3 = new StoreShop3();
		
				hq.menuList();
				st1.menuList1();
				st2.menuList2();
				st3.menuList3();
			
			// StoreHQ 앞에 쓰고 뒤에 constroctor만 다르게 하는방법
			// 컨스트럭터 자체를 배열로 묶어주고, for 문으로 store[i].orderKIM(); 으로 나열해주기
			// StoreHQ[] store = {new StoreHQ(), ~~~~~~}
		
		
	}

}
