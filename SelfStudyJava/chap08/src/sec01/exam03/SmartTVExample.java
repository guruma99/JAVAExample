package sec01.exam03;

public class SmartTVExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTelevision tv = new SmartTelevision();
		
//		부모 참조변수는 자식 객체인스턴스 참조 가능
		RemoteControl rc = tv;
		Searchable search = tv;
		
		rc.turnOn();
		search.search("https://google.com");
		
		SmartTelevision2 tv2 = new SmartTelevision2();
		RemoteControl rc2 = tv2;
		Searchable search2 = tv2;
		
		rc2.turnOn();
		search2.search("https://google.com");
		rc2.setVolume(5);
	}

}
