package sec02.exam02;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Bus();
		
		v.run();  // v참조자의 타입은 Vehicle이나, 생성된 객체인스턴스는 Bus
		
		// 실제 객체인스턴스 Bus이나, 왼쪽 bus참조자의 타입으로 명시적으로 타입 변환 필요, 타입을 맞춰줘야함
//		명시적으로 타입 변환 안해도 되는것 : int, double
		Bus bus = (Bus)v; 
		bus.run();
		bus.checkFare();
	}

}
