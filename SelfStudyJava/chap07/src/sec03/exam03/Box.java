package sec03.exam03;

public class Box extends Rect {
	double depth;
	public Box(double width, double height, double depth) {
		super(width, height);
		this.depth = depth;
	}
	
//	Rect클래스에 toString()함수를 overriding을 해줌
	public String toString() {
		return "Box";
	}
	
	public double area() {
		return width * height * depth;
		
	}
}
