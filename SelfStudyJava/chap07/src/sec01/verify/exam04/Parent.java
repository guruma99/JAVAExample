package sec01.verify.exam04;

public class Parent {
//	public String name;
	protected String name;
	public String field1;
	
	public Parent() {
		
	}
	
	public Parent(String name) {
		this.name = name;
		
	}
	
	void method1() {
		System.out.println("Parent Method1~");
	}
	
	void method2() {
		System.out.println("Parent Method2~");
	}
	
//  void method3() {} :	바디만 있어도 구현됨
	
//	void method4() : 선언만 해줌
}
