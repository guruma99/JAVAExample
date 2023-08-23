package sec01.exam03;

public class Computer extends Calculator {
	double areaCircle(double r) {
		System.out.println("Computer객체의 areaCircle()실행");
		return Math.PI*r*r;
	}
	
	void superMethodCall(double r) {
//		this 참조 : 내 클래스의 멤버 접근
		System.out.println(this.areaCircle(5));
	}
}
