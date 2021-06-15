package 상속;

public class DmbCellPhone extends CellPhone {
	int channel;
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	void turnOnDmb(){
		System.out.println("채널" + channel + "번 DMB 방송수신 시작");
	}
	void turnOffDmb(){
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 변경");
	}
	@Override    //재정의
	//상속받은 메서드를 수정
	void powerOn() {
		super.powerOn();
		System.out.println("Dmb 전원 on");
	}

}
