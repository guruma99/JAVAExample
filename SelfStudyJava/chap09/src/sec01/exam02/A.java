package sec01.exam02;

public class A {
//	static이 없다면 객체 생성후 호출할 수 있음
//	인스턴스 멤버
	int field1;
	void method1() {}
	
//	정적 멤버
	static int field2;
	static void method2() {}
	
//	A클래스 내부의 B클래스
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
// A클래스 내부의 정적 멤버의 클래스
	static class C {
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	}
}
