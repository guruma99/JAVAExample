package sec07.exam07.pack2;
import sec07.exam07.pack1.A;

public class D extends A {
//	생성자
	public D() {
//		부모(A클래스)의 필드, 생성자, 메소드(protected) 접근 가능
		super(); // 부모(A클래스) 생성자 호출
		this.field = "value";
		this.method();
	}
}
