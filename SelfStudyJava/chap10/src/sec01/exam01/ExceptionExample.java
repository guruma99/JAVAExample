package sec01.exam01;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null;
//		System.out.println(data.toString());
		
		Scanner sc = new Scanner(System.in);
		
		try {
			int arg1 = Integer.parseInt(args[0]);
			int arg2 = Integer.parseInt(args[1]);
			int divide = arg1 / arg2;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
		}catch(NumberFormatException ee) {
			System.out.println(ee.getMessage());
			System.out.println("변환할 수 없는 값입니다. 숫자를 입력하세요.");
		}
			System.out.println("after Exception");
		
	}

}
