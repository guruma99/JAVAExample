package sec01.exam03;

public class MyClass {
//	필드
	RemoteControl rc = new Television();
	
//	생성자
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
//	메소드
	void methodA() {
//		methodA()가 끝나면 생성한 Audio의 메모리는 회수되어 사라짐
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
//	참조변수만 넘겨줌
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
