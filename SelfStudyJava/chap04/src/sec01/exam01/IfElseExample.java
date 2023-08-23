package sec01.exam01;
import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score;
		
		
//		for(int i = 0; i < 5; i++) {
//			score = sc.nextInt();
//			if(score >= 60) {
//				System.out.println("Pass");
//			}else {
//				System.out.println("Fail");
//			}
//			i = i + 1;
//		}
		
		int i = 0;
		while(i<5) {
			i = i+1;
			score = sc.nextInt();
			if(score >= 60) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
		}
		
	}

}
