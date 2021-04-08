package com.javalec.base;

import com.javalec.function.DmpCellPhone;

public class Main {

	public static void main(String[] args) {
		// DmpCellPhone 의 인스턴스를 생성.
		
		
		
		DmpCellPhone dmb = new DmpCellPhone("자바폰", "검정", 10);
		//DmpCellPhone Class 에서 Constructor 매체를 받아온 경우
		System.out.println("모델 : " + dmb.model);
		System.out.println("색상 : " + dmb.color);
		System.out.println("채널 : " + dmb.channel);
		
		//CellPhone 을 상속받은 DmpCellPhone 에서 매체를 받아온 경우
			dmb.powerOn();
			dmb.bell();
			dmb.sendVoice("여보세요");
			dmb.receiveVoice("안녕하세요! 저는 홍길동 인데요");
			dmb.sendVoice("아! 반갑습니다. 그럼 안녕히~~~");
			dmb.turnOnDmb();
			dmb.changeChannelDmb(12);
			dmb.turnOffDmb();
			
		
		
		
		
		
	}

}
