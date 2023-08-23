package sec02.exam05;

public class Example {
//	Interface는 다중상속이 가능하다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();	// 자기것 밖에 참조할수 있음, 다른건 접근할수가 없음
//		ib.methodB();  // 에러남 참조 안됨
//		ib.methodC();  // 에러남 참조 안됨
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB(); // 자기것 밖에 참조할수 있음, 다른건 접근할수가 없음
//		ib.methodA();  // 에러남 참조 안됨
//		ib.methodC();  // 에러남 참조 안됨
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
