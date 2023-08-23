package sec01.verify.exam04;

public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		부모클래스 참조변수는 자식 객체 인스턴스 참조 가능
//		자식 객체인스턴스에는 부모의 멤버(필드, 메소드) 포함되어 있음
		Parent p1 = new Parent("부모 홍길동");
		p1.method1();
		Child c1 = new Child("자식 홍기자",10011);
		c1.method2();
		Parent p2 = new Child("자식 홍기순",20011);
		p2.method3();
		
//		Child c2 = (Child)p1;
//		Child c2 = new Parent("김기자"); // 에러
	}

}
