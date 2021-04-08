package com.javalec.function;

public class DmpCellPhone extends CellPhone {  // 셀폰에서 상속받아온 클라스
	
	
	//field
	public int channel;
	
	
	//constructor
	public DmpCellPhone() {
	}

						// 여기 상속은 받았는데.. 어찌됐건 모델과 칼라를 알아야  메인에서 표출이 되기떄문에!!  여기서 this 로 주면 상속받았던 parent에서 받은게 갱신이 된다.
	public DmpCellPhone(String model, String color, int channel) {   // 내 필드에는 모델과칼라가 없지만.. 여기서 잡힌다! 상속받았기 떄문에
		super();
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// Method
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB방송 수신을 시작 합니다.");       //<-- 이건 컨스트럭터에서 파라미터를 받아서 나온건데.. 
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;    // 내 필드값에 정보를 주기 위한게 바로 이 this
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB방송을 종료합니다.");
	}
	

}
