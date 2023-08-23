package sec04.exam01;

public class Calculator {
	void powerOn() {
		System.out.println("전원ON");
	}
	
	int sum1(int ... values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	public int plus(int x, int y) {
		System.out.println("plus \"int\" method");
		return (x+y);
	}
	
	public double plus(double x, double y) {
		System.out.println("plus \"double\" method");
		double result = x+y;
		return result;
	}
	
	double avg(int x, int y) {
		System.out.println("avg method");		
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		System.out.println("execute method");
		double result = avg(7,10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println("println method");
		System.out.println(message);
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원OFF");		
	}
}
