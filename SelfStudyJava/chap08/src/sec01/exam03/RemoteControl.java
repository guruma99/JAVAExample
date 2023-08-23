package sec01.exam03;

// 인터페이스 메소드를 호출하면 인터페이스는 객체의 메소드를 호출한다.
// 객체는 인터페이스에서 정의된 추상 메소드와 동일한 메소드 이름, 매개타입, 리턴타입을 가진 실체 메소드를 가지고 있어야한다.
// 이러한 객체를 인터페이스의 구현객체라고 하고, 구현 객체를 생성하는 클래스는 구현 클래스라고 한다.
public interface RemoteControl {
//	상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
//	추상메소드 메소드 선언부만 작성
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
