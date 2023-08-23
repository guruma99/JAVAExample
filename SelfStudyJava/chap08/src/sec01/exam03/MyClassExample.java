package sec01.exam03;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1)-------------------------------");
		
		MyClass myclass1 = new MyClass();
//		rc : 객체
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		
		System.out.println("2)-------------------------------");
		
//		RemoteControl rc = new Audio();
//		MyClass myclass2 = new MyClass(rc);
//		👇 똑같은 방법
		MyClass myclass2 = new MyClass(new Audio());
		
		System.out.println("3)-------------------------------");
		
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		System.out.println("4)-------------------------------");
		
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
	}
}
