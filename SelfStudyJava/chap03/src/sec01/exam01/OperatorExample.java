package sec01.exam01;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 1;
		
//		result1에는 12저장 됨 x의 값이 1증가되어 2가 된 후 10과 합해져 12가 됨 
		int result1 = ++x + 10;
//		result2이는 11저장 됨 y의 값인 1과 10이 합해져 11이 되고, 그 후에 값이 1증가 되어 2가 됨 
		int result2 = y++ + 10;
		
		System.out.println(result1);
		System.out.println(result2);
		
//		X,Y가 증가 연산식 필요로 오게 되면 바로 결과값이 오게된다.
		System.out.println(x);
		System.out.println(y);
	}
	

}


