package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	int channel;
//	상수 선언 방법
	public static final int NORMAL = 1;
	public static final int ABNORMAL = 0;
	
	DmbCellPhone(String model, String color, int channel){
//		super() 맨위에 있어야 된다.
//		super. : 속성이나 메소드
		super(model,color);
//		this.model = model;
//		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자 호출");
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB방송수신시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번 DMB방송수신시작");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송 수신 중지");
	}
	
//	메소드 오버라이딩 : 상속 받은 메소드 내부를 재정의
	void bell() {
		System.out.println("DMB벨이 울립니다.");
	}
}
