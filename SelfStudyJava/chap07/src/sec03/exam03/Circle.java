package sec03.exam03;

public class Circle extends Shape {
	double r;
	
	Circle(double r){
		this.r = r;
	}
	
//	Shape클래스에 toString()함수를 overriding을 해줌
	public String toString() {
		return "Circle";
	}
	
	public double area() {
		return (Math.PI * r * r);
	}
}
