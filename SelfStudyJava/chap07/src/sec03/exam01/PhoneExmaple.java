package sec03.exam01;

public class PhoneExmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		adstract 클래스이므로 객체인스턴스 생성 불가
//		추상클래스는 그것을 상속받은 클래스를 통해 사용
		SmartPhone sp = new SmartPhone("홍길동");
		
		sp.turnOn(); // Phone의 메소드
		sp.internetSearch();
		sp.turnOff(); // Phone의 메소드
	}

}
