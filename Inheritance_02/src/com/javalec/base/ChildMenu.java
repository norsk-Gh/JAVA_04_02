package com.javalec.base;

public class ChildMenu extends ParentsMenu {

//field
	
	
	
	
//constructor
public ChildMenu() {
	
}
	
	
	
	
//method        // 메소드 고쳐서 쓰는방법 기능을 바꾸겠다!!
public void mekeBeefChung() {
	System.out.println("소고기 청국장");
}

@Override
public void makeDeon() {  // 이거 override할떄... void 먼저 쓰는게 아니라 public makeD 까지만 하고서 불러올떄!
	System.out.println("아주 시원한 얼큰 된장");
	super.makeDeon();  //-> 이게 밑에 있어야 위에 새로 고친게 나온다..
		
	}




@Override				// 이게 상속을 받는데.. 딱 여기에서만 이름은 같게 쓰고! 기능은 바꾸고 싶을떄 이거 쓴다.
public void makeChung() {
	System.out.println("냄새 없는 청국장");
}  // 이게 메소드 이름은 같지만.. parents 컨스트럭터에서 받으면 그냥 청국장


}
