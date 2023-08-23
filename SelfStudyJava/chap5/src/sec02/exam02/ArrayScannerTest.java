package sec02.exam02;
import java.util.Scanner;

public class ArrayScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5명의 학생 성적을 입력 받아서 평균 구하기
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[5];
		int sum = 0;
		float avg;
		
		for(int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
//			sum += scores[i];
		}
		
//		배열에 레퍼런스 넣어줌
//		return 있는 상태로 보내 줘야함 !!
//		sum = add(scores); 메인에서의 지역변수
		sum = add(scores); 
		
//		3.0 하면 double
		avg = sum / 3;
		System.out.println("Average" + avg);
	}
	
	public static void reverse(int[] scores) {
		for(int i = 4; i >= 0; i--) {
			System.out.print(scores[i] + "   ");
		}
	}
	
//	변수 선언
//	public static int add(int[] scores) : 변수 안에서의 지역변수
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
