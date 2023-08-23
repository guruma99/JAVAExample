package sec07.exam07.pack1;

public class B {
	public void method() {
//		A클래스의 생성자(protected) : 같은 패키지의 다른 클래스 접급(0) 
		A a = new A(); // 같은 패키지의 더른 클래스 생성
		
//		A클래스의 field(protected): 같은 패키지의 다른 클래스 접근(0)
		a.field = "value";
//		A클래스의 method(protected): 같은 패키지의 다른 클래스 접근(0)
		a.method();
	}
}
