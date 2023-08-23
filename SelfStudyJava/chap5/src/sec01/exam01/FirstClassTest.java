package sec01.exam01;

public class FirstClassTest {
//	클래스 필드
	static int a = 0; // 정적 필드
	int b;
	
	public FirstClassTest() {
//		this.b = 10;
		a++;
		b++;
		System.out.println(b + "Constrctor");
	}
	public void method1() {
		System.out.println("static a = " + a);
	}
}
