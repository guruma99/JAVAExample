package sec04.exa06;

public class CircleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(3);
		
		c1.areaCircle();
		double result = c1.roundCircle();
		System.out.printf("반지름 %3.1f인 원의 둘래: %5.2f",c1.getRadius(),result);
	}

}