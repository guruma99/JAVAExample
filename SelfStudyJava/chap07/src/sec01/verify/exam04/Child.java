package sec01.verify.exam04;

public class Child extends Parent {
	private int studentNo;
	public String field2;
	
	public Child() {
		
	}
	public Child(String name, int studentNo) {
//		해결 2 : 부모생성자의 super()을 묵시적 호출
//		super(name); 해결 1 : 부모생성자 명시적 호출
//		단, 혀걸 2는 부모생성자에 super()가 있어야함
//		super(name); 가장 적절한 방법
		super(name);
		 // Parent클래스의 name이 protected이므로 아래방법으로도 name초기화 가능
//		this.name = name;
		this.studentNo = studentNo;
	}
	
//	override
//	method1() 재정의
	void method1() {
		System.out.println("Child Method1~");
	}
	
//	method3() 추가
	void method3() {
		System.out.println("Child Method3~");
	}
}
