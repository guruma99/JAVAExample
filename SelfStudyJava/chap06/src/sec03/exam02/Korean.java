package sec03.exam02;

public class Korean {
//	final ==> 한번 초기화면 수정 할 수 없
	final String nation = "대한민국";
	final String name;
	String ssn;
	
	public Korean(String n, String s) {
		name = n;
		ssn = s;
		System.out.println("Constructor name : " + name);
	}
}
