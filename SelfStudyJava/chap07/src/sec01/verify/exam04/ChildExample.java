package sec01.verify.exam04;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1"; // Parent클래스 필드, 자동타입 변환
		parent.method1();		//	Child클래스 메소드 실행
		parent.method2();		//	Parent클래스 메소드 실행
		
//		parent 참조변수는 보이지가 않음
//		field2는 Child클래스 객체인스턴스 이므로 parent클래스 참조변수 참조 불가능
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child)parent; // 강제타입 변환
		child.field2 = "yyy";
		child.method3();
	}

}
