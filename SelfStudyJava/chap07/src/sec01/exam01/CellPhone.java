package sec01.exam01;

public class CellPhone {
	String model;
	String color;
	
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("CellPhone 생성자 호출");
	}
	
	void powerOn() {
		System.out.println("PowerON");
	}
	
	void powerOff() {
		System.out.println("powerOFF");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String msg) {
		System.out.println("본인 : " + msg);
	}
	
	void receiveVoice(String msg) {
		System.out.println("상대방 : " + msg);
	}
	
	void hangUp(){
		System.out.println("전화를 끊습니다.");
	}
}
