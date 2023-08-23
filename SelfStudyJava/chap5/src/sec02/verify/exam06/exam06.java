package sec02.verify.exam06;
import java.util.Scanner;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = {88, 95, 79};
		Scanner scanner = new Scanner(System.in);
		
//		while(run) : 무한루프
		while(run) {

			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
//			Scanner 클레스에서 nextLine(), nextInt(), nextDouble() : 각각 메소드에 맞게 
//			알맞는 데이터타입의 값으로 리턴 해준다.
//			이 중 문자열을 입력 받아 리턴하는 nextLine() 메소드가 많이 쓰인다.
//			이 메소드는 String 타입으로 리턴 해주는데 이것과 같은 타입의 메소드로 next()가 있다.
//			nextLine()과 next() 메소드의 차이
//			nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴한다.
//			next()메소드는 스페이스 즉 공백 전까지 입력 받은 문자열을 리턴한다
//			그래서 공백이 있는 문자열을 한줄을 리턴받고 싶으면 nextLine()메소드를 사용하고 
//			그냥 한 단어만 쓰고 싶다면 next()를 쓰는거지만 nextLine()을 써도 상관 없다.
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i = 0; i< scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
					//scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 4) {
					//System.out.println("scores[" + i + "]>");
					//scores[i] = Integer.parseInt(scanner.nextLine());
					int max = 0;
					int sum = 0;
					
					double avg = 0;
					for(int i = 0; i < scores.length; i++) {
						max = (max < scores[i]) ? scores[i] : max;
						sum += scores[i];
					}
					avg = (double) sum / studentNum;
					System.out.println("최고점수 : " + max);
					System.out.println("최고점수 : " + avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
