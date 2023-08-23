package sec05.exam02;

public class Calculator2 {
	int var1;                  //Instance Field
	static double pi=3.14159;   //static Field
	
	static int plus(int x, int y) {
		//에러: static메소드에서 non-static 멤버 var1을 접근할 수 없다
		//System.out.println(var1);   
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}