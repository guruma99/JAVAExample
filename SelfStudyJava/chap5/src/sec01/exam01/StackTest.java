package sec01.exam01;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("abc");
		String str2 = new String("def");
		
//		System.out.println(str1.charAt(1));
//		System.out.println(str2.charAt(1));
		
//		객체만들기
//		FirstClassTest : class, 틀  
//		t1: 인스턴스,t1 객체라고도 말함
		FirstClassTest t1 = new FirstClassTest();
		t1.method1();
		FirstClassTest t2 = new FirstClassTest();
		t2.method1();
		
		
//		Test();
//		System.out.println("main func");

	}
	
	public static void Test() {
		System.out.println("Test func");
	}

}
