package sec03.exam01;

public class Phone {
	// 생성자
//	owner라는 변수를 선언
//	owner 변수는 문자열을 저장함
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
