package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		Car yourCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		//System.out.println("현재속도: " + myCar.speed);
		
		//필드값 직접 변경, speed가 private이라면 아래 코드는 에러
		//myCar.speed=60;
		
		//System.out.println("수정된 현재속도: " + myCar.editSpeed(60));
		
		System.out.println("제작회사: " + yourCar.company);
		System.out.println("모델명: " + yourCar.model);
		System.out.println("색깔: " + yourCar.color);
		System.out.println("최고속도: " + yourCar.maxSpeed);
		//System.out.println("현재속도: " + yourCar.speed);
	}
}

 