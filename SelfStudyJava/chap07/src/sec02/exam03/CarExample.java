package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); // Car 객체 생성
		
//		Car 객체의 run()메소드 5번 반복 실행
		for(int i = 1; i <= 5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation){
				case 1: 
//					앞왼쪽 타이어가 펑크 났을 떄 HankookTire로 교체
					System.out.println("앞 왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2:	
//					앞오른쪽 타이어가 펑크 났을 떄 KumhoTire로 교체
					System.out.println("앞 왼쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
					break;
				case 3:
//					뒤 왼쪽 타이어가 펑크 났을 떄 HankookTire로 교체
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4:
//					뒤 오른쪽 타이어가 펑크 났을 떄 KumhoTire로 교체
					System.out.println("뒤오른쪽  KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("---------------------------------"); // 1회전시 출력되는 내용을 구분
		}
	}

}
