package sec04.exa06;

public class Rect {
	double width;
	double height;
	
	public Rect() {
		//this.width=1;
		//this.height=1;
		this(1,1);
	}
	
	public Rect(double width) {
		this(width, width);
	}
	
	public Rect(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	double areaRectangle() {
		return width*height;
	}
	
	double areaRectangle(double width) {
		return width*width;
	}
	
	double areaRectangle(double width, double height) {
		return width*height;
	}
}