package sec01.verify.exam04;

public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
	
	
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 - Child변환 성공");
		}else {
			System.out.println("method1-Child로 변환 되지 않음");
		}
	}
	
//	Exception : 프로그램 실행 중 발생 할 수있는 예상치 못한 상황이나 오류를 나타낸다
	public static void method2(Parent parent) {
		try {
			Child child = (Child)parent;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("method1-Child변환 성공");
	}

}
