package com.javalec.base;

public class StoreShop1 extends StoreHQ {    // 오오.. 앱스트랙트인 클래스를 상속받아오니 아예 이렇게 옴!
												// 팀플할때.. 만약 메소드 이름 정해주거나 할떄 이런거 편함

	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500");
	}

	@Override
	public void orderBu() {					// 그런데.. 이렇게 공백으로 두면 0원으로라도 떠왔던 것들은 사라지긴 하는데! 
											// 이거 자체를 삭제해버리면 오류가 나기떄문에 그냥 공백으로 두면된다.
		
		// TODO Auto-generated method stub

	}

	@Override
	public void orderBi() {
		// TODO Auto-generated method stub

	}

}
