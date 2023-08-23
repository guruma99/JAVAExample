package sec02.exam01;

public class Car {
	//필드
	String company="현대자동차";
	String model;
	String color;
	int maxSpeed;
	int gas;
	int speed;

	Car() {
		//this("트럭","파랑",180);
		//System.out.println("매개변수 없는 생성자");
	}
	
	Car(String model) {
		//this.model = model;
		this(model,"은색",250);
		System.out.println("매개변수 1개 생성자");
	}
	
	Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model,color,250);  //클래스 내에 다른 생성자 호출
		System.out.println("매개변수 2개 생성자");
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("매개변수 3개 생성자");
	}
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다");
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		//System.out.println(isLeftGas());
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속: " + speed + "km/h)");
		}
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}