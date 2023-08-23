package sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		myCalc.execute();
		
		int[] values1 = {1,2,3};
		int result2 = myCalc.sum1(values1);
		System.out.println(result2);
		
		int result1 = myCalc.plus(50, 60);
		System.out.println("더하기 합은 " + result1);
		
		double result3 = myCalc.plus(10.5, 20.3);
		System.out.println("더하기 합은 " + result3);
		
		byte x =10, y=4;
		//double result2 = myCalc.divide(x, y);
		System.out.println("나누기 결과 " + myCalc.divide(x, y));
	}

}