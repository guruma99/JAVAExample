package sec04.exa06;

public class Circle {	
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
//	면적 구하기
	void areaCircle() {
		double result = Math.pow(radius, radius)*Math.PI;
		System.out.printf("반지름 %3.1f인 원의 면적은 %5.2f\n ",radius, result );
	}
	
//	원의 둘레구하기
	double roundCircle() {
		double result = 2 * Math.PI * radius;
		return result;
	}
	
//	반지름 얻어오기
	double getRadius() {
		return radius;
	}
}