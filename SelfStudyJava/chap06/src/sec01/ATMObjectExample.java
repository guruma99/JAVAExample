package sec01;
import java.util.Scanner;

public class ATMObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
//		ATMObject account1 = new ATMObject("100-1234","홍길동",10000); 중에 account1이건 인스턴스라 한다.
		ATMObject account1 = new ATMObject("100-1234","홍길동",10000);
		ATMObject account2 = new ATMObject("200-5678","페페",50000);
		
		System.out.println("잔액은 " + account1.getBalance());
		
		account1.inputMoney(30000);
		account2.outMoney(30000);
	}

}
