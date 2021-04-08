package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       							// static 이라 여기에 new 를 안쓴거다!!!
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		
		System.out.println("Child1의 식대 : " + child1.calc());
		
		// PriceTable 먼저 만들고 -> LunchMenu 구성 -> 차일드 1에서 앱스트랙트로 만들어준 런치메뉴만 가져다 줘서 쓰면 된다.
		
		
		
		
		
	}

}
