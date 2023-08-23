package sec03.exam03;

public class Rect extends Shape{
	double width;
	double height;
	
	Rect(double width, double height){
		this.width = width;
		this.height = height;
	}
	
//	Shape클래스에 toString()함수를 overriding을 해줌
	public String toString() {
		return "Rect";
	}
	
	public double area() {
		return width * height;
	}
}
