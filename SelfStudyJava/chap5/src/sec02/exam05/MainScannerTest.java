package sec02.exam05;

public class MainScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("값의 개수 부족");
			System.exit(0);
		}
		
		System.out.println("parsing전 : " + (args[0] + args[1]));
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("parsing후 : " + (num1 + num2));
	}

}
