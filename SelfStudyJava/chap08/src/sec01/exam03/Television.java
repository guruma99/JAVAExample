package sec01.exam03;

public class Television implements RemoteControl {
//	필드
//	private int volume;
//	protected : 만약, 자식(SmartTelevision2)에서 volume필드를 접근 가능할려면 protected를 사용해야한다.
//	✅✅ private : 동일한 클래스 내에서만 접근 가능
	//
////	        ✅✅ protected 멤버는 아래와 같은 경우에만 접근할 수 있습니다.
////	        1. 같은 패키지 내에 있는 다른 클래스
////	        2. 해당 클래스를 상속받은 자식 클래스
	protected int volume;

//	turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

//	turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

//	setVolume() 추상 메소드의 실체 메소드
//	인터페이스 상수를 에용해서 volume필드의 값을 제한
//	int volume 이걸 안던져주면 에러난다
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼룜 : " + this.volume);
	}
}
