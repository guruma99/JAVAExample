package sec04.exam05;
//scanner는 임포트를 해줘야 한다.
//import java.util.Scanner; : import문, Scanner가 java.util 패키지에 있다는 것을 컴파일러에게 알려주는 역할
import java.util.Scanner;
public class scannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new Scanner(System.in) : 시스템의 입력 장치로 부터 읽는 Scanner를 생성하는 코드
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"" );
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
	}

}
