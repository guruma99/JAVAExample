package sec07.exam07.pack2;

import sec07.exam07.pack1.A;

public class C {
	public void method() {
//		A클래스의 생성자(protected) : 같은 패키지의 다른 클래스 & 자식 클래스 접급허용 
		A a = new A();
		
//		A클래스의 field(protected)==> X
		a.field = "value";
//		A클래스의 method(protected)==> X
		a.method();
	}
}
