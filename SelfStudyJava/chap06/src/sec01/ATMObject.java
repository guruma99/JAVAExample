package sec01;

public class ATMObject {
// 은행계좌 속성 ==> Field
	String accNo;
	String accName;
	long balance;
	
//	public ATMObject(){} : 생성자 함수 new일 때 자동으로 호출함
	public ATMObject(String accNo, String accName, long balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
//	입금
	public void inputMoney(long money) {
		balance += money;
		System.out.println(accName + "님 현재 잔액은 " + balance + "원");
	}
	
//	출금
	public void outMoney(long money) {
		balance -= money;
		System.out.println(accName + "님 현재 잔약은 " + balance + "원");
	}
	
//	잔액조회
	public long getBalance() {
		return balance;
	}
}
