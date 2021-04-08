package com.javalec.base;

public class StoreShop2 extends StoreHQ {

	@Override
	public void orderKim() {
	}

	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5,000원");
	}

	@Override
	public void orderBi() {
	}
	
	public void orderKong() {     // 기존에 있는거만 삭제하지 않고 새로운거 추가만 하는거면 오류가 나진 않는다!
		   			   			  //팀에서 만들어 놓은 규칙 이기도 하다.
		
		
	}
}
